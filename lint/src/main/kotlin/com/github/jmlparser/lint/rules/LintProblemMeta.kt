package com.github.jmlparser.lint.rules

import com.github.javaparser.ast.Node

/**
 * @author Alexander Weigl
 * @version 1 (21.10.22)
 */
@JvmRecord
data class LintProblemMeta(val id: String, val message: String, val level: String) {
    fun create(n: NodeWithTokenRange<Node?>): LintProblem {
        return LintProblem(level, message, n.getTokenRange().orElse(null), null, id, "")
    }
}
