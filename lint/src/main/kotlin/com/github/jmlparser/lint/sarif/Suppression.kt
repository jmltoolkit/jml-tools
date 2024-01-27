package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * A suppression that is relevant to a result.
 */
@Generated("jsonschema2pojo")
class Suppression {
    /**
     * A stable, unique identifer for the suprression in the form of a GUID.
     */
    /**
     * A stable, unique identifer for the suprression in the form of a GUID.
     */
    /**
     * A stable, unique identifer for the suprression in the form of a GUID.
     */
    @SerializedName("guid")
    @Expose
    var guid: String? = null
    /**
     * A string that indicates where the suppression is persisted.
     * (Required)
     */
    /**
     * A string that indicates where the suppression is persisted.
     * (Required)
     */
    /**
     * A string that indicates where the suppression is persisted.
     * (Required)
     */
    @SerializedName("kind")
    @Expose
    var kind: Kind? = null
    /**
     * A string that indicates the state of the suppression.
     */
    /**
     * A string that indicates the state of the suppression.
     */
    /**
     * A string that indicates the state of the suppression.
     */
    @SerializedName("state")
    @Expose
    var state: State? = null
    /**
     * A string representing the justification for the suppression.
     */
    /**
     * A string representing the justification for the suppression.
     */
    /**
     * A string representing the justification for the suppression.
     */
    @SerializedName("justification")
    @Expose
    var justification: String? = null

    /**
     * A location within a programming artifact.
     */
    @SerializedName("location")
    @Expose
    private var location: Location? = null

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
     * @param kind
     * @param guid
     * @param location
     * @param state
     * @param justification
     * @param properties
     */
    constructor(
        guid: String?,
        kind: Kind?,
        state: State?,
        justification: String?,
        location: Location?,
        properties: PropertyBag?
    ) : super() {
        this.guid = guid
        this.kind = kind
        this.state = state
        this.justification = justification
        this.location = location
        this.properties = properties
    }

    fun withGuid(guid: String?): Suppression {
        this.guid = guid
        return this
    }

    fun withKind(kind: Kind?): Suppression {
        this.kind = kind
        return this
    }

    fun withState(state: State?): Suppression {
        this.state = state
        return this
    }

    fun withJustification(justification: String?): Suppression {
        this.justification = justification
        return this
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

    fun withLocation(location: Location?): Suppression {
        this.location = location
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

    fun withProperties(properties: PropertyBag?): Suppression {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Suppression::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("guid")
        sb.append('=')
        sb.append((if ((this.guid == null)) "<null>" else this.guid))
        sb.append(',')
        sb.append("kind")
        sb.append('=')
        sb.append((if ((this.kind == null)) "<null>" else this.kind))
        sb.append(',')
        sb.append("state")
        sb.append('=')
        sb.append((if ((this.state == null)) "<null>" else this.state))
        sb.append(',')
        sb.append("justification")
        sb.append('=')
        sb.append((if ((this.justification == null)) "<null>" else this.justification))
        sb.append(',')
        sb.append("location")
        sb.append('=')
        sb.append((if ((this.location == null)) "<null>" else this.location))
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
        result = ((result * 31) + (if ((this.guid == null)) 0 else guid.hashCode()))
        result = ((result * 31) + (if ((this.location == null)) 0 else location.hashCode()))
        result = ((result * 31) + (if ((this.state == null)) 0 else state.hashCode()))
        result = ((result * 31) + (if ((this.justification == null)) 0 else justification.hashCode()))
        result = ((result * 31) + (if ((this.kind == null)) 0 else kind.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Suppression) == false) {
            return false
        }
        val rhs = other
        return (((((((this.guid === rhs.guid) || ((this.guid != null) && (this.guid == rhs.guid))) && ((this.location === rhs.location) || ((this.location != null) && location.equals(
            rhs.location
        )))) && ((this.state == rhs.state) || ((this.state != null) && (this.state == rhs.state)))) && ((this.justification === rhs.justification) || ((this.justification != null) && (this.justification == rhs.justification)))) && ((this.kind == rhs.kind) || ((this.kind != null) && (this.kind == rhs.kind)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }


    /**
     * A string that indicates where the suppression is persisted.
     */
    @Generated("jsonschema2pojo")
    enum class Kind(private val value: String) {
        @SerializedName("inSource")
        IN_SOURCE("inSource"),
        @SerializedName("external")
        EXTERNAL("external");

        override fun toString(): String {
            return this.value
        }

        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, Kind> = HashMap()

            init {
                for (c in entries) {
                    CONSTANTS[c.value] = c
                }
            }

            fun fromValue(value: String): Kind {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }


    /**
     * A string that indicates the state of the suppression.
     */
    @Generated("jsonschema2pojo")
    enum class State(private val value: String) {
        @SerializedName("accepted")
        ACCEPTED("accepted"),
        @SerializedName("underReview")
        UNDER_REVIEW("underReview"),
        @SerializedName("rejected")
        REJECTED("rejected");

        override fun toString(): String {
            return this.value
        }

        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, State> = HashMap()

            init {
                for (c in entries) {
                    CONSTANTS[c.value] = c
                }
            }

            fun fromValue(value: String): State {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }
}
