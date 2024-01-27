package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Identifies a particular toolComponent object, either the driver or an extension.
 */
@Generated("jsonschema2pojo")
class ToolComponentReference {
    /**
     * The 'name' property of the referenced toolComponent.
     */
    /**
     * The 'name' property of the referenced toolComponent.
     */
    /**
     * The 'name' property of the referenced toolComponent.
     */
    @SerializedName("name")
    @Expose
    var name: String? = null
    /**
     * An index into the referenced toolComponent in tool.extensions.
     */
    /**
     * An index into the referenced toolComponent in tool.extensions.
     */
    /**
     * An index into the referenced toolComponent in tool.extensions.
     */
    @SerializedName("index")
    @Expose
    var index: Int = -1
    /**
     * The 'guid' property of the referenced toolComponent.
     */
    /**
     * The 'guid' property of the referenced toolComponent.
     */
    /**
     * The 'guid' property of the referenced toolComponent.
     */
    @SerializedName("guid")
    @Expose
    var guid: String? = null

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
     * @param index
     * @param guid
     * @param properties
     */
    constructor(name: String?, index: Int, guid: String?, properties: PropertyBag?) : super() {
        this.name = name
        this.index = index
        this.guid = guid
        this.properties = properties
    }

    fun withName(name: String?): ToolComponentReference {
        this.name = name
        return this
    }

    fun withIndex(index: Int): ToolComponentReference {
        this.index = index
        return this
    }

    fun withGuid(guid: String?): ToolComponentReference {
        this.guid = guid
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

    fun withProperties(properties: PropertyBag?): ToolComponentReference {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ToolComponentReference::class.java.name).append('@').append(
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
        sb.append("index")
        sb.append('=')
        sb.append(this.index)
        sb.append(',')
        sb.append("guid")
        sb.append('=')
        sb.append((if ((this.guid == null)) "<null>" else this.guid))
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
        result = ((result * 31) + this.index)
        result = ((result * 31) + (if ((this.guid == null)) 0 else guid.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ToolComponentReference) == false) {
            return false
        }
        val rhs = other
        return (((((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name))) && (this.index == rhs.index)) && ((this.guid === rhs.guid) || ((this.guid != null) && (this.guid == rhs.guid)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
