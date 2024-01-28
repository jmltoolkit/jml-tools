import com.github.javaparser.GeneratedJavaParserConstants
import com.github.javaparser.TokenRange
import com.github.javaparser.ast.CompilationUnit
import com.github.javaparser.ast.Node
import com.google.common.truth.Truth
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import java.nio.file.Files
import java.nio.file.Paths
import java.util.function.Function
import java.util.function.Predicate
import java.util.stream.Stream

/**
 * @author Alexander Weigl
 * @version 1 (18.10.22)
 */
internal class TestTokenRangesPreciseness : TestWithJavaParser() {
    @Test
    fun lineColumnIndex() {
        val lci: LineColumnIndex = LineColumnIndex(
            """
                Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam
                nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.
                    At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea
                  takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet,
                   consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore
                 et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo 
                  duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est 
                Lorem ipsum dolor sit amet.
                
                """.trimIndent()
        )


        Truth.assertThat(lci.substring(1, 1, 1, 5))
            .isEqualTo("Lorem")

        Truth.assertThat(lci.substring(2, 1, 2, 6))
            .isEqualTo("nonumy")

        Truth.assertThat(lci.substring(6, 18, 6, 25))
            .isEqualTo("aliquyam")
    }

    @TestFactory
    @Throws(Throwable::class)
    fun ihm(): Stream<DynamicTest> {
        val content =
            Files.readString(
                Paths.get(
                    javaClass.getResource("/ihm/VerifiedIdentityHashMap.java").path
                )
            )
        val result = parser.parse(content)
        Assertions.assertTrue(result.isSuccessful)
        return testTokenRanges(result.result.get(), content)
    }


    @TestFactory
    @Throws(Throwable::class)
    fun test(): Stream<DynamicTest> {
        val content =
            Files.readString(
                Paths.get(
                    javaClass.getResource("/com/github/jmlparser/TokenTest.java").path
                )
            )
        val result = parser.parse(content)
        Assertions.assertTrue(result.isSuccessful)
        return testTokenRanges(result.result.get(), content)
    }

    private fun testTokenRanges(node: CompilationUnit, content: String): Stream<DynamicTest> {
        val lci: LineColumnIndex = LineColumnIndex(content)
        return JmlUtility.getAllNodes(node)
            .filter(Predicate<Node> { it: Node? -> it is NodeWithJmlTags<*> })
            .flatMap<DynamicTest>(Function<Node, Stream<out DynamicTest?>> { it: Node -> checkTokenRange(lci, it) })
        //checkTokenRange(lci, node);
    }

    private fun checkTokenRange(lci: LineColumnIndex, it: Node): Stream<DynamicTest?> {
        val tr = it.tokenRange
        return tr.map<Stream<DynamicTest?>> { javaTokens: TokenRange -> checkTokenRange(lci, javaTokens) }
            .orElse(Stream.empty<DynamicTest?>())
    }

    private fun checkTokenRange(lci: LineColumnIndex, javaTokens: TokenRange): Stream<DynamicTest?> {
        return Streams.stream(javaTokens)
            .filter { it -> it.getKind() !== GeneratedJavaParserConstants.EOF }
            .map { javaToken ->
                DynamicTest.dynamicTest(javaToken.toString(), Executable {
                    val substring: Unit = lci.substring(javaToken.getRange().get())
                    val text: Unit = javaToken.getText()
                    if (!(substring.equals("@") && text.equals(" "))) {
                        Truth.assertThat(substring).isEqualTo(text)
                    }
                })
            }
    }
}
