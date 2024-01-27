package io.github.jmltoolkit.smt

import com.github.javaparser.resolution.types.ResolvedPrimitiveType
import java.math.BigInteger

/**
 * @author Alexander Weigl
 * @version 1 (07.08.22)
 */
class SmtTermFactory {
    private val symbolAndValueCache: Cache<String, SAtom> = CacheBuilder.newBuilder().softValues().build()

    //region boolean operators
    fun and(vararg terms: SExpr?): SExpr {
        return fnApply(ResolvedPrimitiveType.BOOLEAN, SmtType.BOOL, "and", terms)
    }

    fun and(seq: List<SExpr?>): SExpr {
        return and(seq.toArray(arrayOfNulls<SExpr>(0)))
    }

    fun or(vararg terms: SExpr?): SExpr {
        return fnApply(ResolvedPrimitiveType.BOOLEAN, SmtType.BOOL, "or", terms)
    }

    fun impl(premise: SExpr?, concl: SExpr?): SExpr {
        return fnApply(ResolvedPrimitiveType.BOOLEAN, SmtType.BOOL, "=>", premise, concl)
    }

    //endregion
    fun ite(cond: SExpr, then: SExpr, otherwise: SExpr): SExpr {
        return fnApply(then.getJavaType(), then.getSmtType(), "ite", cond, then, otherwise)
    }

    fun fnApply(javaType: ResolvedType?, smtType: SmtType?, fn: String?, arg: SExpr?): SExpr {
        return SList(smtType, javaType, symbol(fn), arg)
    }

    private fun fnApply(javaType: ResolvedType?, smtType: SmtType, fn: String, arg1: SExpr?, arg2: SExpr?): SExpr {
        return SList(smtType, javaType, symbol(fn), arg1, arg2)
    }

    private fun fnApply(
        javaType: ResolvedType,
        smtType: SmtType,
        fn: String,
        arg1: SExpr,
        arg2: SExpr,
        arg3: SExpr
    ): SExpr {
        return SList(smtType, javaType, symbol(fn), arg1, arg2, arg3)
    }

    private fun fnApply(javaType: ResolvedType, smtType: SmtType, fn: String, vararg args: SExpr?): SExpr {
        return list(javaType, smtType, symbol(fn), args)
    }


    @SneakyThrows
    fun symbol(fn: String?): SAtom {
        return symbolAndValueCache.get(fn) { SAtom(SmtType.SYMBOL, null, fn) }
    }

    fun forall(variables: List<SExpr?>, formula: SExpr?): SExpr {
        return fnApply(ResolvedPrimitiveType.BOOLEAN, SmtType.BOOL, "forall", list(variables), formula)
    }

    fun exists(variables: List<SExpr?>, formula: SExpr?): SExpr {
        return fnApply(ResolvedPrimitiveType.BOOLEAN, SmtType.BOOL, "exists", list(variables), formula)
    }


    fun list(javaType: ResolvedType?, smtType: SmtType?, symbol: SAtom?, args: Array<SExpr?>?): SExpr {
        val nargs: Array<SExpr?> = arrayOfNulls<SExpr>(args!!.size + 1)
        nargs[0] = symbol
        System.arraycopy(args, 0, nargs, 1, args!!.size)
        return SList(smtType, javaType, nargs)
    }

    fun list(variables: List<SExpr?>): SExpr {
        val args: Array<SExpr> = variables.toArray(arrayOfNulls<SExpr>(0))
        return SList(null, null, args)
    }

    //region polymorphic operators
    fun bor(left: SExpr, right: SExpr): SExpr {
        if (isBool(left, right)) return or(left, right)
        if (isBv(left, right)) return bvor(left, right)
        return typeException()
    }


    fun add(left: SExpr, right: SExpr?): SExpr {
        if (isInt(left, right)) return iadd(left, right)
        if (isBv(left, right)) return bvadd(left, right)
        return typeException()
    }

    fun subtract(left: SExpr, right: SExpr?): SExpr {
        if (isInt(left, right)) return isubstract(left, right)
        if (isBv(left, right)) return bvsubstract(left, right)
        return typeException()
    }

