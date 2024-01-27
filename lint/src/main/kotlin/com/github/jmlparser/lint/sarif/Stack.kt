package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * A call stack that is relevant to a result.
 */
@Generated("jsonschema2pojo")
class Stack {
    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("message")
    @Expose
    private var message: Message? = null

    /**
     * An array of stack frames that represents a sequence of calls, rendered in reverse chronological order, that comprise the call stack.
     * (Required)
     */
    @SerializedName("frames")
    @Expose
    private var frames: List<StackFrame>? = ArrayList<StackFrame>()

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
     * @param frames
     * @param message
     * @param properties
     */
    constructor(message: Message?, frames: List<StackFrame>?, properties: PropertyBag?) : super() {
        this.message = message
        this.frames = frames
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

    fun withMessage(message: Message?): Stack {
        this.message = message
        return this
    }

    /**
     * An array of stack frames that represents a sequence of calls, rendered in reverse chronological order, that comprise the call stack.
     * (Required)
     */
    fun getFrames(): List<StackFrame>? {
        return frames
    }

    /**
     * An array of stack frames that represents a sequence of calls, rendered in reverse chronological order, that comprise the call stack.
     * (Required)
     */
    fun setFrames(frames: List<StackFrame>?) {
        this.frames = frames
    }

    fun withFrames(frames: List<StackFrame>?): Stack {
        this.frames = frames
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

    fun withProperties(properties: PropertyBag?): Stack {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Stack::class.java.name).append('@').append(
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
        sb.append("frames")
        sb.append('=')
        sb.append((if ((this.frames == null)) "<null>" else this.frames))
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
        result = ((result * 31) + (if ((this.frames == null)) 0 else frames.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Stack) == false) {
            return false
        }
        val rhs = other
        return ((((this.message === rhs.message) || ((this.message != null) && message.equals(rhs.message))) && ((this.frames === rhs.frames) || ((this.frames != null) && (this.frames == rhs.frames)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
