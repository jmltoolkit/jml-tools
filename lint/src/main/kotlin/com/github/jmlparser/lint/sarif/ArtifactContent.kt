package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Represents the contents of an artifact.
 */
@Generated("jsonschema2pojo")
class ArtifactContent {
    /**
     * UTF-8-encoded content from a text artifact.
     */
    /**
     * UTF-8-encoded content from a text artifact.
     */
    /**
     * UTF-8-encoded content from a text artifact.
     */
    @SerializedName("text")
    @Expose
    var text: String? = null
    /**
     * MIME Base64-encoded content from a binary artifact, or from a text artifact in its original encoding.
     */
    /**
     * MIME Base64-encoded content from a binary artifact, or from a text artifact in its original encoding.
     */
    /**
     * MIME Base64-encoded content from a binary artifact, or from a text artifact in its original encoding.
     */
    @SerializedName("binary")
    @Expose
    var binary: String? = null

    /**
     * A message string or message format string rendered in multiple formats.
     */
    @SerializedName("rendered")
    @Expose
    private var rendered: MultiformatMessageString? = null

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
     * @param rendered
     * @param binary
     * @param text
     * @param properties
     */
    constructor(
        text: String?,
        binary: String?,
        rendered: MultiformatMessageString?,
        properties: PropertyBag?
    ) : super() {
        this.text = text
        this.binary = binary
        this.rendered = rendered
        this.properties = properties
    }

    fun withText(text: String?): ArtifactContent {
        this.text = text
        return this
    }

    fun withBinary(binary: String?): ArtifactContent {
        this.binary = binary
        return this
    }

    /**
     * A message string or message format string rendered in multiple formats.
     */
    fun getRendered(): MultiformatMessageString? {
        return rendered
    }

    /**
     * A message string or message format string rendered in multiple formats.
     */
    fun setRendered(rendered: MultiformatMessageString?) {
        this.rendered = rendered
    }

    fun withRendered(rendered: MultiformatMessageString?): ArtifactContent {
        this.rendered = rendered
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

    fun withProperties(properties: PropertyBag?): ArtifactContent {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ArtifactContent::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("text")
        sb.append('=')
        sb.append((if ((this.text == null)) "<null>" else this.text))
        sb.append(',')
        sb.append("binary")
        sb.append('=')
        sb.append((if ((this.binary == null)) "<null>" else this.binary))
        sb.append(',')
        sb.append("rendered")
        sb.append('=')
        sb.append((if ((this.rendered == null)) "<null>" else this.rendered))
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
        result = ((result * 31) + (if ((this.text == null)) 0 else text.hashCode()))
        result = ((result * 31) + (if ((this.rendered == null)) 0 else rendered.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + (if ((this.binary == null)) 0 else binary.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ArtifactContent) == false) {
            return false
        }
        val rhs = other
        return (((((this.text === rhs.text) || ((this.text != null) && (this.text == rhs.text))) && ((this.rendered === rhs.rendered) || ((this.rendered != null) && rendered.equals(
            rhs.rendered
        )))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(rhs.properties)))) && ((this.binary === rhs.binary) || ((this.binary != null) && (this.binary == rhs.binary))))
    }
}
