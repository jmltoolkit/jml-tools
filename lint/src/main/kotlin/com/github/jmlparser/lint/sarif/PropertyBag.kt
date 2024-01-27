package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Key/value pairs that provide additional information about the object.
 */
@Generated("jsonschema2pojo")
class PropertyBag {
    /**
     * This is a modification, see: https://github.com/joelittlejohn/jsonschema2pojo/issues/186
     */
    /**
     * This is a modification, see: https://github.com/joelittlejohn/jsonschema2pojo/issues/186
     */
    /**
     * This is a modification, see: https://github.com/joelittlejohn/jsonschema2pojo/issues/186
     */
    @SerializedName("category")
    @Expose
    var category: String? = null
    /**
     * A set of distinct strings that provide additional information.
     */
    /**
     * A set of distinct strings that provide additional information.
     */
    /**
     * A set of distinct strings that provide additional information.
     */
    @SerializedName("tags")
    @Expose
    var tags: Set<String>? = LinkedHashSet()

    /**
     * No args constructor for use in serialization
     */
    constructor()

    /**
     * @param category
     * @param tags
     */
    constructor(category: String?, tags: Set<String>?) : super() {
        this.category = category
        this.tags = tags
    }

    fun withCategory(category: String?): PropertyBag {
        this.category = category
        return this
    }

    fun withTags(tags: Set<String>?): PropertyBag {
        this.tags = tags
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(PropertyBag::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("category")
        sb.append('=')
        sb.append((if ((this.category == null)) "<null>" else this.category))
        sb.append(',')
        sb.append("tags")
        sb.append('=')
        sb.append((if ((this.tags == null)) "<null>" else this.tags))
        sb.append(',')
        if (sb[sb.length - 1] == ',') {
            sb.setCharAt((sb.length - 1), ']')
        } else {
            sb.append(']')
        }
        return sb.toString()
    }

    override fun hashCode(): Int {
        var result = 1
        result = ((result * 31) + (if ((this.category == null)) 0 else this.category.hashCode()))
        result = ((result * 31) + (if ((this.tags == null)) 0 else tags.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is PropertyBag) == false) {
            return false
        }
        val rhs = other
        return (((this.category === rhs.category) || ((this.category != null) && (this.category == rhs.category))) && ((this.tags === rhs.tags) || ((this.tags != null) && (this.tags == rhs.tags))))
    }
}
