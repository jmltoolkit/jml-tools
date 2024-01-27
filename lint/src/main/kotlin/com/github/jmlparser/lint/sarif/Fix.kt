package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * A proposed fix for the problem represented by a result object. A fix specifies a set of artifacts to modify. For each artifact, it specifies a set of bytes to remove, and provides a set of new bytes to replace them.
 */
@Generated("jsonschema2pojo")
class Fix {
    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("description")
    @Expose
    private var description: Message? = null

    /**
     * One or more artifact changes that comprise a fix for a result.
     * (Required)
     */
    @SerializedName("artifactChanges")
    @Expose
    private var artifactChanges: Set<ArtifactChange>? = LinkedHashSet<ArtifactChange>()

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
     * @param artifactChanges
     * @param description
     * @param properties
     */
    constructor(description: Message?, artifactChanges: Set<ArtifactChange>?, properties: PropertyBag?) : super() {
        this.description = description
        this.artifactChanges = artifactChanges
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

    fun withDescription(description: Message?): Fix {
        this.description = description
        return this
    }

    /**
     * One or more artifact changes that comprise a fix for a result.
     * (Required)
     */
    fun getArtifactChanges(): Set<ArtifactChange>? {
        return artifactChanges
    }

    /**
     * One or more artifact changes that comprise a fix for a result.
     * (Required)
     */
    fun setArtifactChanges(artifactChanges: Set<ArtifactChange>?) {
        this.artifactChanges = artifactChanges
    }

    fun withArtifactChanges(artifactChanges: Set<ArtifactChange>?): Fix {
        this.artifactChanges = artifactChanges
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

    fun withProperties(properties: PropertyBag?): Fix {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Fix::class.java.name).append('@').append(
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
        sb.append("artifactChanges")
        sb.append('=')
        sb.append((if ((this.artifactChanges == null)) "<null>" else this.artifactChanges))
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
        result = ((result * 31) + (if ((this.artifactChanges == null)) 0 else artifactChanges.hashCode()))
        result = ((result * 31) + (if ((this.description == null)) 0 else description.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Fix) == false) {
            return false
        }
        val rhs = other
        return ((((this.artifactChanges === rhs.artifactChanges) || ((this.artifactChanges != null) && (this.artifactChanges == rhs.artifactChanges))) && ((this.description === rhs.description) || ((this.description != null) && description.equals(
            rhs.description
        )))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(rhs.properties))))
    }
}
