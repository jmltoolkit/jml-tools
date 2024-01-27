package io.github.jmltoolkit.smt

import com.github.javaparser.ast.body.Parameter
import java.math.BigInteger

/**
 * @author Alexander Weigl
 * @version 1 (01.07.22)
 */
open class BitVectorArithmeticTranslator(val smtLog: SmtQuery) : ArithmeticTranslator {
    var cnt: Int = 0

    override fun binary(operator: BinaryExpr.Operator?, left: SExpr, right: SExpr): SExpr? {
        when (operator) {
            IMPLICATION -> return term.impl(left, right)
            SUBTYPE -> {}
            RANGE -> {}
            SUB_LOCK -> {}
            SUB_LOCKE -> {}
            RIMPLICATION -> return term.impl(right, left)
            EQUIVALENCE -> return term.equiv(left, right)
            ANTIVALENCE -> return term.not(term.equiv(left, right))
            OR -> return term.or(left, right)
            AND -> return term.and(left, right)
            BINARY_OR -> return term.bor(left, right)
            BINARY_AND -> return term.band(left, right)
            XOR -> return term.xor(left, right)
            EQUALS -> return term.equality(left, right)
            NOT_EQUALS -> return term.not(term.equality(left, right))
            LESS -> return term.lessThan(left, right)
            GREATER -> return term.greaterThan(left, right)
            LESS_EQUALS -> return term.lessOrEquals(left, right, true)
            GREATER_EQUALS -> return term.greaterOrEquals(left, right, true)
            LEFT_SHIFT -> return term.shiftLeft(left, right)
            SIGNED_RIGHT_SHIFT -> return term.shiftRight(left, right, true)
            UNSIGNED_RIGHT_SHIFT -> return term.shiftRight(left, right, true)
            PLUS -> return term.add(left, right)
            MINUS -> return term.subtract(left, right)
            MULTIPLY -> return term.multiply(left, right)
            DIVIDE -> return term.divide(left, right, true)
            REMAINDER -> return term.modulo(left, right, true)

        }
        return null
    }

    override fun makeChar(n: CharLiteralExpr): SExpr? {
        return term.makeBitvector(16, n.getValue().charAt(0))
    }

    override fun unary(operator: UnaryExpr.Operator?, accept: SExpr): SExpr? {
        when (operator) {
            PLUS, POSTFIX_INCREMENT, POSTFIX_DECREMENT -> return accept
            MINUS -> return term.negate(accept)
            PREFIX_INCREMENT -> return term.add(accept, term.makeBitvector(32, 1))
            PREFIX_DECREMENT -> return term.subtract(accept, term.makeBitvector(32, 1))
            LOGICAL_COMPLEMENT -> return term.not(accept)
            BITWISE_COMPLEMENT -> return term.not(accept)
        }
        return accept
    }

    override fun makeLong(n: LongLiteralExpr): SExpr? {
        return term.makeBitvector(64, n.asLong())
    }

    override fun makeInt(n: IntegerLiteralExpr): SExpr? {
        return term.makeBitvector(32, n.asInt())
    }

    override fun makeInt(i: BigInteger): SExpr? {
        return term.makeBitvector(32, i)
    }

    override fun makeIntVar(): SExpr? {
        val name = "__RAND_" + (++cnt)
        smtLog.declareConst(name, SmtType.BV32)
        return term.symbol(name)
    }

    override fun getVariable(jmlBoundVariable: Parameter): SExpr? {
        val rType: ResolvedType = jmlBoundVariable.getType().resolve()
        return term.list(null, null, jmlBoundVariable.getNameAsString(), term.type(getType(rType)))
    }

    override fun makeBoolean(value: Boolean): SExpr? {
        return term.makeBoolean(value)
    }

    override fun getType(type: ResolvedType): SmtType {
        if (type.isPrimitive()) {
            val rType: ResolvedPrimitiveType = type.asPrimitive()
            return getPrimitiveType(rType)
        }

        if (type.isArray()) {
            val aType: ResolvedArrayType = type.asArrayType()
            val cType: SmtType = getType(aType.getComponentType())
            val intType: SmtType = getType(ResolvedPrimitiveType.INT)
            return Array(intType, cType)
        }

        if (type.isReferenceType()) {
            return SmtType.JAVA_OBJECT
        }

        throw RuntimeException("Unsupported type")
    }

    override fun arrayLength(obj: SExpr?): SExpr? {
        return term.list(ResolvedPrimitiveType.INT, SmtType.BV32, term.symbol("bv\$length"), obj)
    }

    override fun makeInt(i: Long): SExpr {
        return makeInt(BigInteger.valueOf(i))
    }

    override fun makeVar(rtype: ResolvedType?): SExpr? {
        return null
    }

    open fun getPrimitiveType(rType: ResolvedPrimitiveType?): SmtType {
        when (rType) {
            BOOLEAN -> return SmtType.BOOL
            BYTE -> return SmtType.BV8
            SHORT -> return SmtType.BV16
            CHAR -> return SmtType.BV16
            INT -> return SmtType.BV32
            LONG -> return SmtType.BV64
            FLOAT -> return SmtType.FP32
            DOUBLE -> return SmtType.FP64
        }
        return SmtType.BV8
    }

    companion object {
        private val term: SmtTermFactory = SmtTermFactory.INSTANCE
    }
}
