package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import java.util.*
import javax.annotation.processing.Generated

/**
 * Describes a condition relevant to the tool itself, as opposed to being relevant to a target being analyzed by the tool.
 */
@Generated("jsonschema2pojo")
class Notification {
    /**
     * The locations relevant to this notification.
     */
    @SerializedName("locations")
    @Expose
    private var locations: Set<Location>? = LinkedHashSet<Location>()

    /**
     * Encapsulates a message intended to be read by the end user.
     * (Required)
     */
    @SerializedName("message")
    @Expose
    private var message: Message? = null
    /**
     * A value specifying the severity level of the notification.
     */
    /**
     * A value specifying the severity level of the notification.
     */
    /**
     * A value specifying the severity level of the notification.
     */
    @SerializedName("level")
    @Expose
    var level: Level? = Level.fromValue("warning")
    /**
     * The thread identifier of the code that generated the notification.
     */
    /**
     * The thread identifier of the code that generated the notification.
     */
    /**
     * The thread identifier of the code that generated the notification.
     */
    @SerializedName("threadId")
    @Expose
    var threadId: Int = 0
    /**
     * The Coordinated Universal Time (UTC) date and time at which the analysis tool generated the notification.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which the analysis tool generated the notification.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which the analysis tool generated the notification.
     */
    @SerializedName("timeUtc")
    @Expose
    var timeUtc: Date? = null
    /**
     * Describes a runtime exception encountered during the execution of an analysis tool.
     */
    /**
     * Describes a runtime exception encountered during the execution of an analysis tool.
     */
    /**
     * Describes a runtime exception encountered during the execution of an analysis tool.
     */
    @SerializedName("exception")
    @Expose
    var exception: Exception? = null

    /**
     * Information about how to locate a relevant reporting descriptor.
     */
    @SerializedName("descriptor")
    @Expose
    private var descriptor: ReportingDescriptorReference? = null

    /**
     * Information about how to locate a relevant reporting descriptor.
     */
    @SerializedName("associatedRule")
    @Expose
    private var associatedRule: ReportingDescriptorReference? = null

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
     * @param exception
     * @param level
     * @param associatedRule
     * @param timeUtc
     * @param locations
     * @param descriptor
     * @param message
     * @param properties
     */
    constructor(
        locations: Set<Location>?,
        message: Message?,
        level: Level?,
        threadId: Int,
        timeUtc: Date?,
        exception: Exception?,
        descriptor: ReportingDescriptorReference?,
        associatedRule: ReportingDescriptorReference?,
        properties: PropertyBag?
    ) : super() {
        this.locations = locations
        this.message = message
        this.level = level
        this.threadId = threadId
        this.timeUtc = timeUtc
        this.exception = exception
        this.descriptor = descriptor
        this.associatedRule = associatedRule
        this.properties = properties
    }

    /**
     * The locations relevant to this notification.
     */
    fun getLocations(): Set<Location>? {
        return locations
    }

    /**
     * The locations relevant to this notification.
     */
    fun setLocations(locations: Set<Location>?) {
        this.locations = locations
    }

