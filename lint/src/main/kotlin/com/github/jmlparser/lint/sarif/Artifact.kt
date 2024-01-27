package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import java.util.*
import javax.annotation.processing.Generated

/**
 * A single artifact. In some cases, this artifact might be nested within another artifact.
 */
@Generated("jsonschema2pojo")
class Artifact {
    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("description")
    @Expose
    private var description: Message? = null

    /**
     * Specifies the location of an artifact.
     */
    @SerializedName("location")
    @Expose
    private var location: ArtifactLocation? = null
    /**
     * Identifies the index of the immediate parent of the artifact, if this artifact is nested.
     */
    /**
     * Identifies the index of the immediate parent of the artifact, if this artifact is nested.
     */
    /**
     * Identifies the index of the immediate parent of the artifact, if this artifact is nested.
     */
    @SerializedName("parentIndex")
    @Expose
    var parentIndex: Int = -1
    /**
     * The offset in bytes of the artifact within its containing artifact.
     */
    /**
     * The offset in bytes of the artifact within its containing artifact.
     */
    /**
     * The offset in bytes of the artifact within its containing artifact.
     */
    @SerializedName("offset")
    @Expose
    var offset: Int = 0
    /**
     * The length of the artifact in bytes.
     */
    /**
     * The length of the artifact in bytes.
     */
    /**
     * The length of the artifact in bytes.
     */
    @SerializedName("length")
    @Expose
    var length: Int = -1

    /**
     * The role or roles played by the artifact in the analysis.
     */
    @SerializedName("roles")
    @Expose
    private var roles: Set<Role>? = LinkedHashSet<Role>()
    /**
     * The MIME type (RFC 2045) of the artifact.
     */
    /**
     * The MIME type (RFC 2045) of the artifact.
     */
    /**
     * The MIME type (RFC 2045) of the artifact.
     */
    @SerializedName("mimeType")
    @Expose
    var mimeType: String? = null

    /**
     * Represents the contents of an artifact.
     */
    @SerializedName("contents")
    @Expose
    private var contents: ArtifactContent? = null
    /**
     * Specifies the encoding for an artifact object that refers to a text file.
     */
    /**
     * Specifies the encoding for an artifact object that refers to a text file.
     */
    /**
     * Specifies the encoding for an artifact object that refers to a text file.
     */
    @SerializedName("encoding")
    @Expose
    var encoding: String? = null
    /**
     * Specifies the source language for any artifact object that refers to a text file that contains source code.
     */
    /**
     * Specifies the source language for any artifact object that refers to a text file that contains source code.
     */
    /**
     * Specifies the source language for any artifact object that refers to a text file that contains source code.
     */
    @SerializedName("sourceLanguage")
    @Expose
    var sourceLanguage: String? = null

