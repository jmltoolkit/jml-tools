package com.github.jmlparser.lint

import com.github.javaparser.ast.Node
import java.net.URI
import java.net.URISyntaxException
import java.util.*
import java.util.function.Consumer
import java.util.function.Function
import java.util.stream.Collectors

/**
 * @author Alexander Weigl
 * @version 1 (12/29/21)
 */
class JmlLintingFacade(config: JmlLintingConfig) {
    @Getter
    private val linters: List<LintRule>
    private val config: JmlLintingConfig

    init {
        linters = getLinter(config)
        this.config = config
    }

    private val sarifTool: Tool
        get() = Tool(
            ToolComponent().withVersion(VERSION).withName(NAME)
                .withShortDescription(MultiformatMessageString().withText("Linting for the Java Modeling Language")),
            linters.stream().map<Any>(Function<LintRule, Any> { it: LintRule ->
                ToolComponent().withFullName(
                    it.getClass().getName()
                )
            }).collect(
                Collectors.toSet<Any>()
            ),
            PropertyBag()
        )


    fun lint(reporter: LintProblemReporter?, nodes: Collection<Node?>) {
        for (it in nodes) {
            for (linter in linters) {
                try {
                    linter.accept(it, reporter, config)
                } catch (e: Exception) {
                    LOGGER.error("Error in linter: {}", linter.getClass().getName(), e)
                }
            }
        }
    }

    fun lint(nodes: Collection<Node?>): Collection<LintProblem> {
        val problems: ArrayList<LintProblem> = ArrayList<LintProblem>(1024)
        val collector: Consumer<LintProblem> = Consumer<LintProblem> { e: LintProblem -> problems.add(e) }
        lint(LintProblemReporter(collector), nodes)
        problems.sort(Comparator.comparing<LintProblem, Any>(Function<LintProblem, Any> { it: LintProblem ->
            it.location().toRange().get().begin
        }))
        return problems
    }

    @Throws(URISyntaxException::class)
    fun asSarif(problems: Collection<LintProblem>): SarifSchema {
        val results: List<Result> =
            problems.stream().map<Result>(Function<LintProblem, Result> { it: LintProblem -> this.asSarif(it) })
                .toList()
        val runs: List<Run> = java.util.List.of(Run().withTool(sarifTool).withResults(results))
        return SarifSchema(
            URI("http://json.schemastore.org/sarif-2.1.0-rtm.4"),
            "2.1.0",
            runs, setOf(), PropertyBag()
        )
    }

    private fun asSarif(it: LintProblem): Result {
        return Result().withRuleId(it.ruleId()).withKind(it.category()).withLevel(it.level())
            .withLocations(java.util.List.of(Location())).withMessage(Message().withText(it.message()))
    }

    companion object {
        private val LOGGER: Logger = LoggerFactory.getLogger(JmlLintingFacade::class.java)
        private val VERSION: String = JmlLintingFacade::class.java.getPackage().implementationVersion
        private const val NAME = "JML-lint"

        private fun getLinter(config: JmlLintingConfig): List<LintRule> {
            val loader: ServiceLoader<LintRule> = ServiceLoader.load(LintRule::class.java)
            val validators: MutableList<LintRule> = ArrayList<LintRule>(64)
            for (lintRule in loader) {
                if (!config.isDisabled(lintRule)) {
                    validators.add(lintRule)
                }
            }
            return validators
        }
    }
}
