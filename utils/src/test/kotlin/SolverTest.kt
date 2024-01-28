import com.github.jmlparser.smt.solver.Solver
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.Test
import java.io.IOException

/**
 * @author Alexander Weigl
 * @version 1 (08.08.22)
 */
class SolverTest {
    @Test
    @Throws(IOException::class)
    fun startZ3Mini() {
        Assumptions.assumeTrue(z3Installed())
        val s: Solver = Solver()
        val result: SolverAnswer = s.run("(assert (= (* 2 3) 6)) (check-sat) (get-model) (exit)")
        result.expectSat().consume()
    }

    companion object {
        private var z3Installed: Boolean? = null

        fun z3Installed(): Boolean {
            if (z3Installed != null) return z3Installed!!
            try {
                return (ProcessBuilder("sh", "-c", "which z3").start().waitFor() == 0).also { z3Installed = it }
            } catch (e: Exception) {
            }
            return false.also { z3Installed = it }
        }
    }
}
