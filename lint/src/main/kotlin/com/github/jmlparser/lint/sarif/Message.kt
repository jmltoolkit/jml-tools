package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Encapsulates a message intended to be read by the end user.
 */
@Generated("jsonschema2pojo")
class Message {
    /**
     * A plain text message string.
     */
    /**
     * A plain text message string.
     */
    /**
     * A plain text message string.
     */
    @SerializedName("text")
    @Expose
    var text: String? = null
    /**
     * A Markdown message string.
     */
    /**
     * A Markdown message string.
     */
    /**
     * A Markdown message string.
     */
    @SerializedName("markdown")
    @Expose
    var markdown: String? = null
    /**
     * The identifier for this message.
     */
    /**
     * The identifier for this message.
     */
    /**
     * The identifier for this message.
     */
    @SerializedName("id")
    @Expose
    var id: String? = null
    /**
     * An array of strings to substitute into the message string.
     */
    /**
     * An array of strings to substitute into the message string.
     */
    /**
     * An array of strings to substitute into the message string.
     */
    @SerializedName("arguments")
    @Expose
    var arguments: List<String>? = ArrayList()

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
     * @param arguments
     * @param text
     * @param id
     * @param properties
     */
    constructor(
        text: String?,
        markdown: String?,
        id: String?,
        arguments: List<String>?,
        properties: PropertyBag?
    ) : super() {
        this.text = text
        this.markdown = markdown
        this.id = id
        this.arguments = arguments
        this.properties = properties
    }

    fun withText(text: String?): Message {
        this.text = text
        return this
    }

    fun withMarkdown(markdown: String?): Message {
        this.markdown = markdown
        return this
    }

    fun withId(id: String?): Message {
        this.id = id
        return this
    }

    fun withArguments(arguments: List<String>?): Message {
        this.arguments = arguments
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

    fun withProperties(properties: PropertyBag?): Message {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Message::class.java.name).append('@').append(
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
        sb.append("id")
        sb.append('=')
        sb.append((if ((this.id == null)) "<null>" else this.id))
        sb.append(',')
        sb.append("arguments")
        sb.append('=')
        sb.append((if ((this.arguments == null)) "<null>" else this.arguments))
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
        result = ((result * 31) + (if ((this.arguments == null)) 0 else arguments.hashCode()))
        result = ((result * 31) + (if ((this.text == null)) 0 else text.hashCode()))
        result = ((result * 31) + (if ((this.id == null)) 0 else id.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Message) == false) {
            return false
        }
        val rhs = other
        return ((((((this.markdown === rhs.markdown) || ((this.markdown != null) && (this.markdown == rhs.markdown))) && ((this.arguments === rhs.arguments) || ((this.arguments != null) && (this.arguments == rhs.arguments)))) && ((this.text === rhs.text) || ((this.text != null) && (this.text == rhs.text)))) && ((this.id === rhs.id) || ((this.id != null) && (this.id == rhs.id)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
