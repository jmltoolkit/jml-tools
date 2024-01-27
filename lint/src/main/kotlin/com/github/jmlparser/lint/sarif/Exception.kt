package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.hashCode

/**
 * Describes a runtime exception encountered during the execution of an analysis tool.
 */
@Generated("jsonschema2pojo")
class Exception {
    /**
     * A string that identifies the kind of exception, for example, the fully qualified type name of an object that was thrown, or the symbolic name of a signal.
     */
    /**
     * A string that identifies the kind of exception, for example, the fully qualified type name of an object that was thrown, or the symbolic name of a signal.
     */
    /**
     * A string that identifies the kind of exception, for example, the fully qualified type name of an object that was thrown, or the symbolic name of a signal.
     */
    @SerializedName("kind")
    @Expose
    var kind: String? = null
    /**
     * A message that describes the exception.
     */
    /**
     * A message that describes the exception.
     */
    /**
     * A message that describes the exception.
     */
    @SerializedName("message")
    @Expose
    var message: String? = null

    /**
     * A call stack that is relevant to a result.
     */
    @SerializedName("stack")
    @Expose
    private var stack: Stack? = null
    /**
     * An array of exception objects each of which is considered a cause of this exception.
     */
    /**
     * An array of exception objects each of which is considered a cause of this exception.
     */
    /**
     * An array of exception objects each of which is considered a cause of this exception.
     */
    @SerializedName("innerExceptions")
    @Expose
    var innerExceptions: List<Exception>? = ArrayList()

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
     * @param stack
     * @param kind
     * @param innerExceptions
     * @param message
     * @param properties
     */
    constructor(
        kind: String?,
        message: String?,
        stack: Stack?,
        innerExceptions: List<Exception>?,
        properties: PropertyBag?
    ) : super() {
        this.kind = kind
        this.message = message
        this.stack = stack
        this.innerExceptions = innerExceptions
        this.properties = properties
    }

    fun withKind(kind: String?): Exception {
        this.kind = kind
        return this
    }

    fun withMessage(message: String?): Exception {
        this.message = message
        return this
    }

    /**
     * A call stack that is relevant to a result.
     */
    fun getStack(): Stack? {
        return stack
    }

    /**
     * A call stack that is relevant to a result.
     */
    fun setStack(stack: Stack?) {
        this.stack = stack
    }

    fun withStack(stack: Stack?): Exception {
        this.stack = stack
        return this
    }

    fun withInnerExceptions(innerExceptions: List<Exception>?): Exception {
        this.innerExceptions = innerExceptions
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

    fun withProperties(properties: PropertyBag?): Exception {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Exception::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("kind")
        sb.append('=')
        sb.append((if ((this.kind == null)) "<null>" else this.kind))
        sb.append(',')
        sb.append("message")
        sb.append('=')
        sb.append((if ((this.message == null)) "<null>" else this.message))
        sb.append(',')
        sb.append("stack")
        sb.append('=')
        sb.append((if ((this.stack == null)) "<null>" else this.stack))
        sb.append(',')
        sb.append("innerExceptions")
        sb.append('=')
        sb.append((if ((this.innerExceptions == null)) "<null>" else this.innerExceptions))
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
        result = ((result * 31) + (if ((this.stack == null)) 0 else stack.hashCode()))
        result = ((result * 31) + (if ((this.innerExceptions == null)) 0 else innerExceptions.hashCode()))
        result = ((result * 31) + (if ((this.message == null)) 0 else message.hashCode()))
        result = ((result * 31) + (if ((this.kind == null)) 0 else kind.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Exception) == false) {
            return false
        }
        val rhs = other
        return ((((((this.stack === rhs.stack) || ((this.stack != null) && stack.equals(rhs.stack))) && ((this.innerExceptions === rhs.innerExceptions) || ((this.innerExceptions != null) && (this.innerExceptions == rhs.innerExceptions)))) && ((this.message === rhs.message) || ((this.message != null) && (this.message == rhs.message)))) && ((this.kind === rhs.kind) || ((this.kind != null) && (this.kind == rhs.kind)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