    fun modulo(left: SExpr, right: SExpr?, b: Boolean): SExpr {
        if (isInt(left, right)) return imodulo(left, right)
        if (isBv(left, right)) return bvmodulo(left, right)
        return typeException()
    }

    fun shiftLeft(left: SExpr, right: SExpr?): SExpr {
        if (isBv(left, right)) return bvshiftLeft(left, right)
        return typeException()
    }


    fun shiftRight(left: SExpr, right: SExpr?, sign: Boolean): SExpr {
        if (isBv(left, right)) return bvshiftRight(left, right, sign)
        return typeException()
    }

    fun lessOrEquals(left: SExpr, right: SExpr?, sign: Boolean): SExpr {
        if (isInt(left, right)) return ilessOrEquals(left, right)
        if (isBv(left, right)) return bvlessOrEquals(left, right)
        return typeException("Could not handle types '%s <= %s'", left.getSmtType(), right.getSmtType())
    }

    fun greaterOrEquals(left: SExpr, right: SExpr?, b: Boolean): SExpr {
        if (isInt(left, right)) return igreaterOrEquals(left, right)
        if (isBv(left, right)) return bvgreaterOrEquals(left, right)
        return typeException()
    }

    fun lessThan(left: SExpr, right: SExpr): SExpr {
        if (isInt(left, right)) return ilessThan(left, right)
        if (isBv(left, right)) return bvlessThan(left, right)
        return typeException("Could not handle types '%s <%s'", left.getSmtType(), right.getSmtType())
    }

    fun equiv(left: SExpr?, right: SExpr?): SExpr {
        return fnApply(ResolvedPrimitiveType.BOOLEAN, SmtType.BOOL, "=", left, right)
    }

    fun not(expr: SExpr?): SExpr {
        if (isBv(expr)) return bvnot(expr)
        if (isBool(expr)) return fnApply(ResolvedPrimitiveType.BOOLEAN, SmtType.BOOL, "not", expr)
        return typeException()
    }


    fun xor(left: SExpr?, right: SExpr?): SExpr {
        return fnApply(ResolvedPrimitiveType.BOOLEAN, SmtType.BOOL, "xor", left, right)
    }

    fun equality(left: SExpr?, right: SExpr?): SExpr {
        return fnApply(ResolvedPrimitiveType.BOOLEAN, SmtType.BOOL, "=", left, right)
    }

    fun band(left: SExpr, right: SExpr): SExpr {
        if (isBool(left, right)) return and(left, right)

        if (isBv(left, right)) return bvand(left, right)

        return typeException()
    }


    private fun fnApplyToBool(symbol: String, left: SExpr, right: SExpr?): SExpr {
        return fnApply(ResolvedPrimitiveType.BOOLEAN, SmtType.BOOL, symbol, left, right)
    }

    fun greaterThan(left: SExpr, right: SExpr): SExpr {
        if (isInt(left, right)) return igreaterThan(left, right)
        if (isBv(left, right)) return bvgreaterThan(left, right)
        return typeException("Could not handle types '%s > %s'", left.getSmtType(), right.getSmtType())
    }


    fun negate(sexpr: SExpr?): SExpr {
        if (isBool(sexpr)) return not(sexpr)
        if (isBv(sexpr)) return bvnegate(sexpr)
        return typeException()
    }


    fun multiply(left: SExpr, right: SExpr?): SExpr {
        if (isInt(left, right)) return imultiply(left, right)
        if (isBv(left, right)) return bvmultiply(left, right)
        return typeException()
    }

    fun divide(left: SExpr, right: SExpr?, b: Boolean): SExpr {
        if (isInt(left, right)) return idivide(left, right)
        if (isBv(left, right)) return bvdivide(left, right)
        return typeException()
    }


    //endregion
    //region integer operations
    @SneakyThrows
    fun intValue(svalue: String?): SAtom {
        return symbolAndValueCache.get(svalue) { SAtom(SmtType.INT, ResolvedPrimitiveType.INT, svalue) }
    }

