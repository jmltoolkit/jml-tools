package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Contains information that enables a SARIF consumer to locate the external property file that contains the value of an externalized property associated with the run.
 */
@Generated("jsonschema2pojo")
class ExternalPropertyFileReference {
    /**
     * Specifies the location of an artifact.
     */
    @SerializedName("location")
    @Expose
    private var location: ArtifactLocation? = null
    /**
     * A stable, unique identifer for the external property file in the form of a GUID.
     */
    /**
     * A stable, unique identifer for the external property file in the form of a GUID.
     */
    /**
     * A stable, unique identifer for the external property file in the form of a GUID.
     */
    @SerializedName("guid")
    @Expose
    var guid: String? = null
    /**
     * A non-negative integer specifying the number of items contained in the external property file.
     */
    /**
     * A non-negative integer specifying the number of items contained in the external property file.
     */
    /**
     * A non-negative integer specifying the number of items contained in the external property file.
     */
    @SerializedName("itemCount")
    @Expose
    var itemCount: Int = -1

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
     * @param guid
     * @param location
     * @param properties
     * @param itemCount
     */
    constructor(location: ArtifactLocation?, guid: String?, itemCount: Int, properties: PropertyBag?) : super() {
        this.location = location
        this.guid = guid
        this.itemCount = itemCount
        this.properties = properties
    }

    /**
     * Specifies the location of an artifact.
     */
    fun getLocation(): ArtifactLocation? {
        return location
    }

    /**
     * Specifies the location of an artifact.
     */
    fun setLocation(location: ArtifactLocation?) {
        this.location = location
    }

    fun withLocation(location: ArtifactLocation?): ExternalPropertyFileReference {
        this.location = location
        return this
    }

    fun withGuid(guid: String?): ExternalPropertyFileReference {
        this.guid = guid
        return this
    }

    fun withItemCount(itemCount: Int): ExternalPropertyFileReference {
        this.itemCount = itemCount
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

    fun withProperties(properties: PropertyBag?): ExternalPropertyFileReference {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ExternalPropertyFileReference::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("location")
        sb.append('=')
        sb.append((if ((this.location == null)) "<null>" else this.location))
        sb.append(',')
        sb.append("guid")
        sb.append('=')
        sb.append((if ((this.guid == null)) "<null>" else this.guid))
        sb.append(',')
        sb.append("itemCount")
        sb.append('=')
        sb.append(this.itemCount)
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
        result = ((result * 31) + (if ((this.guid == null)) 0 else guid.hashCode()))
        result = ((result * 31) + (if ((this.location == null)) 0 else location.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + this.itemCount)
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ExternalPropertyFileReference) == false) {
            return false
        }
        val rhs = other
        return (((((this.guid === rhs.guid) || ((this.guid != null) && (this.guid == rhs.guid))) && ((this.location === rhs.location) || ((this.location != null) && location.equals(
            rhs.location
        )))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(rhs.properties)))) && (this.itemCount == rhs.itemCount))
    }
}
