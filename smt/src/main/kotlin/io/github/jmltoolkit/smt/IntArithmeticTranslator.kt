package io.github.jmltoolkit.smt

import com.github.javaparser.ast.expr.CharLiteralExpr
import java.math.BigInteger

/**
 * @author Alexander Weigl
 * @version 1 (07.08.22)
 */
class IntArithmeticTranslator(smtLog: SmtQuery) : BitVectorArithmeticTranslator((smtLog)) {
    private val term: SmtTermFactory = SmtTermFactory.INSTANCE

    override fun makeChar(n: CharLiteralExpr): SExpr? {
        return term.makeInt("" + n.asChar() as Int)
    }

    override fun makeLong(n: LongLiteralExpr): SExpr? {
        return term.makeInt("" + n.getValue())
    }

    override fun makeInt(n: IntegerLiteralExpr): SExpr? {
        return term.makeInt("" + n.getValue())
    }

    override fun makeInt(i: BigInteger): SExpr? {
        return term.makeInt(i.toString())
    }

    override fun makeIntVar(): SExpr? {
        val name = "__RAND_" + (++cnt)
        smtLog.declareConst(name, SmtType.BV32)
        return term.symbol(name)
    }

    override fun getPrimitiveType(rType: ResolvedPrimitiveType?): SmtType {
        when (rType) {
            FLOAT, DOUBLE -> return SmtType.REAL
        }
        return SmtType.INT
    }

    override fun arrayLength(obj: SExpr?): SExpr? {
        return term.list(ResolvedPrimitiveType.INT, SmtType.INT, term.symbol("int\$length"), obj)
    }
}
