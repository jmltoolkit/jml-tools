package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Describes the response to an HTTP request.
 */
@Generated("jsonschema2pojo")
class WebResponse {
    /**
     * The index within the run.webResponses array of the response object associated with this result.
     */
    /**
     * The index within the run.webResponses array of the response object associated with this result.
     */
    /**
     * The index within the run.webResponses array of the response object associated with this result.
     */
    @SerializedName("index")
    @Expose
    var index: Int = -1
    /**
     * The response protocol. Example: 'http'.
     */
    /**
     * The response protocol. Example: 'http'.
     */
    /**
     * The response protocol. Example: 'http'.
     */
    @SerializedName("protocol")
    @Expose
    var protocol: String? = null
    /**
     * The response version. Example: '1.1'.
     */
    /**
     * The response version. Example: '1.1'.
     */
    /**
     * The response version. Example: '1.1'.
     */
    @SerializedName("version")
    @Expose
    var version: String? = null
    /**
     * The response status code. Example: 451.
     */
    /**
     * The response status code. Example: 451.
     */
    /**
     * The response status code. Example: 451.
     */
    @SerializedName("statusCode")
    @Expose
    var statusCode: Int = 0
    /**
     * The response reason. Example: 'Not found'.
     */
    /**
     * The response reason. Example: 'Not found'.
     */
    /**
     * The response reason. Example: 'Not found'.
     */
    @SerializedName("reasonPhrase")
    @Expose
    var reasonPhrase: String? = null

    /**
     * The response headers.
     */
    @SerializedName("headers")
    @Expose
    private var headers: Headers__1? = null

    /**
     * Represents the contents of an artifact.
     */
    @SerializedName("body")
    @Expose
    private var body: ArtifactContent? = null
    /**
     * Specifies whether a response was received from the server.
     */
    /**
     * Specifies whether a response was received from the server.
     */
    /**
     * Specifies whether a response was received from the server.
     */
    @SerializedName("noResponseReceived")
    @Expose
    var isNoResponseReceived: Boolean = false

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
     * @param headers
     * @param protocol
     * @param reasonPhrase
     * @param noResponseReceived
     * @param index
     * @param body
     * @param version
     * @param properties
     * @param statusCode
     */
    constructor(
        index: Int,
        protocol: String?,
        version: String?,
        statusCode: Int,
        reasonPhrase: String?,
        headers: Headers__1?,
        body: ArtifactContent?,
        noResponseReceived: Boolean,
        properties: PropertyBag?
    ) : super() {
        this.index = index
        this.protocol = protocol
        this.version = version
        this.statusCode = statusCode
        this.reasonPhrase = reasonPhrase
        this.headers = headers
        this.body = body
        this.isNoResponseReceived = noResponseReceived
        this.properties = properties
    }

    fun withIndex(index: Int): WebResponse {
        this.index = index
        return this
    }

    fun withProtocol(protocol: String?): WebResponse {
        this.protocol = protocol
        return this
    }

    fun withVersion(version: String?): WebResponse {
        this.version = version
        return this
    }

    fun withStatusCode(statusCode: Int): WebResponse {
        this.statusCode = statusCode
        return this
    }

    fun withReasonPhrase(reasonPhrase: String?): WebResponse {
        this.reasonPhrase = reasonPhrase
        return this
    }

    /**
     * The response headers.
     */
    fun getHeaders(): Headers__1? {
        return headers
    }

    /**
     * The response headers.
     */
    fun setHeaders(headers: Headers__1?) {
        this.headers = headers
    }

    fun withHeaders(headers: Headers__1?): WebResponse {
        this.headers = headers
        return this
    }

    /**
     * Represents the contents of an artifact.
     */
    fun getBody(): ArtifactContent? {
        return body
    }

    /**
     * Represents the contents of an artifact.
     */
    fun setBody(body: ArtifactContent?) {
        this.body = body
    }

    fun withBody(body: ArtifactContent?): WebResponse {
        this.body = body
        return this
    }

    fun withNoResponseReceived(noResponseReceived: Boolean): WebResponse {
        this.isNoResponseReceived = noResponseReceived
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

    fun withProperties(properties: PropertyBag?): WebResponse {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(WebResponse::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("index")
        sb.append('=')
        sb.append(this.index)
        sb.append(',')
        sb.append("protocol")
        sb.append('=')
        sb.append((if ((this.protocol == null)) "<null>" else this.protocol))
        sb.append(',')
        sb.append("version")
        sb.append('=')
        sb.append((if ((this.version == null)) "<null>" else this.version))
        sb.append(',')
        sb.append("statusCode")
        sb.append('=')
        sb.append(this.statusCode)
        sb.append(',')
        sb.append("reasonPhrase")
        sb.append('=')
        sb.append((if ((this.reasonPhrase == null)) "<null>" else this.reasonPhrase))
        sb.append(',')
        sb.append("headers")
        sb.append('=')
        sb.append((if ((this.headers == null)) "<null>" else this.headers))
        sb.append(',')
        sb.append("body")
        sb.append('=')
        sb.append((if ((this.body == null)) "<null>" else this.body))
        sb.append(',')
        sb.append("noResponseReceived")
        sb.append('=')
        sb.append(this.isNoResponseReceived)
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
        result = ((result * 31) + (if ((this.headers == null)) 0 else headers.hashCode()))
        result = ((result * 31) + (if ((this.protocol == null)) 0 else protocol.hashCode()))
        result = ((result * 31) + (if ((this.reasonPhrase == null)) 0 else reasonPhrase.hashCode()))
        result = ((result * 31) + (if (this.isNoResponseReceived) 1 else 0))
        result = ((result * 31) + this.index)
        result = ((result * 31) + (if ((this.body == null)) 0 else body.hashCode()))
        result = ((result * 31) + (if ((this.version == null)) 0 else version.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + this.statusCode)
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is WebResponse) == false) {
            return false
        }
        val rhs = other
        return ((((((((((this.headers === rhs.headers) || ((this.headers != null) && headers.equals(rhs.headers))) && ((this.protocol === rhs.protocol) || ((this.protocol != null) && (this.protocol == rhs.protocol)))) && ((this.reasonPhrase === rhs.reasonPhrase) || ((this.reasonPhrase != null) && (this.reasonPhrase == rhs.reasonPhrase)))) && (this.isNoResponseReceived == rhs.isNoResponseReceived)) && (this.index == rhs.index)) && ((this.body === rhs.body) || ((this.body != null) && body.equals(
            rhs.body
        )))) && ((this.version === rhs.version) || ((this.version != null) && (this.version == rhs.version)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        )))) && (this.statusCode == rhs.statusCode))
    }
}
