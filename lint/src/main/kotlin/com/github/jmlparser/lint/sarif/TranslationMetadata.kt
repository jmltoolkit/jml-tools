package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import java.net.URI
import javax.annotation.processing.Generated

/**
 * Provides additional metadata related to translation.
 */
@Generated("jsonschema2pojo")
class TranslationMetadata {
    /**
     * The name associated with the translation metadata.
     * (Required)
     */
    /**
     * The name associated with the translation metadata.
     * (Required)
     */
    /**
     * The name associated with the translation metadata.
     * (Required)
     */
    @SerializedName("name")
    @Expose
    var name: String? = null
    /**
     * The full name associated with the translation metadata.
     */
    /**
     * The full name associated with the translation metadata.
     */
    /**
     * The full name associated with the translation metadata.
     */
    @SerializedName("fullName")
    @Expose
    var fullName: String? = null

    /**
     * A message string or message format string rendered in multiple formats.
     */
    @SerializedName("shortDescription")
    @Expose
    private var shortDescription: MultiformatMessageString? = null

    /**
     * A message string or message format string rendered in multiple formats.
     */
    @SerializedName("fullDescription")
    @Expose
    private var fullDescription: MultiformatMessageString? = null
    /**
     * The absolute URI from which the translation metadata can be downloaded.
     */
    /**
     * The absolute URI from which the translation metadata can be downloaded.
     */
    /**
     * The absolute URI from which the translation metadata can be downloaded.
     */
    @SerializedName("downloadUri")
    @Expose
    var downloadUri: URI? = null
    /**
     * The absolute URI from which information related to the translation metadata can be downloaded.
     */
    /**
     * The absolute URI from which information related to the translation metadata can be downloaded.
     */
    /**
     * The absolute URI from which information related to the translation metadata can be downloaded.
     */
    @SerializedName("informationUri")
    @Expose
    var informationUri: URI? = null

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
     * @param name
     * @param fullName
     * @param shortDescription
     * @param downloadUri
     * @param fullDescription
     * @param informationUri
     * @param properties
     */
    constructor(
        name: String?,
        fullName: String?,
        shortDescription: MultiformatMessageString?,
        fullDescription: MultiformatMessageString?,
        downloadUri: URI?,
        informationUri: URI?,
        properties: PropertyBag?
    ) : super() {
        this.name = name
        this.fullName = fullName
        this.shortDescription = shortDescription
        this.fullDescription = fullDescription
        this.downloadUri = downloadUri
        this.informationUri = informationUri
        this.properties = properties
    }

    fun withName(name: String?): TranslationMetadata {
        this.name = name
        return this
    }

    fun withFullName(fullName: String?): TranslationMetadata {
        this.fullName = fullName
        return this
    }

    /**
     * A message string or message format string rendered in multiple formats.
     */
    fun getShortDescription(): MultiformatMessageString? {
        return shortDescription
    }

    /**
     * A message string or message format string rendered in multiple formats.
     */
    fun setShortDescription(shortDescription: MultiformatMessageString?) {
        this.shortDescription = shortDescription
    }

    fun withShortDescription(shortDescription: MultiformatMessageString?): TranslationMetadata {
        this.shortDescription = shortDescription
        return this
    }

    /**
     * A message string or message format string rendered in multiple formats.
     */
    fun getFullDescription(): MultiformatMessageString? {
        return fullDescription
    }

    /**
     * A message string or message format string rendered in multiple formats.
     */
    fun setFullDescription(fullDescription: MultiformatMessageString?) {
        this.fullDescription = fullDescription
    }

    fun withFullDescription(fullDescription: MultiformatMessageString?): TranslationMetadata {
        this.fullDescription = fullDescription
        return this
    }

    fun withDownloadUri(downloadUri: URI?): TranslationMetadata {
        this.downloadUri = downloadUri
        return this
    }

    fun withInformationUri(informationUri: URI?): TranslationMetadata {
        this.informationUri = informationUri
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

    fun withProperties(properties: PropertyBag?): TranslationMetadata {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(TranslationMetadata::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("name")
        sb.append('=')
        sb.append((if ((this.name == null)) "<null>" else this.name))
        sb.append(',')
        sb.append("fullName")
        sb.append('=')
        sb.append((if ((this.fullName == null)) "<null>" else this.fullName))
        sb.append(',')
        sb.append("shortDescription")
        sb.append('=')
        sb.append((if ((this.shortDescription == null)) "<null>" else this.shortDescription))
        sb.append(',')
        sb.append("fullDescription")
        sb.append('=')
        sb.append((if ((this.fullDescription == null)) "<null>" else this.fullDescription))
        sb.append(',')
        sb.append("downloadUri")
        sb.append('=')
        sb.append((if ((this.downloadUri == null)) "<null>" else this.downloadUri))
        sb.append(',')
        sb.append("informationUri")
        sb.append('=')
        sb.append((if ((this.informationUri == null)) "<null>" else this.informationUri))
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
        result = ((result * 31) + (if ((this.name == null)) 0 else name.hashCode()))
        result = ((result * 31) + (if ((this.fullName == null)) 0 else fullName.hashCode()))
        result = ((result * 31) + (if ((this.shortDescription == null)) 0 else shortDescription.hashCode()))
        result = ((result * 31) + (if ((this.downloadUri == null)) 0 else downloadUri.hashCode()))
        result = ((result * 31) + (if ((this.fullDescription == null)) 0 else fullDescription.hashCode()))
        result = ((result * 31) + (if ((this.informationUri == null)) 0 else informationUri.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is TranslationMetadata) == false) {
            return false
        }
        val rhs = other
        return ((((((((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name))) && ((this.fullName === rhs.fullName) || ((this.fullName != null) && (this.fullName == rhs.fullName)))) && ((this.shortDescription === rhs.shortDescription) || ((this.shortDescription != null) && shortDescription.equals(
            rhs.shortDescription
        )))) && ((this.downloadUri === rhs.downloadUri) || ((this.downloadUri != null) && (this.downloadUri == rhs.downloadUri)))) && ((this.fullDescription === rhs.fullDescription) || ((this.fullDescription != null) && fullDescription.equals(
            rhs.fullDescription
        )))) && ((this.informationUri === rhs.informationUri) || ((this.informationUri != null) && (this.informationUri == rhs.informationUri)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
