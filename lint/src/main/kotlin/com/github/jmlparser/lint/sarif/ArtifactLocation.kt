package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Specifies the location of an artifact.
 */
@Generated("jsonschema2pojo")
class ArtifactLocation {
    /**
     * A string containing a valid relative or absolute URI.
     */
    /**
     * A string containing a valid relative or absolute URI.
     */
    /**
     * A string containing a valid relative or absolute URI.
     */
    @SerializedName("uri")
    @Expose
    var uri: String? = null
    /**
     * A string which indirectly specifies the absolute URI with respect to which a relative URI in the "uri" property is interpreted.
     */
    /**
     * A string which indirectly specifies the absolute URI with respect to which a relative URI in the "uri" property is interpreted.
     */
    /**
     * A string which indirectly specifies the absolute URI with respect to which a relative URI in the "uri" property is interpreted.
     */
    @SerializedName("uriBaseId")
    @Expose
    var uriBaseId: String? = null
    /**
     * The index within the run artifacts array of the artifact object associated with the artifact location.
     */
    /**
     * The index within the run artifacts array of the artifact object associated with the artifact location.
     */
    /**
     * The index within the run artifacts array of the artifact object associated with the artifact location.
     */
    @SerializedName("index")
    @Expose
    var index: Int = -1

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
     * @param index
     * @param description
     * @param uri
     * @param properties
     * @param uriBaseId
     */
    constructor(
        uri: String?,
        uriBaseId: String?,
        index: Int,
        description: Message?,
        properties: PropertyBag?
    ) : super() {
        this.uri = uri
        this.uriBaseId = uriBaseId
        this.index = index
        this.description = description
        this.properties = properties
    }

    fun withUri(uri: String?): ArtifactLocation {
        this.uri = uri
        return this
    }

    fun withUriBaseId(uriBaseId: String?): ArtifactLocation {
        this.uriBaseId = uriBaseId
        return this
    }

    fun withIndex(index: Int): ArtifactLocation {
        this.index = index
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

    fun withDescription(description: Message?): ArtifactLocation {
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

    fun withProperties(properties: PropertyBag?): ArtifactLocation {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ArtifactLocation::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("uri")
        sb.append('=')
        sb.append((if ((this.uri == null)) "<null>" else this.uri))
        sb.append(',')
        sb.append("uriBaseId")
        sb.append('=')
        sb.append((if ((this.uriBaseId == null)) "<null>" else this.uriBaseId))
        sb.append(',')
        sb.append("index")
        sb.append('=')
        sb.append(this.index)
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
        result = ((result * 31) + this.index)
        result = ((result * 31) + (if ((this.description == null)) 0 else description.hashCode()))
        result = ((result * 31) + (if ((this.uri == null)) 0 else uri.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + (if ((this.uriBaseId == null)) 0 else uriBaseId.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ArtifactLocation) == false) {
            return false
        }
        val rhs = other
        return (((((this.index == rhs.index) && ((this.description === rhs.description) || ((this.description != null) && description.equals(
            rhs.description
        )))) && ((this.uri === rhs.uri) || ((this.uri != null) && (this.uri == rhs.uri)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        )))) && ((this.uriBaseId === rhs.uriBaseId) || ((this.uriBaseId != null) && (this.uriBaseId == rhs.uriBaseId))))
    }
}