    fun withLocations(locations: Set<Location>?): Notification {
        this.locations = locations
        return this
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     * (Required)
     */
    fun getMessage(): Message? {
        return message
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     * (Required)
     */
    fun setMessage(message: Message?) {
        this.message = message
    }

    fun withMessage(message: Message?): Notification {
        this.message = message
        return this
    }

    fun withLevel(level: Level?): Notification {
        this.level = level
        return this
    }

    fun withThreadId(threadId: Int): Notification {
        this.threadId = threadId
        return this
    }

    fun withTimeUtc(timeUtc: Date?): Notification {
        this.timeUtc = timeUtc
        return this
    }

    fun withException(exception: Exception?): Notification {
        this.exception = exception
        return this
    }

    /**
     * Information about how to locate a relevant reporting descriptor.
     */
    fun getDescriptor(): ReportingDescriptorReference? {
        return descriptor
    }

    /**
     * Information about how to locate a relevant reporting descriptor.
     */
    fun setDescriptor(descriptor: ReportingDescriptorReference?) {
        this.descriptor = descriptor
    }

    fun withDescriptor(descriptor: ReportingDescriptorReference?): Notification {
        this.descriptor = descriptor
        return this
    }

    /**
     * Information about how to locate a relevant reporting descriptor.
     */
    fun getAssociatedRule(): ReportingDescriptorReference? {
        return associatedRule
    }

    /**
     * Information about how to locate a relevant reporting descriptor.
     */
    fun setAssociatedRule(associatedRule: ReportingDescriptorReference?) {
        this.associatedRule = associatedRule
    }

    fun withAssociatedRule(associatedRule: ReportingDescriptorReference?): Notification {
        this.associatedRule = associatedRule
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

    fun withProperties(properties: PropertyBag?): Notification {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Notification::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("locations")
        sb.append('=')
        sb.append((if ((this.locations == null)) "<null>" else this.locations))
        sb.append(',')
        sb.append("message")
        sb.append('=')
        sb.append((if ((this.message == null)) "<null>" else this.message))
        sb.append(',')
        sb.append("level")
        sb.append('=')
        sb.append((if ((this.level == null)) "<null>" else this.level))
        sb.append(',')
        sb.append("threadId")
        sb.append('=')
        sb.append(this.threadId)
        sb.append(',')
        sb.append("timeUtc")
        sb.append('=')
        sb.append((if ((this.timeUtc == null)) "<null>" else this.timeUtc))
        sb.append(',')
        sb.append("exception")
        sb.append('=')
        sb.append((if ((this.exception == null)) "<null>" else this.exception))
        sb.append(',')
        sb.append("descriptor")
        sb.append('=')
        sb.append((if ((this.descriptor == null)) "<null>" else this.descriptor))
        sb.append(',')
        sb.append("associatedRule")
        sb.append('=')
        sb.append((if ((this.associatedRule == null)) "<null>" else this.associatedRule))
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
        result = ((result * 31) + (if ((this.exception == null)) 0 else exception.hashCode()))
        result = ((result * 31) + (if ((this.level == null)) 0 else level.hashCode()))
        result = ((result * 31) + (if ((this.associatedRule == null)) 0 else associatedRule.hashCode()))
        result = ((result * 31) + (if ((this.timeUtc == null)) 0 else timeUtc.hashCode()))
        result = ((result * 31) + (if ((this.locations == null)) 0 else locations.hashCode()))
        result = ((result * 31) + (if ((this.descriptor == null)) 0 else descriptor.hashCode()))
        result = ((result * 31) + (if ((this.message == null)) 0 else message.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Notification) == false) {
            return false
        }
        val rhs = other
        return (((((((((this.threadId == rhs.threadId) && ((this.exception === rhs.exception) || ((this.exception != null) && (this.exception == rhs.exception)))) && ((this.level == rhs.level) || ((this.level != null) && (this.level == rhs.level)))) && ((this.associatedRule === rhs.associatedRule) || ((this.associatedRule != null) && associatedRule.equals(
            rhs.associatedRule
        )))) && ((this.timeUtc === rhs.timeUtc) || ((this.timeUtc != null) && (this.timeUtc == rhs.timeUtc)))) && ((this.locations === rhs.locations) || ((this.locations != null) && (this.locations == rhs.locations)))) && ((this.descriptor === rhs.descriptor) || ((this.descriptor != null) && descriptor.equals(
            rhs.descriptor
        )))) && ((this.message === rhs.message) || ((this.message != null) && message.equals(rhs.message)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }


    /**
     * A value specifying the severity level of the notification.
     */
    @Generated("jsonschema2pojo")
    enum class Level(private val value: String) {
        @SerializedName("none")
        NONE("none"),
        @SerializedName("note")
        NOTE("note"),
        @SerializedName("warning")
        WARNING("warning"),
        @SerializedName("error")
        ERROR("error");

        override fun toString(): String {
            return this.value
        }

        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, Level> = HashMap()

            init {
                for (c in entries) {
                    CONSTANTS[c.value] = c
                }
            }

            fun fromValue(value: String): Level {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }
}
