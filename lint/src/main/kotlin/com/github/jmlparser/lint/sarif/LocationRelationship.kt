package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Information about the relation of one location to another.
 */
@Generated("jsonschema2pojo")
class LocationRelationship {
    /**
     * A reference to the related location.
     * (Required)
     */
    /**
     * A reference to the related location.
     * (Required)
     */
    /**
     * A reference to the related location.
     * (Required)
     */
    @SerializedName("target")
    @Expose
    var target: Int = 0
    /**
     * A set of distinct strings that categorize the relationship. Well-known kinds include 'includes', 'isIncludedBy' and 'relevant'.
     */
    /**
     * A set of distinct strings that categorize the relationship. Well-known kinds include 'includes', 'isIncludedBy' and 'relevant'.
     */
    /**
     * A set of distinct strings that categorize the relationship. Well-known kinds include 'includes', 'isIncludedBy' and 'relevant'.
     */
    @SerializedName("kinds")
    @Expose
    var kinds: Set<String>? = LinkedHashSet(mutableListOf("relevant"))

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("description")
    @Expose
    private var description: Message? = null

    /**
     * Key/value pairs that provide additional information about the object.
     */
    @SerializedName("properties")
    @Expose
    private var properties: PropertyBag? = null

    /**
     * No args constructor for use in serialization
     */
    constructor()

    /**
     * @param description
     * @param kinds
     * @param properties
     * @param target
     */
    constructor(target: Int, kinds: Set<String>?, description: Message?, properties: PropertyBag?) : super() {
        this.target = target
        this.kinds = kinds
        this.description = description
        this.properties = properties
    }

    fun withTarget(target: Int): LocationRelationship {
        this.target = target
        return this
    }

    fun withKinds(kinds: Set<String>?): LocationRelationship {
        this.kinds = kinds
        return this
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    fun getDescription(): Message? {
        return description
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    fun setDescription(description: Message?) {
        this.description = description
    }

    fun withDescription(description: Message?): LocationRelationship {
        this.description = description
        return this
    }

    /**
     * Key/value pairs that provide additional information about the object.
     */
    fun getProperties(): PropertyBag? {
        return properties
    }

    /**
     * Key/value pairs that provide additional information about the object.
     */
    fun setProperties(properties: PropertyBag?) {
        this.properties = properties
    }

    fun withProperties(properties: PropertyBag?): LocationRelationship {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(LocationRelationship::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("target")
        sb.append('=')
        sb.append(this.target)
        sb.append(',')
        sb.append("kinds")
        sb.append('=')
        sb.append((if ((this.kinds == null)) "<null>" else this.kinds))
        sb.append(',')
        sb.append("description")
        sb.append('=')
        sb.append((if ((this.description == null)) "<null>" else this.description))
        sb.append(',')
        sb.append("properties")
        sb.append('=')
        sb.append((if ((this.properties == null)) "<null>" else this.properties))
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
        result = ((result * 31) + (if ((this.description == null)) 0 else description.hashCode()))
        result = ((result * 31) + (if ((this.kinds == null)) 0 else kinds.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + this.target)
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is LocationRelationship) == false) {
            return false
        }
        val rhs = other
        return (((((this.description === rhs.description) || ((this.description != null) && description.equals(rhs.description))) && ((this.kinds === rhs.kinds) || ((this.kinds != null) && (this.kinds == rhs.kinds)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        )))) && (this.target == rhs.target))
    }
}
