package com.github.jmlparser.lint.sarif

import com.github.jmlparser.lint.sarif.EnvironmentVariables
import javax.annotation.processing.Generated

/**
 * The environment variables associated with the analysis tool process, expressed as key/value pairs.
 */
@Generated("jsonschema2pojo")
class EnvironmentVariables {
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(EnvironmentVariables::class.java.name).append('@').append(
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
        if ((other is EnvironmentVariables) == false) {
            return false
        }
        val rhs = other
        return true
    }
}
