package io.github.jmltoolkit.cli

import com.beust.jcommander.Parameter
import java.io.File

/**
 * @author Alexander Weigl
 * @version 1 (09.04.23)
 */
@Parameters(
    commandNames = ["jml2java"],
    commandDescription = "Submit usage for a given customer and subscription, accepts one usage item"
)
class J2JCommand {
    @Parameter(names = ["-o", "--output"], description = "Output folder of the Java Files")
    private val outputFolder = File("out")

    @Parameter(names = ["--jbmc"], description = "JBMC mode")
    private val jjbmcMode = false

    @Parameter(description = "FILES")
    private val files: List<String> = ArrayList()
}
