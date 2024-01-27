package com.github.jmlparser.lint

import com.github.javaparser.TokenRange

/**
 * @author Alexander Weigl
 * @version 1 (13.10.22)
 */
class LintProblem(
    level: String,
    message: String,
    location: TokenRange?,
    cause: Throwable?,
    category: String?,
    ruleId: String
) {
    constructor(level: String, message: String, location: TokenRange?, ruleId: String) : this(
        level,
        message,
        location,
        null,
        null,
        ruleId
    )

    var level: String
    var message: String
    val location: TokenRange?
    val cause: Throwable?
    val category: String?
    val ruleId: String

    init {
        this.id = id
        this.message = message
        this.level = level
        this.level = level
        this.message = message
        this.location = location
        this.cause = cause
        this.category = category
        this.ruleId = ruleId
    }
}
