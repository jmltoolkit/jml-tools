package com.github.jmlparser.lint

import lombok.Data

/**
 * @author Alexander Weigl
 * @version 1 (12/29/21)
 */
@Data
class JmlLintingConfig {
    private val checkNameClashes = true
    private val checkMissingNames = true

    fun isDisabled(lintRule: LintRule?): Boolean {
        return false
    }
}
