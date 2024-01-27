package com.github.jmlparser.lint.sarif

import com.github.jmlparser.lint.sarif.InitialState__1
import javax.annotation.processing.Generated

/**
 * Values of relevant expressions at the start of the graph traversal that may change during graph traversal.
 */
@Generated("jsonschema2pojo")
class InitialState__1 {
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(InitialState__1::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        if (sb[sb.length - 1] == ',') {
            sb.setCharAt((sb.length - 1), ']')
        } else {
            sb.append(']')
        }
        return sb.toString()
    }

    override fun hashCode(): Int {
        val result = 1
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is InitialState__1) == false) {
            return false
        }
        val rhs = other
        return true
    }
}
