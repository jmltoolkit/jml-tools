package com.github.jmlparser.lint.sarif

import javax.annotation.processing.Generated

/**
 * A dictionary, each of whose keys is the name of a hash function and each of whose values is the hashed value of the artifact produced by the specified hash function.
 */
@Generated("jsonschema2pojo")
class Hashes {
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Hashes::class.java.name).append('@').append(
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
        if ((other is Hashes) == false) {
            return false
        }
        val rhs = other
        return true
    }
}
