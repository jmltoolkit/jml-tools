import com.github.javaparser.JavaParser
import com.github.jmlparser.SolverTest
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource

/**
 * @author Alexander Weigl
 * @version 1 (14.06.22)
 */
internal class WDVisitorExprTest {
    private val parser = JavaParser()

    @ParameterizedTest
    @CsvFileSource(resources = "wd-expr.csv", delimiterString = "§")
    fun wdExpression(expr: String?) {
        Assumptions.assumeTrue(SolverTest.z3Installed())
        assertTrue(isWelldefined(parser, expr))
    }

    @ParameterizedTest
    @CsvFileSource(resources = "not-wd-expr.csv", delimiterString = "§")
    fun wdExpressionError(expr: String?) {
        Assumptions.assumeTrue(SolverTest.z3Installed())
        assertFalse(isWelldefined(parser, expr))
    }
}
