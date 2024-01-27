package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Defines locations of special significance to SARIF consumers.
 */
@Generated("jsonschema2pojo")
class SpecialLocations {
    /**
     * Specifies the location of an artifact.
     */
    @SerializedName("displayBase")
    @Expose
    private var displayBase: ArtifactLocation? = null

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
     * @param displayBase
     * @param properties
     */
    constructor(displayBase: ArtifactLocation?, properties: PropertyBag?) : super() {
        this.displayBase = displayBase
        this.properties = properties
    }

    /**
     * Specifies the location of an artifact.
     */
    fun getDisplayBase(): ArtifactLocation? {
        return displayBase
    }

    /**
     * Specifies the location of an artifact.
     */
    fun setDisplayBase(displayBase: ArtifactLocation?) {
        this.displayBase = displayBase
    }

    fun withDisplayBase(displayBase: ArtifactLocation?): SpecialLocations {
        this.displayBase = displayBase
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

    fun withProperties(properties: PropertyBag?): SpecialLocations {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(SpecialLocations::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("displayBase")
        sb.append('=')
        sb.append((if ((this.displayBase == null)) "<null>" else this.displayBase))
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
        result = ((result * 31) + (if ((this.displayBase == null)) 0 else displayBase.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is SpecialLocations) == false) {
            return false
        }
        val rhs = other
        return (((this.displayBase === rhs.displayBase) || ((this.displayBase != null) && displayBase.equals(rhs.displayBase))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
