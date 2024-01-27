package io.github.jmltoolkit.cli

import com.beust.jcommander.JCommander
import java.io.File
import java.util.*
import java.util.function.Function
import java.util.function.Predicate
import java.util.stream.Collectors

/**
 * @author Alexander Weigl
 * @version 1 (12/31/21)
 */
object Main {
    private val args = Args()

    @JvmStatic
    fun main(argv: Array<String>) {
        val j2j: J2JCommand = J2JCommand()
        val lint: LintCommand = LintCommand()
        val pp: PrettyPrintCommand = PrettyPrintCommand()
        val stat: StatCommand = StatCommand()
        val xpath: XPathCommand = XPathCommand()
        val wd: WdCommand = WdCommand()
        val jc: Unit = JCommander.newBuilder()
            .addCommand(j2j)
            .addCommand(lint)
            .addCommand(pp)
            .addCommand(stat)
            .addCommand(xpath)
            .addCommand(wd)
            .addObject(args)
            .build()
        jc.parse(argv)

        val config: ParserConfiguration = createParserConfiguration(args)

        //Collection<? extends Node> nodes = parse(args.files, config);
        val parsedCmdStr: String = jc.getParsedCommand()
        if (parsedCmdStr == null) {
            System.err.println("Invalid command: $parsedCmdStr")
            jc.usage()
        } else {
            when (parsedCmdStr) {
                "pp" -> pp.run()
                "wd" -> wd.run()
                else -> {
                    System.err.println("Invalid command: $parsedCmdStr")
                    jc.usage()
                }
            }
        }
    }

    private fun lint(nodes: Collection<Node?>) {
        val lconfig: JmlLintingConfig = createLinterConfiguration(args)
        val problems: Unit = JmlLintingFacade(lconfig).lint(nodes)
        for (problem in problems) {
            report(problem)
        }
    }

    private fun createLinterConfiguration(args: Args): JmlLintingConfig {
        return JmlLintingConfig()
    }

    fun parse(files: List<String?>, config: ParserConfiguration): Collection<CompilationUnit> {
        val expanded: MutableList<File> = ArrayList(files.size * 10)
        for (file in files) {
            val f = File(file)
            if (f.isDirectory) {
                expandDirectory(expanded, f)
            } else {
                expanded.add(f)
            }
        }

        return expanded.parallelStream()
            .map<Any>(Function<File, Any> { it: File -> parse(it, config) })
            .map(Function<Any, R?> { obj: Any? -> reportOnError() })
            .filter(Predicate<R> { obj: R? -> Objects.nonNull(obj) })
            .collect<Collection<CompilationUnit>, Any>(Collectors.toList<Any>())
    }

    private fun reportOnError(it: ParseResult<CompilationUnit>): CompilationUnit? {
        val result: Optional<CompilationUnit> = it.getResult()
        if (it.isSuccessful() && result.isPresent()) {
            return result.get()
        }
        for (problem in it.getProblems()) {
            report(problem)
        }
        return null
    }

    private fun report(problem: Problem) {
        System.out.println(problem.toString())
    }

    private fun report(problem: LintProblem) {
        System.out.println(problem.toString())
    }

    private fun expandDirectory(target: MutableCollection<File>, dir: File) {
        val files = dir.listFiles()
        if (files != null) {
            for (file in files) {
                if (file.isDirectory) {
                    expandDirectory(target, file)
                } else {
                    if (file.name.endsWith(".java")) {
                        target.add(file)
                    }
                }
            }
        }
    }

    private fun parse(file: File, configuration: ParserConfiguration): ParseResult<CompilationUnit>? {
        val p: JavaParser = JavaParser(configuration)
        try {
            return p.parse(file)
        } catch (e: FileNotFoundException) {
            report(Problem("File not found", null, e))
            return null
        }
    }

    private fun createParserConfiguration(args: Args): ParserConfiguration {
        val config: ParserConfiguration = ParserConfiguration()
        config.getJmlKeys().add(ArrayList<E>(args.activeJmlKeys))
        config.setProcessJml(!args.disableJml)
        return config
    }

    internal class Args {
        @Parameter(names = ["--jml-keys"])
        internal val activeJmlKeys: List<String> = ArrayList()


        @Parameter(names = ["-verbose"], description = "Level of verbosity")
        private val verbose = 1

        @Parameter(names = ["--disable-jml"])
        val disableJml: Boolean = false
    }
}
