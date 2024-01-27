package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Information about how to locate a relevant reporting descriptor.
 */
@Generated("jsonschema2pojo")
class ReportingDescriptorReference {
    /**
     * The id of the descriptor.
     */
    /**
     * The id of the descriptor.
     */
    /**
     * The id of the descriptor.
     */
    @SerializedName("id")
    @Expose
    var id: String? = null
    /**
     * The index into an array of descriptors in toolComponent.ruleDescriptors, toolComponent.notificationDescriptors, or toolComponent.taxonomyDescriptors, depending on context.
     */
    /**
     * The index into an array of descriptors in toolComponent.ruleDescriptors, toolComponent.notificationDescriptors, or toolComponent.taxonomyDescriptors, depending on context.
     */
    /**
     * The index into an array of descriptors in toolComponent.ruleDescriptors, toolComponent.notificationDescriptors, or toolComponent.taxonomyDescriptors, depending on context.
     */
    @SerializedName("index")
    @Expose
    var index: Int = -1
    /**
     * A guid that uniquely identifies the descriptor.
     */
    /**
     * A guid that uniquely identifies the descriptor.
     */
    /**
     * A guid that uniquely identifies the descriptor.
     */
    @SerializedName("guid")
    @Expose
    var guid: String? = null

    /**
     * Identifies a particular toolComponent object, either the driver or an extension.
     */
    @SerializedName("toolComponent")
    @Expose
    private var toolComponent: ToolComponentReference? = null

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
     * @param index
     * @param guid
     * @param toolComponent
     * @param id
     * @param properties
     */
    constructor(
        id: String?,
        index: Int,
        guid: String?,
        toolComponent: ToolComponentReference?,
        properties: PropertyBag?
    ) : super() {
        this.id = id
        this.index = index
        this.guid = guid
        this.toolComponent = toolComponent
        this.properties = properties
    }

    fun withId(id: String?): ReportingDescriptorReference {
        this.id = id
        return this
    }

    fun withIndex(index: Int): ReportingDescriptorReference {
        this.index = index
        return this
    }

    fun withGuid(guid: String?): ReportingDescriptorReference {
        this.guid = guid
        return this
    }

    /**
     * Identifies a particular toolComponent object, either the driver or an extension.
     */
    fun getToolComponent(): ToolComponentReference? {
        return toolComponent
    }

    /**
     * Identifies a particular toolComponent object, either the driver or an extension.
     */
    fun setToolComponent(toolComponent: ToolComponentReference?) {
        this.toolComponent = toolComponent
    }

    fun withToolComponent(toolComponent: ToolComponentReference?): ReportingDescriptorReference {
        this.toolComponent = toolComponent
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

    fun withProperties(properties: PropertyBag?): ReportingDescriptorReference {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ReportingDescriptorReference::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("id")
        sb.append('=')
        sb.append((if ((this.id == null)) "<null>" else this.id))
        sb.append(',')
        sb.append("index")
        sb.append('=')
        sb.append(this.index)
        sb.append(',')
        sb.append("guid")
        sb.append('=')
        sb.append((if ((this.guid == null)) "<null>" else this.guid))
        sb.append(',')
        sb.append("toolComponent")
        sb.append('=')
        sb.append((if ((this.toolComponent == null)) "<null>" else this.toolComponent))
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
        result = ((result * 31) + this.index)
        result = ((result * 31) + (if ((this.guid == null)) 0 else guid.hashCode()))
        result = ((result * 31) + (if ((this.toolComponent == null)) 0 else toolComponent.hashCode()))
        result = ((result * 31) + (if ((this.id == null)) 0 else id.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ReportingDescriptorReference) == false) {
            return false
        }
        val rhs = other
        return (((((this.index == rhs.index) && ((this.guid === rhs.guid) || ((this.guid != null) && (this.guid == rhs.guid)))) && ((this.toolComponent === rhs.toolComponent) || ((this.toolComponent != null) && toolComponent.equals(
            rhs.toolComponent
        )))) && ((this.id === rhs.id) || ((this.id != null) && (this.id == rhs.id)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