    @SneakyThrows
    fun intValue(value: Long): SAtom {
        return intValue("" + value)
    }

    @SneakyThrows
    fun intValue(value: BigInteger): SAtom {
        return intValue("" + value)
    }

    fun iadd(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToInt("+", left, right)
    }

    fun ilessThan(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBool("<", left, right)
    }

    fun ilessOrEquals(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBool("<=", left, right)
    }

    fun igreaterThan(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBool(">", left, right)
    }

    fun igreaterOrEquals(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBool(">=", left, right)
    }

    fun isubstract(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToInt("-", left, right)
    }

    fun imultiply(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToInt("*", left, right)
    }

    fun intType(): SExpr {
        return symbol("Int")
    }

    fun imodulo(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToInt("mod", left, right)
    }

    fun idivide(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToInt("/", left, right)
    }

    //endregion
    //region bit vectors
    fun bvor(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBV("bvor", left, right)
    }

    fun bvnot(expr: SExpr?): SExpr {
        return fnApplyToBV("bvnot", expr)
    }

    fun bvnegate(sexpr: SExpr?): SExpr {
        return fnApplyToBV("bvneg", sexpr)
    }

    fun bvlessThan(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBool("bvslt", left, right)
    }

    fun bvlessOrEquals(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBool("bvsle", left, right)
    }

    fun bvgreaterThan(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBool("bvsgt", left, right)
    }

    fun bvgreaterOrEquals(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBool("bvsge", left, right)
    }

    fun bvshiftRight(left: SExpr, right: SExpr?, sign: Boolean): SExpr {
        return fnApplyToBV(if (sign) "bvashr" else "bvshr", left, right)
    }

    fun bvshiftLeft(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBV("bvshl", left, right)
    }

    fun bvand(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBV("bvand", left, right)
    }

    fun bvadd(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBV("bvadd", left, right)
    }

    private fun bvsubstract(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBV("bvsub", left, right)
    }

    private fun bvmultiply(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBV("bvmul", left, right)
    }

    private fun bvdivide(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBV("bvsdiv", left, right)
    }

    private fun bvmodulo(left: SExpr, right: SExpr?): SExpr {
        return fnApplyToBV("bvsrem", left, right)
    }

    private fun fnApplyToBV(symbol: String, left: SExpr?): SExpr {
        return fnApply(null, left.getSmtType(), symbol, left)
    }


    fun makeBitvector(width: Int, value: Long): SExpr {
        return makeBitvector(width, BigInteger.valueOf(value))
    }


    fun makeBitvector(width: Int, value: BigInteger): SExpr {
        val type: BitVec = SmtType.getBitVec(width)
        return SList(
            type, null,
            SList(null, null, symbol("_"), symbol("int2bv"), symbol("" + width)),
            intValue(value)
        )
    }


    fun bvType(width: Int): SExpr {
        return SList(SmtType.TYPE, null, symbol("_"), symbol("BitVec"), intValue(width.toLong()))
    }

    //endregion
    private fun isBool(sexpr: SExpr?): Boolean {
        return sexpr.getSmtType() === SmtType.BOOL
    }

    private fun isBool(left: SExpr, right: SExpr): Boolean {
        return left.getSmtType() === right.getSmtType() && isBool(left)
    }

    private fun isBv(left: SExpr, right: SExpr?): Boolean {
        return left.getSmtType() === right.getSmtType() && isBv(left)
    }

    private fun isBv(left: SExpr?): Boolean {
        return left.getSmtType() is BitVec
    }

    private fun isInt(left: SExpr, right: SExpr?): Boolean {
        return left.getSmtType() === right.getSmtType() && isInt(left)
    }

    private fun isInt(left: SExpr): Boolean {
        return left.getSmtType() === SmtType.INT
    }

    private fun typeException(): SExpr {
        throw RuntimeException("Type mismatch!")
    }


    private fun fnApplyToInt(symbol: String, left: SExpr, right: SExpr?): SExpr {
        return fnApply(ResolvedPrimitiveType.INT, SmtType.INT, symbol, left, right)
    }

