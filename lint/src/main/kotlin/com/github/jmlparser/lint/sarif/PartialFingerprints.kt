package com.github.jmlparser.lint.sarif

import com.github.jmlparser.lint.sarif.PartialFingerprints
import javax.annotation.processing.Generated

/**
 * A set of strings that contribute to the stable, unique identity of the result.
 */
@Generated("jsonschema2pojo")
class PartialFingerprints {
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(PartialFingerprints::class.java.name).append('@').append(
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
        if ((other is PartialFingerprints) == false) {
            return false
        }
        val rhs = other
        return true
    }
}
