package com.github.jmlparser.lint.rules

import com.github.javaparser.ast.Jmlish
import java.util.function.Predicate

/**
 * @author Alexander Weigl
 * @version 1 (19.02.22)
 */
class JavaContainsJmlConstruct : Validator {
    fun accept(node: Node, problemReporter: ProblemReporter) {
        accept(node, false, problemReporter)
    }

    private fun accept(current: Node, inJml: Boolean, problemReporter: ProblemReporter) {
        val openJml: Predicate<Node> = Predicate<Node> { it: Node? ->
            it is JmlBodyDeclaration ||
                    it is JmlStatement
        }

        if (!inJml && (current is Jmlish) && !openJml.test(current)) {
            problemReporter.report(current, "Jml construct used in Java part")
            return
        }

        for (it in current.getChildNodes()) {
            accept(it, inJml || openJml.test(current), problemReporter)
        }
    }
}
