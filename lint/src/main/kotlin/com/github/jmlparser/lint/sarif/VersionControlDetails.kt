package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import java.net.URI
import java.util.*
import javax.annotation.processing.Generated

/**
 * Specifies the information necessary to retrieve a desired revision from a version control system.
 */
@Generated("jsonschema2pojo")
class VersionControlDetails {
    /**
     * The absolute URI of the repository.
     * (Required)
     */
    /**
     * The absolute URI of the repository.
     * (Required)
     */
    /**
     * The absolute URI of the repository.
     * (Required)
     */
    @SerializedName("repositoryUri")
    @Expose
    var repositoryUri: URI? = null
    /**
     * A string that uniquely and permanently identifies the revision within the repository.
     */
    /**
     * A string that uniquely and permanently identifies the revision within the repository.
     */
    /**
     * A string that uniquely and permanently identifies the revision within the repository.
     */
    @SerializedName("revisionId")
    @Expose
    var revisionId: String? = null
    /**
     * The name of a branch containing the revision.
     */
    /**
     * The name of a branch containing the revision.
     */
    /**
     * The name of a branch containing the revision.
     */
    @SerializedName("branch")
    @Expose
    var branch: String? = null
    /**
     * A tag that has been applied to the revision.
     */
    /**
     * A tag that has been applied to the revision.
     */
    /**
     * A tag that has been applied to the revision.
     */
    @SerializedName("revisionTag")
    @Expose
    var revisionTag: String? = null
    /**
     * A Coordinated Universal Time (UTC) date and time that can be used to synchronize an enlistment to the state of the repository at that time.
     */
    /**
     * A Coordinated Universal Time (UTC) date and time that can be used to synchronize an enlistment to the state of the repository at that time.
     */
    /**
     * A Coordinated Universal Time (UTC) date and time that can be used to synchronize an enlistment to the state of the repository at that time.
     */
    @SerializedName("asOfTimeUtc")
    @Expose
    var asOfTimeUtc: Date? = null

    /**
     * Specifies the location of an artifact.
     */
    @SerializedName("mappedTo")
    @Expose
    private var mappedTo: ArtifactLocation? = null

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
     * @param revisionId
     * @param repositoryUri
     * @param mappedTo
     * @param branch
     * @param asOfTimeUtc
     * @param properties
     * @param revisionTag
     */
    constructor(
        repositoryUri: URI?,
        revisionId: String?,
        branch: String?,
        revisionTag: String?,
        asOfTimeUtc: Date?,
        mappedTo: ArtifactLocation?,
        properties: PropertyBag?
    ) : super() {
        this.repositoryUri = repositoryUri
        this.revisionId = revisionId
        this.branch = branch
        this.revisionTag = revisionTag
        this.asOfTimeUtc = asOfTimeUtc
        this.mappedTo = mappedTo
        this.properties = properties
    }

    fun withRepositoryUri(repositoryUri: URI?): VersionControlDetails {
        this.repositoryUri = repositoryUri
        return this
    }

    fun withRevisionId(revisionId: String?): VersionControlDetails {
        this.revisionId = revisionId
        return this
    }

    fun withBranch(branch: String?): VersionControlDetails {
        this.branch = branch
        return this
    }

    fun withRevisionTag(revisionTag: String?): VersionControlDetails {
        this.revisionTag = revisionTag
        return this
    }

    fun withAsOfTimeUtc(asOfTimeUtc: Date?): VersionControlDetails {
        this.asOfTimeUtc = asOfTimeUtc
        return this
    }

    /**
     * Specifies the location of an artifact.
     */
    fun getMappedTo(): ArtifactLocation? {
        return mappedTo
    }

    /**
     * Specifies the location of an artifact.
     */
    fun setMappedTo(mappedTo: ArtifactLocation?) {
        this.mappedTo = mappedTo
    }

    fun withMappedTo(mappedTo: ArtifactLocation?): VersionControlDetails {
        this.mappedTo = mappedTo
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

    fun withProperties(properties: PropertyBag?): VersionControlDetails {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(VersionControlDetails::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("repositoryUri")
        sb.append('=')
        sb.append((if ((this.repositoryUri == null)) "<null>" else this.repositoryUri))
        sb.append(',')
        sb.append("revisionId")
        sb.append('=')
        sb.append((if ((this.revisionId == null)) "<null>" else this.revisionId))
        sb.append(',')
        sb.append("branch")
        sb.append('=')
        sb.append((if ((this.branch == null)) "<null>" else this.branch))
        sb.append(',')
        sb.append("revisionTag")
        sb.append('=')
        sb.append((if ((this.revisionTag == null)) "<null>" else this.revisionTag))
        sb.append(',')
        sb.append("asOfTimeUtc")
        sb.append('=')
        sb.append((if ((this.asOfTimeUtc == null)) "<null>" else this.asOfTimeUtc))
        sb.append(',')
        sb.append("mappedTo")
        sb.append('=')
        sb.append((if ((this.mappedTo == null)) "<null>" else this.mappedTo))
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
        result = ((result * 31) + (if ((this.revisionId == null)) 0 else revisionId.hashCode()))
        result = ((result * 31) + (if ((this.repositoryUri == null)) 0 else repositoryUri.hashCode()))
        result = ((result * 31) + (if ((this.mappedTo == null)) 0 else mappedTo.hashCode()))
        result = ((result * 31) + (if ((this.branch == null)) 0 else branch.hashCode()))
        result = ((result * 31) + (if ((this.asOfTimeUtc == null)) 0 else asOfTimeUtc.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + (if ((this.revisionTag == null)) 0 else revisionTag.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is VersionControlDetails) == false) {
            return false
        }
        val rhs = other
        return ((((((((this.revisionId === rhs.revisionId) || ((this.revisionId != null) && (this.revisionId == rhs.revisionId))) && ((this.repositoryUri === rhs.repositoryUri) || ((this.repositoryUri != null) && (this.repositoryUri == rhs.repositoryUri)))) && ((this.mappedTo === rhs.mappedTo) || ((this.mappedTo != null) && mappedTo.equals(
            rhs.mappedTo
        )))) && ((this.branch === rhs.branch) || ((this.branch != null) && (this.branch == rhs.branch)))) && ((this.asOfTimeUtc === rhs.asOfTimeUtc) || ((this.asOfTimeUtc != null) && (this.asOfTimeUtc == rhs.asOfTimeUtc)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        )))) && ((this.revisionTag === rhs.revisionTag) || ((this.revisionTag != null) && (this.revisionTag == rhs.revisionTag))))
    }
}
