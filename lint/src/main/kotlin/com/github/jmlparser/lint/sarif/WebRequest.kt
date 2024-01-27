package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Describes an HTTP request.
 */
@Generated("jsonschema2pojo")
class WebRequest {
    /**
     * The index within the run.webRequests array of the request object associated with this result.
     */
    /**
     * The index within the run.webRequests array of the request object associated with this result.
     */
    /**
     * The index within the run.webRequests array of the request object associated with this result.
     */
    @SerializedName("index")
    @Expose
    var index: Int = -1
    /**
     * The request protocol. Example: 'http'.
     */
    /**
     * The request protocol. Example: 'http'.
     */
    /**
     * The request protocol. Example: 'http'.
     */
    @SerializedName("protocol")
    @Expose
    var protocol: String? = null
    /**
     * The request version. Example: '1.1'.
     */
    /**
     * The request version. Example: '1.1'.
     */
    /**
     * The request version. Example: '1.1'.
     */
    @SerializedName("version")
    @Expose
    var version: String? = null
    /**
     * The target of the request.
     */
    /**
     * The target of the request.
     */
    /**
     * The target of the request.
     */
    @SerializedName("target")
    @Expose
    var target: String? = null
    /**
     * The HTTP method. Well-known values are 'GET', 'PUT', 'POST', 'DELETE', 'PATCH', 'HEAD', 'OPTIONS', 'TRACE', 'CONNECT'.
     */
    /**
     * The HTTP method. Well-known values are 'GET', 'PUT', 'POST', 'DELETE', 'PATCH', 'HEAD', 'OPTIONS', 'TRACE', 'CONNECT'.
     */
    /**
     * The HTTP method. Well-known values are 'GET', 'PUT', 'POST', 'DELETE', 'PATCH', 'HEAD', 'OPTIONS', 'TRACE', 'CONNECT'.
     */
    @SerializedName("method")
    @Expose
    var method: String? = null

    /**
     * The request headers.
     */
    @SerializedName("headers")
    @Expose
    private var headers: Headers? = null

    /**
     * The request parameters.
     */
    @SerializedName("parameters")
    @Expose
    private var parameters: Parameters? = null

    /**
     * Represents the contents of an artifact.
     */
    @SerializedName("body")
    @Expose
    private var body: ArtifactContent? = null

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
     * @param method
     * @param index
     * @param body
     * @param version
     * @param parameters
     * @param properties
     * @param target
     */
    constructor(
        index: Int,
        protocol: String?,
        version: String?,
        target: String?,
        method: String?,
        headers: Headers?,
        parameters: Parameters?,
        body: ArtifactContent?,
        properties: PropertyBag?
    ) : super() {
        this.index = index
        this.protocol = protocol
        this.version = version
        this.target = target
        this.method = method
        this.headers = headers
        this.parameters = parameters
        this.body = body
        this.properties = properties
    }

    fun withIndex(index: Int): WebRequest {
        this.index = index
        return this
    }

    fun withProtocol(protocol: String?): WebRequest {
        this.protocol = protocol
        return this
    }

    fun withVersion(version: String?): WebRequest {
        this.version = version
        return this
    }

    fun withTarget(target: String?): WebRequest {
        this.target = target
        return this
    }

    fun withMethod(method: String?): WebRequest {
        this.method = method
        return this
    }

    /**
     * The request headers.
     */
    fun getHeaders(): Headers? {
        return headers
    }

    /**
     * The request headers.
     */
    fun setHeaders(headers: Headers?) {
        this.headers = headers
    }

    fun withHeaders(headers: Headers?): WebRequest {
        this.headers = headers
        return this
    }

    /**
     * The request parameters.
     */
    fun getParameters(): Parameters? {
        return parameters
    }

    /**
     * The request parameters.
     */
    fun setParameters(parameters: Parameters?) {
        this.parameters = parameters
    }

    fun withParameters(parameters: Parameters?): WebRequest {
        this.parameters = parameters
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

    fun withBody(body: ArtifactContent?): WebRequest {
        this.body = body
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

    fun withProperties(properties: PropertyBag?): WebRequest {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(WebRequest::class.java.name).append('@').append(
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
        sb.append("target")
        sb.append('=')
        sb.append((if ((this.target == null)) "<null>" else this.target))
        sb.append(',')
        sb.append("method")
        sb.append('=')
        sb.append((if ((this.method == null)) "<null>" else this.method))
        sb.append(',')
        sb.append("headers")
        sb.append('=')
        sb.append((if ((this.headers == null)) "<null>" else this.headers))
        sb.append(',')
        sb.append("parameters")
        sb.append('=')
        sb.append((if ((this.parameters == null)) "<null>" else this.parameters))
        sb.append(',')
        sb.append("body")
        sb.append('=')
        sb.append((if ((this.body == null)) "<null>" else this.body))
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
        result = ((result * 31) + (if ((this.method == null)) 0 else method.hashCode()))
        result = ((result * 31) + this.index)
        result = ((result * 31) + (if ((this.body == null)) 0 else body.hashCode()))
        result = ((result * 31) + (if ((this.version == null)) 0 else version.hashCode()))
        result = ((result * 31) + (if ((this.parameters == null)) 0 else parameters.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + (if ((this.target == null)) 0 else target.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is WebRequest) == false) {
            return false
        }
        val rhs = other
        return ((((((((((this.headers === rhs.headers) || ((this.headers != null) && headers.equals(rhs.headers))) && ((this.protocol === rhs.protocol) || ((this.protocol != null) && (this.protocol == rhs.protocol)))) && ((this.method === rhs.method) || ((this.method != null) && (this.method == rhs.method)))) && (this.index == rhs.index)) && ((this.body === rhs.body) || ((this.body != null) && body.equals(
            rhs.body
        )))) && ((this.version === rhs.version) || ((this.version != null) && (this.version == rhs.version)))) && ((this.parameters === rhs.parameters) || ((this.parameters != null) && parameters.equals(
            rhs.parameters
        )))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(rhs.properties)))) && ((this.target === rhs.target) || ((this.target != null) && (this.target == rhs.target))))
    }
}
