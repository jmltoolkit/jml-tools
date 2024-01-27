package com.github.jmlparser.lint.sarif

import javax.annotation.processing.Generated

/**
 * The request parameters.
 */
@Generated("jsonschema2pojo")
class Parameters {
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Parameters::class.java.name).append('@').append(
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
        if ((other is Parameters) == false) {
            return false
        }
        val rhs = other
        return true
    }
}
