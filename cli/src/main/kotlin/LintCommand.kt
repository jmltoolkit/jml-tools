package io.github.jmltoolkit.cli

import com.beust.jcommander.Parameters
/**
 * @author Alexander Weigl
 * @version 1 (09.04.23)
 */
@Parameters(
    commandNames = ["lint"],
    commandDescription = "Submit usage for a given customer and subscription, accepts one usage item"
)
class LintCommand