package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * An area within an image.
 */
@Generated("jsonschema2pojo")
class Rectangle {
    /**
     * The Y coordinate of the top edge of the rectangle, measured in the image's natural units.
     */
    /**
     * The Y coordinate of the top edge of the rectangle, measured in the image's natural units.
     */
    /**
     * The Y coordinate of the top edge of the rectangle, measured in the image's natural units.
     */
    @SerializedName("top")
    @Expose
    var top: Double = 0.0
    /**
     * The X coordinate of the left edge of the rectangle, measured in the image's natural units.
     */
    /**
     * The X coordinate of the left edge of the rectangle, measured in the image's natural units.
     */
    /**
     * The X coordinate of the left edge of the rectangle, measured in the image's natural units.
     */
    @SerializedName("left")
    @Expose
    var left: Double = 0.0
    /**
     * The Y coordinate of the bottom edge of the rectangle, measured in the image's natural units.
     */
    /**
     * The Y coordinate of the bottom edge of the rectangle, measured in the image's natural units.
     */
    /**
     * The Y coordinate of the bottom edge of the rectangle, measured in the image's natural units.
     */
    @SerializedName("bottom")
    @Expose
    var bottom: Double = 0.0
    /**
     * The X coordinate of the right edge of the rectangle, measured in the image's natural units.
     */
    /**
     * The X coordinate of the right edge of the rectangle, measured in the image's natural units.
     */
    /**
     * The X coordinate of the right edge of the rectangle, measured in the image's natural units.
     */
    @SerializedName("right")
    @Expose
    var right: Double = 0.0

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("message")
    @Expose
    private var message: Message? = null

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
     * @param top
     * @param left
     * @param bottom
     * @param right
     * @param message
     * @param properties
     */
    constructor(
        top: Double,
        left: Double,
        bottom: Double,
        right: Double,
        message: Message?,
        properties: PropertyBag?
    ) : super() {
        this.top = top
        this.left = left
        this.bottom = bottom
        this.right = right
        this.message = message
        this.properties = properties
    }

    fun withTop(top: Double): Rectangle {
        this.top = top
        return this
    }

    fun withLeft(left: Double): Rectangle {
        this.left = left
        return this
    }

    fun withBottom(bottom: Double): Rectangle {
        this.bottom = bottom
        return this
    }

    fun withRight(right: Double): Rectangle {
        this.right = right
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

    fun withMessage(message: Message?): Rectangle {
        this.message = message
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

    fun withProperties(properties: PropertyBag?): Rectangle {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Rectangle::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("top")
        sb.append('=')
        sb.append(this.top)
        sb.append(',')
        sb.append("left")
        sb.append('=')
        sb.append(this.left)
        sb.append(',')
        sb.append("bottom")
        sb.append('=')
        sb.append(this.bottom)
        sb.append(',')
        sb.append("right")
        sb.append('=')
        sb.append(this.right)
        sb.append(',')
        sb.append("message")
        sb.append('=')
        sb.append((if ((this.message == null)) "<null>" else this.message))
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
        result =
            ((result * 31) + ((java.lang.Double.doubleToLongBits(this.right) xor (java.lang.Double.doubleToLongBits(
                this.right
            ) ushr 32)).toInt()))
        result = ((result * 31) + ((java.lang.Double.doubleToLongBits(this.top) xor (java.lang.Double.doubleToLongBits(
            this.top
        ) ushr 32)).toInt()))
        result = ((result * 31) + (if ((this.message == null)) 0 else message.hashCode()))
        result = ((result * 31) + ((java.lang.Double.doubleToLongBits(this.left) xor (java.lang.Double.doubleToLongBits(
            this.left
        ) ushr 32)).toInt()))
        result =
            ((result * 31) + ((java.lang.Double.doubleToLongBits(this.bottom) xor (java.lang.Double.doubleToLongBits(
                this.bottom
            ) ushr 32)).toInt()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Rectangle) == false) {
            return false
        }
        val rhs = other
        return ((((((java.lang.Double.doubleToLongBits(this.right) == java.lang.Double.doubleToLongBits(rhs.right)) && (java.lang.Double.doubleToLongBits(
            this.top
        ) == java.lang.Double.doubleToLongBits(rhs.top))) && ((this.message === rhs.message) || ((this.message != null) && message.equals(
            rhs.message
        )))) && (java.lang.Double.doubleToLongBits(
            this.left
        ) == java.lang.Double.doubleToLongBits(rhs.left))) && (java.lang.Double.doubleToLongBits(this.bottom) == java.lang.Double.doubleToLongBits(
            rhs.bottom
        ))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(rhs.properties))))
    }
}
