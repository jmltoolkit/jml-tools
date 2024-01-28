package io.github.jmltoolkit.cli

import com.github.javaparser.JavaParser
import com.github.javaparser.ParserConfiguration
import com.github.javaparser.ast.expr.Expression
import io.github.jmltoolkit.smt.ArithmeticTranslator
import io.github.jmltoolkit.smt.BitVectorArithmeticTranslator
import io.github.jmltoolkit.smt.SmtQuery
import io.github.jmltoolkit.smt.SmtTermFactory
import io.github.jmltoolkit.smt.model.SExpr
import io.github.jmltoolkit.smt.solver.SolverAnswer
import io.github.jmltoolkit.wd.WDVisitor
import io.github.jmltoolkit.wd.WDVisitorExpr
import java.util.*

/**
 * @author Alexander Weigl
 * @version 1 (09.04.23)
 */
class WdCommand : FileBasedCommand("Well-definedness check for JML files.", name = "wd") {
    override fun run() {
        val config = ParserConfiguration()
        config.setProcessJml(true)
        config.setKeepJmlDocs(true)
        for (activeJmlKey in activeJmlKeys) {
            val activeJmlKeys = activeJmlKey.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            config.jmlKeys.add(Arrays.asList(*activeJmlKeys))
        }

        if (activeJmlKeys.isEmpty()) {
            config.jmlKeys.add(listOf("key"))
        }
        val wd = WDVisitor()
    }

    fun isWelldefined(expr: String?): Boolean {
        val config = ParserConfiguration()
        config.setProcessJml(false)
        val parser = JavaParser(config)
        return isWelldefined(parser, expr)
    }

    fun isWelldefined(parser: JavaParser, expr: String?): Boolean {
        val e = parser.parseJmlExpression<Expression>(expr)
        if (e.isSuccessful && e.result.isPresent) {
            return isWelldefined(e.result.get())
        }
        return false
    }

    private fun isWelldefined(e: Expression): Boolean {
        val query = SmtQuery()
        val translator: ArithmeticTranslator = BitVectorArithmeticTranslator(query)
        val visitor = WDVisitorExpr(query, translator)
        val res: SExpr = e.accept(visitor, null)
        if ("true" == res.toString()) {
            return true
        }
        query.addAssert(SmtTermFactory.not(res))
        query.checkSat()
        val solver = io.github.jmltoolkit.smt.solver.Solver()
        val ans: SolverAnswer = solver.run(query)
        System.out.println(query.toString())
        System.out.println(ans.toString())
        ans.consumeErrors()
        return ans.isSymbol("unsat")
    }
}
