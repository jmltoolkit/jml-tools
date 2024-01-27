package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * The replacement of a single region of an artifact.
 */
@Generated("jsonschema2pojo")
class Replacement {
    /**
     * A region within an artifact where a result was detected.
     * (Required)
     */
    @SerializedName("deletedRegion")
    @Expose
    private var deletedRegion: Region? = null

    /**
     * Represents the contents of an artifact.
     */
    @SerializedName("insertedContent")
    @Expose
    private var insertedContent: ArtifactContent? = null

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
     * @param insertedContent
     * @param deletedRegion
     * @param properties
     */
    constructor(deletedRegion: Region?, insertedContent: ArtifactContent?, properties: PropertyBag?) : super() {
        this.deletedRegion = deletedRegion
        this.insertedContent = insertedContent
        this.properties = properties
    }

    /**
     * A region within an artifact where a result was detected.
     * (Required)
     */
    fun getDeletedRegion(): Region? {
        return deletedRegion
    }

    /**
     * A region within an artifact where a result was detected.
     * (Required)
     */
    fun setDeletedRegion(deletedRegion: Region?) {
        this.deletedRegion = deletedRegion
    }

    fun withDeletedRegion(deletedRegion: Region?): Replacement {
        this.deletedRegion = deletedRegion
        return this
    }

    /**
     * Represents the contents of an artifact.
     */
    fun getInsertedContent(): ArtifactContent? {
        return insertedContent
    }

    /**
     * Represents the contents of an artifact.
     */
    fun setInsertedContent(insertedContent: ArtifactContent?) {
        this.insertedContent = insertedContent
    }

    fun withInsertedContent(insertedContent: ArtifactContent?): Replacement {
        this.insertedContent = insertedContent
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

    fun withProperties(properties: PropertyBag?): Replacement {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Replacement::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("deletedRegion")
        sb.append('=')
        sb.append((if ((this.deletedRegion == null)) "<null>" else this.deletedRegion))
        sb.append(',')
        sb.append("insertedContent")
        sb.append('=')
        sb.append((if ((this.insertedContent == null)) "<null>" else this.insertedContent))
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
        result = ((result * 31) + (if ((this.insertedContent == null)) 0 else insertedContent.hashCode()))
        result = ((result * 31) + (if ((this.deletedRegion == null)) 0 else deletedRegion.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Replacement) == false) {
            return false
        }
        val rhs = other
        return ((((this.insertedContent === rhs.insertedContent) || ((this.insertedContent != null) && insertedContent.equals(
            rhs.insertedContent
        ))) && ((this.deletedRegion === rhs.deletedRegion) || ((this.deletedRegion != null) && deletedRegion.equals(rhs.deletedRegion)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
