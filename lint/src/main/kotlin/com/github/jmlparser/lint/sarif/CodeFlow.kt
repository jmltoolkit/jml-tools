package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * A set of threadFlows which together describe a pattern of code execution relevant to detecting a result.
 */
@Generated("jsonschema2pojo")
class CodeFlow {
    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("message")
    @Expose
    private var message: Message? = null

    /**
     * An array of one or more unique threadFlow objects, each of which describes the progress of a program through a thread of execution.
     * (Required)
     */
    @SerializedName("threadFlows")
    @Expose
    private var threadFlows: List<ThreadFlow>? = ArrayList<ThreadFlow>()

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
     * @param message
     * @param threadFlows
     * @param properties
     */
    constructor(message: Message?, threadFlows: List<ThreadFlow>?, properties: PropertyBag?) : super() {
        this.message = message
        this.threadFlows = threadFlows
        this.properties = properties
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

    fun withMessage(message: Message?): CodeFlow {
        this.message = message
        return this
    }

    /**
     * An array of one or more unique threadFlow objects, each of which describes the progress of a program through a thread of execution.
     * (Required)
     */
    fun getThreadFlows(): List<ThreadFlow>? {
        return threadFlows
    }

    /**
     * An array of one or more unique threadFlow objects, each of which describes the progress of a program through a thread of execution.
     * (Required)
     */
    fun setThreadFlows(threadFlows: List<ThreadFlow>?) {
        this.threadFlows = threadFlows
    }

    fun withThreadFlows(threadFlows: List<ThreadFlow>?): CodeFlow {
        this.threadFlows = threadFlows
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

    fun withProperties(properties: PropertyBag?): CodeFlow {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(CodeFlow::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("message")
        sb.append('=')
        sb.append((if ((this.message == null)) "<null>" else this.message))
        sb.append(',')
        sb.append("threadFlows")
        sb.append('=')
        sb.append((if ((this.threadFlows == null)) "<null>" else this.threadFlows))
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
        result = ((result * 31) + (if ((this.message == null)) 0 else message.hashCode()))
        result = ((result * 31) + (if ((this.threadFlows == null)) 0 else threadFlows.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is CodeFlow) == false) {
            return false
        }
        val rhs = other
        return ((((this.message === rhs.message) || ((this.message != null) && message.equals(rhs.message))) && ((this.threadFlows === rhs.threadFlows) || ((this.threadFlows != null) && (this.threadFlows == rhs.threadFlows)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
