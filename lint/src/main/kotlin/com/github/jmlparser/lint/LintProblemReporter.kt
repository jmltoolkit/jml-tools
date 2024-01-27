package com.github.jmlparser.lint

import com.github.javaparser.TokenRange
import java.util.function.Consumer

/**
 * @author Alexander Weigl
 * @version 1 (13.10.22)
 */
class LintProblemReporter(problemConsumer: Consumer<LintProblem>) {
    private val problemConsumer: Consumer<LintProblem> = problemConsumer

    fun warn(node: NodeWithTokenRange<*>, category: String?, ruleId: String, message: String?, vararg args: Any?) {
        report(LintRule.WARN, node.getTokenRange().orElse(null), category, ruleId, message, args)
    }

    fun hint(node: NodeWithTokenRange<*>, category: String?, ruleId: String, message: String?, vararg args: Any?) {
        report(LintRule.HINT, node.getTokenRange().orElse(null), category, ruleId, message, args)
    }

    fun error(node: NodeWithTokenRange<*>, category: String?, ruleId: String, message: String?, vararg args: Any?) {
        report(LintRule.ERROR, node.getTokenRange().orElse(null), category, ruleId, message, args)
    }

    fun report(
        level: String,
        range: TokenRange?,
        category: String?,
        ruleId: String,
        message: String?,
        vararg args: Any?
    ) {
        problemConsumer.accept(LintProblem(level, f(message, args), range, null, category, ruleId))
    }

    fun report(lintProblem: LintProblem) {
        problemConsumer.accept(lintProblem)
    }
}

