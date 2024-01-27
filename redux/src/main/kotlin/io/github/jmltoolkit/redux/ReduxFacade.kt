package io.github.jmltoolkit.redux


import com.github.javaparser.ast.Node
import java.util.*
import java.util.function.Function

/**
 * @author Alexander Weigl
 * @version 1 (12/29/21)
 */
class ReduxFacade(private val config: ReduxConfig) {
    private val transformers: MutableList<Transformer> = ArrayList()

    constructor(config: ReduxConfig, transformers: List<Transformer>?) : this(config) {
        this.transformers.addAll(transformers!!)
    }

    fun apply(nodes: List<Node?>): List<Node?> {
        val n: MutableList<Node?> = ArrayList(nodes.size)
        for (node in nodes) {
            for (transformer in transformers) {
                node = transformer.apply(node)
            }
            n.add(node)
        }
        return n
    }

    companion object {
        fun create(config: ReduxConfig): ReduxFacade {
            val sl = ServiceLoader.load(Transformer::class.java)
            return ReduxFacade(config, sl.stream()
                .filter { it: ServiceLoader.Provider<Transformer> -> config.isEnabled(it.type().toString()) }
                .map<Transformer>(Function<ServiceLoader.Provider<Transformer>, Transformer> { ServiceLoader.Provider.get() })
                .toList()
            )
        }
    }
}