    private fun fnApplyToBV(symbol: String, left: SExpr, right: SExpr?): SExpr {
        return fnApply(null, left.getSmtType(), symbol, left, right)
    }


    fun fpType(width: Int): SExpr {
        return SList(SmtType.TYPE, null, symbol("_"), symbol("FloatingPoint"), intValue(width.toLong()))
    }

    fun arrayType(from: SExpr?, to: SExpr?): SExpr {
        return SList(SmtType.TYPE, null, symbol("Array"), from, to)
    }


    fun list(javaType: ResolvedType?, stype: SmtType?, vararg args: Any): SExpr {
        val nargs: Array<SExpr?> = arrayOfNulls<SExpr>(args.size)
        for (i in args.indices) {
            val arg = args[i]
            if (arg is SExpr) nargs[i] = arg as SExpr
            else if (arg is String) nargs[i] = symbol(arg)
            else typeException("Unhandled type %s", arg.javaClass)
        }
        return SList(stype, javaType, nargs)
    }

    fun makeTrue(): SExpr {
        return makeBoolean(true)
    }


    fun makeFalse(): SExpr {
        return makeBoolean(false)
    }

    @SneakyThrows
    fun makeBoolean(value: Boolean): SExpr {
        val v = if (value) "true" else "false"
        return symbolAndValueCache.get(v) { SAtom(SmtType.BOOL, ResolvedPrimitiveType.BOOLEAN, v) }
    }

    fun makeInt(value: String?): SExpr {
        return intValue(value)
    }

    fun makeNull(): SExpr {
        return symbol("null")
    }

    fun makeThis(): SExpr {
        return symbol("this")
    }

    fun makeSuper(): SExpr {
        return symbol("super")
    }

    fun boolType(): SExpr {
        return symbol("Bool")
    }

    fun javaObjectType(): SExpr {
        return symbol("Object")
    }

    fun type(type: SmtType?): SExpr {
        if (type === SmtType.JAVA_OBJECT) return javaObjectType()
        if (type === SmtType.INT) return intType()
        if (type === SmtType.REAL) return realType()
        if (type === SmtType.FP32) return fpType(32)
        if (type === SmtType.FP64) return fpType(64)
        if (type === SmtType.BOOL) return boolType()
        if (type is SmtType.Array) return arrayType(
            type((type as SmtType.Array?).from),
            type((type as SmtType.Array?).to)
        )
        if (type is BitVec) return bvType((type as BitVec?).width)

        return typeException()
    }


    private fun realType(): SExpr {
        return symbol("Int")
    }

    fun `var`(type: SmtType?, javaType: ResolvedType?, name: String?): SExpr {
        //nocache, conflict in type could be created
        return SAtom(type, javaType, name)
    }

    @SneakyThrows
    fun command(symbol: String?, vararg args: SExpr?): SExpr {
        return fnApply(null, SmtType.COMMAND, symbol, args)
    }

    fun select(stype: SmtType?, javaType: ResolvedType?, array: SExpr?, index: SExpr?): SExpr {
        return list(javaType, stype, symbol("select"), array, index)
    }

    fun store(array: SExpr?, index: SExpr?, value: SExpr?): SExpr {
        return list(array.getJavaType(), array.getSmtType(), symbol("store"), array, index, value)
    }

    fun fieldAccess(javaType: ResolvedType?, stype: SmtType?, field: String?, obj: SExpr?): SExpr {
        return fnApply(javaType, stype, field, obj)
    }

    private fun typeException(fmt: String, vararg args: Any): SExpr {
        throw RuntimeException(String.format(fmt, *args))
    }

    fun let(vars: List<SExpr?>, body: SExpr): SExpr {
        return list(body.getJavaType(), body.getSmtType(), "let", list(vars), body)
    }

    fun nonNull(expr: SExpr?): SExpr {
        return not(equality(expr, makeNull()))
    }

    fun binder(type: SmtType?, name: String?): SExpr {
        return list(null, null, name, type(type))
    }

    companion object {
        val INSTANCE: SmtTermFactory = SmtTermFactory()
    }
}