    /**
     * A dictionary, each of whose keys is the name of a hash function and each of whose values is the hashed value of the artifact produced by the specified hash function.
     */
    @SerializedName("hashes")
    @Expose
    private var hashes: Hashes? = null
    /**
     * The Coordinated Universal Time (UTC) date and time at which the artifact was most recently modified. See "Date/time properties" in the SARIF spec for the required format.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which the artifact was most recently modified. See "Date/time properties" in the SARIF spec for the required format.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which the artifact was most recently modified. See "Date/time properties" in the SARIF spec for the required format.
     */
    @SerializedName("lastModifiedTimeUtc")
    @Expose
    var lastModifiedTimeUtc: Date? = null

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
     * @param parentIndex
     * @param offset
     * @param roles
     * @param lastModifiedTimeUtc
     * @param length
     * @param description
     * @param mimeType
     * @param encoding
     * @param contents
     * @param hashes
     * @param location
     * @param sourceLanguage
     * @param properties
     */
    constructor(
        description: Message?,
        location: ArtifactLocation?,
        parentIndex: Int,
        offset: Int,
        length: Int,
        roles: Set<Role>?,
        mimeType: String?,
        contents: ArtifactContent?,
        encoding: String?,
        sourceLanguage: String?,
        hashes: Hashes?,
        lastModifiedTimeUtc: Date?,
        properties: PropertyBag?
    ) : super() {
        this.description = description
        this.location = location
        this.parentIndex = parentIndex
        this.offset = offset
        this.length = length
        this.roles = roles
        this.mimeType = mimeType
        this.contents = contents
        this.encoding = encoding
        this.sourceLanguage = sourceLanguage
        this.hashes = hashes
        this.lastModifiedTimeUtc = lastModifiedTimeUtc
        this.properties = properties
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

    fun withDescription(description: Message?): Artifact {
        this.description = description
        return this
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

    fun withLocation(location: ArtifactLocation?): Artifact {
        this.location = location
        return this
    }

    fun withParentIndex(parentIndex: Int): Artifact {
        this.parentIndex = parentIndex
        return this
    }

    fun withOffset(offset: Int): Artifact {
        this.offset = offset
        return this
    }

    fun withLength(length: Int): Artifact {
        this.length = length
        return this
    }

    /**
     * The role or roles played by the artifact in the analysis.
     */
    fun getRoles(): Set<Role>? {
        return roles
    }

    /**
     * The role or roles played by the artifact in the analysis.
     */
    fun setRoles(roles: Set<Role>?) {
        this.roles = roles
    }

    fun withRoles(roles: Set<Role>?): Artifact {
        this.roles = roles
        return this
    }

    fun withMimeType(mimeType: String?): Artifact {
        this.mimeType = mimeType
        return this
    }

    /**
     * Represents the contents of an artifact.
     */
    fun getContents(): ArtifactContent? {
        return contents
    }

    /**
     * Represents the contents of an artifact.
     */
    fun setContents(contents: ArtifactContent?) {
        this.contents = contents
    }

    fun withContents(contents: ArtifactContent?): Artifact {
        this.contents = contents
        return this
    }

    fun withEncoding(encoding: String?): Artifact {
        this.encoding = encoding
        return this
    }

    fun withSourceLanguage(sourceLanguage: String?): Artifact {
        this.sourceLanguage = sourceLanguage
        return this
    }

    /**
     * A dictionary, each of whose keys is the name of a hash function and each of whose values is the hashed value of the artifact produced by the specified hash function.
     */
    fun getHashes(): Hashes? {
        return hashes
    }

    /**
     * A dictionary, each of whose keys is the name of a hash function and each of whose values is the hashed value of the artifact produced by the specified hash function.
     */
    fun setHashes(hashes: Hashes?) {
        this.hashes = hashes
    }

    fun withHashes(hashes: Hashes?): Artifact {
        this.hashes = hashes
        return this
    }

    fun withLastModifiedTimeUtc(lastModifiedTimeUtc: Date?): Artifact {
        this.lastModifiedTimeUtc = lastModifiedTimeUtc
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

    fun withProperties(properties: PropertyBag?): Artifact {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Artifact::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("description")
        sb.append('=')
        sb.append((if ((this.description == null)) "<null>" else this.description))
        sb.append(',')
        sb.append("location")
        sb.append('=')
        sb.append((if ((this.location == null)) "<null>" else this.location))
        sb.append(',')
        sb.append("parentIndex")
        sb.append('=')
        sb.append(this.parentIndex)
        sb.append(',')
        sb.append("offset")
        sb.append('=')
        sb.append(this.offset)
        sb.append(',')
        sb.append("length")
        sb.append('=')
        sb.append(this.length)
        sb.append(',')
        sb.append("roles")
        sb.append('=')
        sb.append((if ((this.roles == null)) "<null>" else this.roles))
        sb.append(',')
        sb.append("mimeType")
        sb.append('=')
        sb.append((if ((this.mimeType == null)) "<null>" else this.mimeType))
        sb.append(',')
        sb.append("contents")
        sb.append('=')
        sb.append((if ((this.contents == null)) "<null>" else this.contents))
        sb.append(',')
        sb.append("encoding")
        sb.append('=')
        sb.append((if ((this.encoding == null)) "<null>" else this.encoding))
        sb.append(',')
        sb.append("sourceLanguage")
        sb.append('=')
        sb.append((if ((this.sourceLanguage == null)) "<null>" else this.sourceLanguage))
        sb.append(',')
        sb.append("hashes")
        sb.append('=')
        sb.append((if ((this.hashes == null)) "<null>" else this.hashes))
        sb.append(',')
        sb.append("lastModifiedTimeUtc")
        sb.append('=')
        sb.append((if ((this.lastModifiedTimeUtc == null)) "<null>" else this.lastModifiedTimeUtc))
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
        result = ((result * 31) + this.parentIndex)
        result = ((result * 31) + this.offset)
        result = ((result * 31) + (if ((this.roles == null)) 0 else roles.hashCode()))
        result = ((result * 31) + (if ((this.lastModifiedTimeUtc == null)) 0 else lastModifiedTimeUtc.hashCode()))
        result = ((result * 31) + this.length)
        result = ((result * 31) + (if ((this.description == null)) 0 else description.hashCode()))
        result = ((result * 31) + (if ((this.mimeType == null)) 0 else mimeType.hashCode()))
        result = ((result * 31) + (if ((this.encoding == null)) 0 else encoding.hashCode()))
        result = ((result * 31) + (if ((this.contents == null)) 0 else contents.hashCode()))
        result = ((result * 31) + (if ((this.hashes == null)) 0 else hashes.hashCode()))
        result = ((result * 31) + (if ((this.location == null)) 0 else location.hashCode()))
        result = ((result * 31) + (if ((this.sourceLanguage == null)) 0 else sourceLanguage.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Artifact) == false) {
            return false
        }
        val rhs = other
        return (((((((((((((this.parentIndex == rhs.parentIndex) && (this.offset == rhs.offset)) && ((this.roles === rhs.roles) || ((this.roles != null) && (this.roles == rhs.roles)))) && ((this.lastModifiedTimeUtc === rhs.lastModifiedTimeUtc) || ((this.lastModifiedTimeUtc != null) && (this.lastModifiedTimeUtc == rhs.lastModifiedTimeUtc)))) && (this.length == rhs.length)) && ((this.description === rhs.description) || ((this.description != null) && description.equals(
            rhs.description
        )))) && ((this.mimeType === rhs.mimeType) || ((this.mimeType != null) && (this.mimeType == rhs.mimeType)))) && ((this.encoding === rhs.encoding) || ((this.encoding != null) && (this.encoding == rhs.encoding)))) && ((this.contents === rhs.contents) || ((this.contents != null) && contents.equals(
            rhs.contents
        )))) && ((this.hashes === rhs.hashes) || ((this.hashes != null) && hashes.equals(rhs.hashes)))) && ((this.location === rhs.location) || ((this.location != null) && location.equals(
            rhs.location
        )))) && ((this.sourceLanguage === rhs.sourceLanguage) || ((this.sourceLanguage != null) && (this.sourceLanguage == rhs.sourceLanguage)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
