package com.github.jmlparser.lint.sarif

import com.github.jmlparser.lint.sarif.FinalState
import javax.annotation.processing.Generated

/**
 * The values of relevant expressions after the edge has been traversed.
 */
@Generated("jsonschema2pojo")
class FinalState {
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(FinalState::class.java.name).append('@').append(
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
        if ((other is FinalState) == false) {
            return false
        }
        val rhs = other
        return true
    }
}
