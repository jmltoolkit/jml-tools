package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * A message string or message format string rendered in multiple formats.
 */
@Generated("jsonschema2pojo")
class MultiformatMessageString {
    /**
     * A plain text message string or format string.
     * (Required)
     */
    /**
     * A plain text message string or format string.
     * (Required)
     */
    /**
     * A plain text message string or format string.
     * (Required)
     */
    @SerializedName("text")
    @Expose
    var text: String? = null
    /**
     * A Markdown message string or format string.
     */
    /**
     * A Markdown message string or format string.
     */
    /**
     * A Markdown message string or format string.
     */
    @SerializedName("markdown")
    @Expose
    var markdown: String? = null

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
     * @param markdown
     * @param text
     * @param properties
     */
    constructor(text: String?, markdown: String?, properties: PropertyBag?) : super() {
        this.text = text
        this.markdown = markdown
        this.properties = properties
    }

    fun withText(text: String?): MultiformatMessageString {
        this.text = text
        return this
    }

    fun withMarkdown(markdown: String?): MultiformatMessageString {
        this.markdown = markdown
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

    fun withProperties(properties: PropertyBag?): MultiformatMessageString {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(MultiformatMessageString::class.java.name).append('@').append(
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
        sb.append("markdown")
        sb.append('=')
        sb.append((if ((this.markdown == null)) "<null>" else this.markdown))
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
        result = ((result * 31) + (if ((this.markdown == null)) 0 else markdown.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + (if ((this.text == null)) 0 else text.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is MultiformatMessageString) == false) {
            return false
        }
        val rhs = other
        return ((((this.markdown === rhs.markdown) || ((this.markdown != null) && (this.markdown == rhs.markdown))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        )))) && ((this.text === rhs.text) || ((this.text != null) && (this.text == rhs.text))))
    }
}
