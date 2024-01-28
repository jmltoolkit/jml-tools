package io.github.jmltoolkit.cli

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.multiple
import com.github.ajalt.clikt.parameters.types.file

/**
 * @author Alexander Weigl
 * @version 1 (09.04.23)
 */
class PrettyPrintCommand : CliktCommand("Format the JML comments inside Java files.", name = "format") {
    private val files by argument("FILES").file().multiple()
    override fun run() {}
}
