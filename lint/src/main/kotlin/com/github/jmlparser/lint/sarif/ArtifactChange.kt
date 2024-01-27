package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * A change to a single artifact.
 */
@Generated("jsonschema2pojo")
class ArtifactChange {
    /**
     * Specifies the location of an artifact.
     * (Required)
     */
    @SerializedName("artifactLocation")
    @Expose
    private var artifactLocation: ArtifactLocation? = null

    /**
     * An array of replacement objects, each of which represents the replacement of a single region in a single artifact specified by 'artifactLocation'.
     * (Required)
     */
    @SerializedName("replacements")
    @Expose
    private var replacements: List<Replacement>? = ArrayList<Replacement>()

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
     * @param replacements
     * @param artifactLocation
     * @param properties
     */
    constructor(
        artifactLocation: ArtifactLocation?,
        replacements: List<Replacement>?,
        properties: PropertyBag?
    ) : super() {
        this.artifactLocation = artifactLocation
        this.replacements = replacements
        this.properties = properties
    }

    /**
     * Specifies the location of an artifact.
     * (Required)
     */
    fun getArtifactLocation(): ArtifactLocation? {
        return artifactLocation
    }

    /**
     * Specifies the location of an artifact.
     * (Required)
     */
    fun setArtifactLocation(artifactLocation: ArtifactLocation?) {
        this.artifactLocation = artifactLocation
    }

    fun withArtifactLocation(artifactLocation: ArtifactLocation?): ArtifactChange {
        this.artifactLocation = artifactLocation
        return this
    }

    /**
     * An array of replacement objects, each of which represents the replacement of a single region in a single artifact specified by 'artifactLocation'.
     * (Required)
     */
    fun getReplacements(): List<Replacement>? {
        return replacements
    }

    /**
     * An array of replacement objects, each of which represents the replacement of a single region in a single artifact specified by 'artifactLocation'.
     * (Required)
     */
    fun setReplacements(replacements: List<Replacement>?) {
        this.replacements = replacements
    }

    fun withReplacements(replacements: List<Replacement>?): ArtifactChange {
        this.replacements = replacements
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

    fun withProperties(properties: PropertyBag?): ArtifactChange {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ArtifactChange::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("artifactLocation")
        sb.append('=')
        sb.append((if ((this.artifactLocation == null)) "<null>" else this.artifactLocation))
        sb.append(',')
        sb.append("replacements")
        sb.append('=')
        sb.append((if ((this.replacements == null)) "<null>" else this.replacements))
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
        result = ((result * 31) + (if ((this.artifactLocation == null)) 0 else artifactLocation.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + (if ((this.replacements == null)) 0 else replacements.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ArtifactChange) == false) {
            return false
        }
        val rhs = other
        return ((((this.artifactLocation === rhs.artifactLocation) || ((this.artifactLocation != null) && artifactLocation.equals(
            rhs.artifactLocation
        ))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(rhs.properties)))) && ((this.replacements === rhs.replacements) || ((this.replacements != null) && (this.replacements == rhs.replacements))))
    }
}
