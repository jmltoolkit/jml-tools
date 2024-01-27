package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * A region within an artifact where a result was detected.
 */
@Generated("jsonschema2pojo")
class Region {
    /**
     * The line number of the first character in the region.
     */
    /**
     * The line number of the first character in the region.
     */
    /**
     * The line number of the first character in the region.
     */
    @SerializedName("startLine")
    @Expose
    var startLine: Int = 0
    /**
     * The column number of the first character in the region.
     */
    /**
     * The column number of the first character in the region.
     */
    /**
     * The column number of the first character in the region.
     */
    @SerializedName("startColumn")
    @Expose
    var startColumn: Int = 0
    /**
     * The line number of the last character in the region.
     */
    /**
     * The line number of the last character in the region.
     */
    /**
     * The line number of the last character in the region.
     */
    @SerializedName("endLine")
    @Expose
    var endLine: Int = 0
    /**
     * The column number of the character following the end of the region.
     */
    /**
     * The column number of the character following the end of the region.
     */
    /**
     * The column number of the character following the end of the region.
     */
    @SerializedName("endColumn")
    @Expose
    var endColumn: Int = 0
    /**
     * The zero-based offset from the beginning of the artifact of the first character in the region.
     */
    /**
     * The zero-based offset from the beginning of the artifact of the first character in the region.
     */
    /**
     * The zero-based offset from the beginning of the artifact of the first character in the region.
     */
    @SerializedName("charOffset")
    @Expose
    var charOffset: Int = -1
    /**
     * The length of the region in characters.
     */
    /**
     * The length of the region in characters.
     */
    /**
     * The length of the region in characters.
     */
    @SerializedName("charLength")
    @Expose
    var charLength: Int = 0
    /**
     * The zero-based offset from the beginning of the artifact of the first byte in the region.
     */
    /**
     * The zero-based offset from the beginning of the artifact of the first byte in the region.
     */
    /**
     * The zero-based offset from the beginning of the artifact of the first byte in the region.
     */
    @SerializedName("byteOffset")
    @Expose
    var byteOffset: Int = -1
    /**
     * The length of the region in bytes.
     */
    /**
     * The length of the region in bytes.
     */
    /**
     * The length of the region in bytes.
     */
    @SerializedName("byteLength")
    @Expose
    var byteLength: Int = 0

    /**
     * Represents the contents of an artifact.
     */
    @SerializedName("snippet")
    @Expose
    private var snippet: ArtifactContent? = null

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("message")
    @Expose
    private var message: Message? = null
    /**
     * Specifies the source language, if any, of the portion of the artifact specified by the region object.
     */
    /**
     * Specifies the source language, if any, of the portion of the artifact specified by the region object.
     */
    /**
     * Specifies the source language, if any, of the portion of the artifact specified by the region object.
     */
    @SerializedName("sourceLanguage")
    @Expose
    var sourceLanguage: String? = null

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
     * @param endLine
     * @param snippet
     * @param charOffset
     * @param endColumn
     * @param charLength
     * @param byteOffset
     * @param startColumn
     * @param startLine
     * @param byteLength
     * @param message
     * @param sourceLanguage
     * @param properties
     */
    constructor(
        startLine: Int,
        startColumn: Int,
        endLine: Int,
        endColumn: Int,
        charOffset: Int,
        charLength: Int,
        byteOffset: Int,
        byteLength: Int,
        snippet: ArtifactContent?,
        message: Message?,
        sourceLanguage: String?,
        properties: PropertyBag?
    ) : super() {
        this.startLine = startLine
        this.startColumn = startColumn
        this.endLine = endLine
        this.endColumn = endColumn
        this.charOffset = charOffset
        this.charLength = charLength
        this.byteOffset = byteOffset
        this.byteLength = byteLength
        this.snippet = snippet
        this.message = message
        this.sourceLanguage = sourceLanguage
        this.properties = properties
    }

    fun withStartLine(startLine: Int): Region {
        this.startLine = startLine
        return this
    }

    fun withStartColumn(startColumn: Int): Region {
        this.startColumn = startColumn
        return this
    }

    fun withEndLine(endLine: Int): Region {
        this.endLine = endLine
        return this
    }

