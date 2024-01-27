package com.github.jmlparser.lint.sarif

import javax.annotation.processing.Generated

/**
 * The request headers.
 */
@Generated("jsonschema2pojo")
class Headers {
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Headers::class.java.name).append('@').append(
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
        if ((other is Headers) == false) {
            return false
        }
        val rhs = other
        return true
    }
}
