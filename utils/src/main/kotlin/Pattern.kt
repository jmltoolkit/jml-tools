package io.github.jmltoolkit.utils

import com.github.javaparser.ast.Node
import java.util.*

/**
 * @author Alexander Weigl
 * @version 1 (11.10.22)
 */
class Pattern<T : Node?>(private val pattern: T) {
    private val placeholders: MutableMap<Node, String> = IdentityHashMap<Node, String>()
    fun match(tree: Node?): Map<String?, Node>? {
        return match(pattern, tree, HashMap<String?, Node>())
    }

    private fun match(pattern: Node?, tree: Node?, map: MutableMap<String?, Node>?): MutableMap<String?, Node>? {
        var map: MutableMap<String?, Node>? = map
        if (pattern == null && tree == null) return map
        if ((pattern != null) xor (tree != null)) return null

        if (placeholders.containsKey(pattern)) {
            val key = placeholders[pattern]
            if (map!!.containsKey(key) && !map[key].equals(tree)) return null
            else map[key] = tree
            return map
        }

        if (pattern?.javaClass !== tree?.javaClass) return null


        for (prop in pattern.getMetaModel().getAllPropertyMetaModels()) {
            val childPattern: Unit = prop.getValue(pattern)
            val childTree: Unit = prop.getValue(tree)

            if (prop.isNode()) {
                map = match(childPattern as Node, childTree as Node, map)
                if (map == null) return null
            } else if (prop.isNodeList()) {
                val a: NodeList<out Node?> = childPattern as NodeList<out Node?>
                val b: NodeList<out Node?> = childTree as NodeList<out Node?>
                if (a.size() !== b.size()) return null

                for (i in 0 until a.size()) {
                    map = match(a.get(i), b.get(i), map)
                    if (map == null) return null
                }
            } else {
                if (!childPattern.equals(childTree)) return null
            }
        }

        return map
    }


    fun find(n: Node): Map<String?, Node>? {
        val queue: ArrayDeque<Node> = ArrayDeque<Node>()
        queue.add(n)
        while (!queue.isEmpty()) {
            val e: Node = queue.pop()
            val r: Map<String?, Node>? = match(e)
            if (r != null) return r
            queue.addAll(e.getChildNodes())
        }
        return null
    }

    fun addPlaceholder(placeholder: Node, label: String) {
        placeholders[placeholder] = label
    }
}