    fun withEndColumn(endColumn: Int): Region {
        this.endColumn = endColumn
        return this
    }

    fun withCharOffset(charOffset: Int): Region {
        this.charOffset = charOffset
        return this
    }

    fun withCharLength(charLength: Int): Region {
        this.charLength = charLength
        return this
    }

    fun withByteOffset(byteOffset: Int): Region {
        this.byteOffset = byteOffset
        return this
    }

    fun withByteLength(byteLength: Int): Region {
        this.byteLength = byteLength
        return this
    }

    /**
     * Represents the contents of an artifact.
     */
    fun getSnippet(): ArtifactContent? {
        return snippet
    }

    /**
     * Represents the contents of an artifact.
     */
    fun setSnippet(snippet: ArtifactContent?) {
        this.snippet = snippet
    }

    fun withSnippet(snippet: ArtifactContent?): Region {
        this.snippet = snippet
        return this
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    fun getMessage(): Message? {
        return message
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    fun setMessage(message: Message?) {
        this.message = message
    }

    fun withMessage(message: Message?): Region {
        this.message = message
        return this
    }

    fun withSourceLanguage(sourceLanguage: String?): Region {
        this.sourceLanguage = sourceLanguage
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

    fun withProperties(properties: PropertyBag?): Region {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Region::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("startLine")
        sb.append('=')
        sb.append(this.startLine)
        sb.append(',')
        sb.append("startColumn")
        sb.append('=')
        sb.append(this.startColumn)
        sb.append(',')
        sb.append("endLine")
        sb.append('=')
        sb.append(this.endLine)
        sb.append(',')
        sb.append("endColumn")
        sb.append('=')
        sb.append(this.endColumn)
        sb.append(',')
        sb.append("charOffset")
        sb.append('=')
        sb.append(this.charOffset)
        sb.append(',')
        sb.append("charLength")
        sb.append('=')
        sb.append(this.charLength)
        sb.append(',')
        sb.append("byteOffset")
        sb.append('=')
        sb.append(this.byteOffset)
        sb.append(',')
        sb.append("byteLength")
        sb.append('=')
        sb.append(this.byteLength)
        sb.append(',')
        sb.append("snippet")
        sb.append('=')
        sb.append((if ((this.snippet == null)) "<null>" else this.snippet))
        sb.append(',')
        sb.append("message")
        sb.append('=')
        sb.append((if ((this.message == null)) "<null>" else this.message))
        sb.append(',')
        sb.append("sourceLanguage")
        sb.append('=')
        sb.append((if ((this.sourceLanguage == null)) "<null>" else this.sourceLanguage))
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
        result = ((result * 31) + this.endLine)
        result = ((result * 31) + (if ((this.snippet == null)) 0 else snippet.hashCode()))
        result = ((result * 31) + this.charOffset)
        result = ((result * 31) + this.endColumn)
        result = ((result * 31) + this.charLength)
        result = ((result * 31) + this.byteOffset)
        result = ((result * 31) + this.startColumn)
        result = ((result * 31) + this.startLine)
        result = ((result * 31) + this.byteLength)
        result = ((result * 31) + (if ((this.message == null)) 0 else message.hashCode()))
        result = ((result * 31) + (if ((this.sourceLanguage == null)) 0 else sourceLanguage.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Region) == false) {
            return false
        }
        val rhs = other
        return ((((((((((((this.endLine == rhs.endLine) && ((this.snippet === rhs.snippet) || ((this.snippet != null) && snippet.equals(
            rhs.snippet
        )))) && (this.charOffset == rhs.charOffset)) && (this.endColumn == rhs.endColumn)) && (this.charLength == rhs.charLength)) && (this.byteOffset == rhs.byteOffset)) && (this.startColumn == rhs.startColumn)) && (this.startLine == rhs.startLine)) && (this.byteLength == rhs.byteLength)) && ((this.message === rhs.message) || ((this.message != null) && message.equals(
            rhs.message
        )))) && ((this.sourceLanguage === rhs.sourceLanguage) || ((this.sourceLanguage != null) && (this.sourceLanguage == rhs.sourceLanguage)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
