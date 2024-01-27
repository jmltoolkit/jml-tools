package com.github.jmlparser.lint.sarif

import com.github.jmlparser.lint.sarif.GlobalMessageStrings
import javax.annotation.processing.Generated

/**
 * A dictionary, each of whose keys is a resource identifier and each of whose values is a multiformatMessageString object, which holds message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can be used to construct a message in combination with an arbitrary number of additional string arguments.
 */
@Generated("jsonschema2pojo")
class GlobalMessageStrings {
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(GlobalMessageStrings::class.java.name).append('@').append(
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
        if ((other is GlobalMessageStrings) == false) {
            return false
        }
        val rhs = other
        return true
    }
}
