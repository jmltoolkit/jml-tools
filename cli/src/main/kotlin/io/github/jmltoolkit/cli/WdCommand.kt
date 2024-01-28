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
}
