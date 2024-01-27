package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Information about the relation of one reporting descriptor to another.
 */
@Generated("jsonschema2pojo")
class ReportingDescriptorRelationship {
    /**
     * Information about how to locate a relevant reporting descriptor.
     * (Required)
     */
    @SerializedName("target")
    @Expose
    private var target: ReportingDescriptorReference? = null
    /**
     * A set of distinct strings that categorize the relationship. Well-known kinds include 'canPrecede', 'canFollow', 'willPrecede', 'willFollow', 'superset', 'subset', 'equal', 'disjoint', 'relevant', and 'incomparable'.
     */
    /**
     * A set of distinct strings that categorize the relationship. Well-known kinds include 'canPrecede', 'canFollow', 'willPrecede', 'willFollow', 'superset', 'subset', 'equal', 'disjoint', 'relevant', and 'incomparable'.
     */
    /**
     * A set of distinct strings that categorize the relationship. Well-known kinds include 'canPrecede', 'canFollow', 'willPrecede', 'willFollow', 'superset', 'subset', 'equal', 'disjoint', 'relevant', and 'incomparable'.
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
    constructor(
        target: ReportingDescriptorReference?,
        kinds: Set<String>?,
        description: Message?,
        properties: PropertyBag?
    ) : super() {
        this.target = target
        this.kinds = kinds
        this.description = description
        this.properties = properties
    }

    /**
     * Information about how to locate a relevant reporting descriptor.
     * (Required)
     */
    fun getTarget(): ReportingDescriptorReference? {
        return target
    }

    /**
     * Information about how to locate a relevant reporting descriptor.
     * (Required)
     */
    fun setTarget(target: ReportingDescriptorReference?) {
        this.target = target
    }

    fun withTarget(target: ReportingDescriptorReference?): ReportingDescriptorRelationship {
        this.target = target
        return this
    }

    fun withKinds(kinds: Set<String>?): ReportingDescriptorRelationship {
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

    fun withDescription(description: Message?): ReportingDescriptorRelationship {
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

    fun withProperties(properties: PropertyBag?): ReportingDescriptorRelationship {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ReportingDescriptorRelationship::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("target")
        sb.append('=')
        sb.append((if ((this.target == null)) "<null>" else this.target))
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
        result = ((result * 31) + (if ((this.target == null)) 0 else target.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ReportingDescriptorRelationship) == false) {
            return false
        }
        val rhs = other
        return (((((this.description === rhs.description) || ((this.description != null) && description.equals(rhs.description))) && ((this.kinds === rhs.kinds) || ((this.kinds != null) && (this.kinds == rhs.kinds)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        )))) && ((this.target === rhs.target) || ((this.target != null) && target.equals(rhs.target))))
    }
}
