package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * A function call within a stack trace.
 */
@Generated("jsonschema2pojo")
class StackFrame {
    /**
     * A location within a programming artifact.
     */
    @SerializedName("location")
    @Expose
    private var location: Location? = null
    /**
     * The name of the module that contains the code of this stack frame.
     */
    /**
     * The name of the module that contains the code of this stack frame.
     */
    /**
     * The name of the module that contains the code of this stack frame.
     */
    @SerializedName("module")
    @Expose
    var module: String? = null
    /**
     * The thread identifier of the stack frame.
     */
    /**
     * The thread identifier of the stack frame.
     */
    /**
     * The thread identifier of the stack frame.
     */
    @SerializedName("threadId")
    @Expose
    var threadId: Int = 0
    /**
     * The parameters of the call that is executing.
     */
    /**
     * The parameters of the call that is executing.
     */
    /**
     * The parameters of the call that is executing.
     */
    @SerializedName("parameters")
    @Expose
    var parameters: List<String>? = ArrayList()

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
     * @param threadId
     * @param module
     * @param location
     * @param parameters
     * @param properties
     */
    constructor(
        location: Location?,
        module: String?,
        threadId: Int,
        parameters: List<String>?,
        properties: PropertyBag?
    ) : super() {
        this.location = location
        this.module = module
        this.threadId = threadId
        this.parameters = parameters
        this.properties = properties
    }

    /**
     * A location within a programming artifact.
     */
    fun getLocation(): Location? {
        return location
    }

    /**
     * A location within a programming artifact.
     */
    fun setLocation(location: Location?) {
        this.location = location
    }

    fun withLocation(location: Location?): StackFrame {
        this.location = location
        return this
    }

    fun withModule(module: String?): StackFrame {
        this.module = module
        return this
    }

    fun withThreadId(threadId: Int): StackFrame {
        this.threadId = threadId
        return this
    }

    fun withParameters(parameters: List<String>?): StackFrame {
        this.parameters = parameters
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

    fun withProperties(properties: PropertyBag?): StackFrame {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(StackFrame::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("location")
        sb.append('=')
        sb.append((if ((this.location == null)) "<null>" else this.location))
        sb.append(',')
        sb.append("module")
        sb.append('=')
        sb.append((if ((this.module == null)) "<null>" else this.module))
        sb.append(',')
        sb.append("threadId")
        sb.append('=')
        sb.append(this.threadId)
        sb.append(',')
        sb.append("parameters")
        sb.append('=')
        sb.append((if ((this.parameters == null)) "<null>" else this.parameters))
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
        result = ((result * 31) + this.threadId)
        result = ((result * 31) + (if ((this.location == null)) 0 else location.hashCode()))
        result = ((result * 31) + (if ((this.parameters == null)) 0 else parameters.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + (if ((this.module == null)) 0 else module.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is StackFrame) == false) {
            return false
        }
        val rhs = other
        return (((((this.threadId == rhs.threadId) && ((this.location === rhs.location) || ((this.location != null) && location.equals(
            rhs.location
        )))) && ((this.parameters === rhs.parameters) || ((this.parameters != null) && (this.parameters == rhs.parameters)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        )))) && ((this.module === rhs.module) || ((this.module != null) && (this.module == rhs.module))))
    }
}
