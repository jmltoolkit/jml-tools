package com.github.jmlparser.lint.rules

import com.github.jmlparser.lint.LintRuleVisitor

/**
 * @author Alexander Weigl
 * @version 1 (12/29/21)
 */
object LocationSetValidator : LintRuleVisitor() {
    const val ASSIGNABLE_ARRAY_ONLY: String = "You can only use '[*]' on arrays"
    const val ASSIGNABLE_CLASS_ONLY: String = "You can only use '.*' on classes and interfaces"
}
