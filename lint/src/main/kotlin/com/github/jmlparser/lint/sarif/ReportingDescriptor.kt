package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import java.net.URI
import javax.annotation.processing.Generated

/**
 * Metadata that describes a specific report produced by the tool, as part of the analysis it provides or its runtime reporting.
 */
@Generated("jsonschema2pojo")
class ReportingDescriptor {
    /**
     * A stable, opaque identifier for the report.
     * (Required)
     */
    /**
     * A stable, opaque identifier for the report.
     * (Required)
     */
    /**
     * A stable, opaque identifier for the report.
     * (Required)
     */
    @SerializedName("id")
    @Expose
    var id: String? = null
    /**
     * An array of stable, opaque identifiers by which this report was known in some previous version of the analysis tool.
     */
    /**
     * An array of stable, opaque identifiers by which this report was known in some previous version of the analysis tool.
     */
    /**
     * An array of stable, opaque identifiers by which this report was known in some previous version of the analysis tool.
     */
    @SerializedName("deprecatedIds")
    @Expose
    var deprecatedIds: Set<String>? = LinkedHashSet()
    /**
     * A unique identifer for the reporting descriptor in the form of a GUID.
     */
    /**
     * A unique identifer for the reporting descriptor in the form of a GUID.
     */
    /**
     * A unique identifer for the reporting descriptor in the form of a GUID.
     */
    @SerializedName("guid")
    @Expose
    var guid: String? = null
    /**
     * An array of unique identifies in the form of a GUID by which this report was known in some previous version of the analysis tool.
     */
    /**
     * An array of unique identifies in the form of a GUID by which this report was known in some previous version of the analysis tool.
     */
    /**
     * An array of unique identifies in the form of a GUID by which this report was known in some previous version of the analysis tool.
     */
    @SerializedName("deprecatedGuids")
    @Expose
    var deprecatedGuids: Set<String>? = LinkedHashSet()
    /**
     * A report identifier that is understandable to an end user.
     */
    /**
     * A report identifier that is understandable to an end user.
     */
    /**
     * A report identifier that is understandable to an end user.
     */
    @SerializedName("name")
    @Expose
    var name: String? = null
    /**
     * An array of readable identifiers by which this report was known in some previous version of the analysis tool.
     */
    /**
     * An array of readable identifiers by which this report was known in some previous version of the analysis tool.
     */
    /**
     * An array of readable identifiers by which this report was known in some previous version of the analysis tool.
     */
    @SerializedName("deprecatedNames")
    @Expose
    var deprecatedNames: Set<String>? = LinkedHashSet()

    /**
     * A message string or message format string rendered in multiple formats.
     */
    @SerializedName("shortDescription")
    @Expose
    private var shortDescription: MultiformatMessageString? = null

    /**
     * A message string or message format string rendered in multiple formats.
     */
    @SerializedName("fullDescription")
    @Expose
    private var fullDescription: MultiformatMessageString? = null

    /**
     * A set of name/value pairs with arbitrary names. Each value is a multiformatMessageString object, which holds message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can be used to construct a message in combination with an arbitrary number of additional string arguments.
     */
    @SerializedName("messageStrings")
    @Expose
    private var messageStrings: MessageStrings? = null

    /**
     * Information about a rule or notification that can be configured at runtime.
     */
    @SerializedName("defaultConfiguration")
    @Expose
    private var defaultConfiguration: ReportingConfiguration? = null
    /**
     * A URI where the primary documentation for the report can be found.
     */
    /**
     * A URI where the primary documentation for the report can be found.
     */
    /**
     * A URI where the primary documentation for the report can be found.
     */
    @SerializedName("helpUri")
    @Expose
    var helpUri: URI? = null

    /**
     * A message string or message format string rendered in multiple formats.
     */
    @SerializedName("help")
    @Expose
    private var help: MultiformatMessageString? = null

    /**
     * An array of objects that describe relationships between this reporting descriptor and others.
     */
    @SerializedName("relationships")
    @Expose
    private var relationships: Set<ReportingDescriptorRelationship>? = LinkedHashSet<ReportingDescriptorRelationship>()

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
     * @param deprecatedIds
     * @param deprecatedGuids
     * @param shortDescription
     * @param fullDescription
     * @param helpUri
     * @param defaultConfiguration
     * @param help
     * @param relationships
     * @param messageStrings
     * @param name
     * @param guid
     * @param deprecatedNames
     * @param id
     * @param properties
     */
    constructor(
        id: String?,
        deprecatedIds: Set<String>?,
        guid: String?,
        deprecatedGuids: Set<String>?,
        name: String?,
        deprecatedNames: Set<String>?,
        shortDescription: MultiformatMessageString?,
        fullDescription: MultiformatMessageString?,
        messageStrings: MessageStrings?,
        defaultConfiguration: ReportingConfiguration?,
        helpUri: URI?,
        help: MultiformatMessageString?,
        relationships: Set<ReportingDescriptorRelationship>?,
        properties: PropertyBag?
    ) : super() {
        this.id = id
        this.deprecatedIds = deprecatedIds
        this.guid = guid
        this.deprecatedGuids = deprecatedGuids
        this.name = name
        this.deprecatedNames = deprecatedNames
        this.shortDescription = shortDescription
        this.fullDescription = fullDescription
        this.messageStrings = messageStrings
        this.defaultConfiguration = defaultConfiguration
        this.helpUri = helpUri
        this.help = help
        this.relationships = relationships
        this.properties = properties
    }

    fun withId(id: String?): ReportingDescriptor {
        this.id = id
        return this
    }

    fun withDeprecatedIds(deprecatedIds: Set<String>?): ReportingDescriptor {
        this.deprecatedIds = deprecatedIds
        return this
    }

    fun withGuid(guid: String?): ReportingDescriptor {
        this.guid = guid
        return this
    }

    fun withDeprecatedGuids(deprecatedGuids: Set<String>?): ReportingDescriptor {
        this.deprecatedGuids = deprecatedGuids
        return this
    }

    fun withName(name: String?): ReportingDescriptor {
        this.name = name
        return this
    }

    fun withDeprecatedNames(deprecatedNames: Set<String>?): ReportingDescriptor {
        this.deprecatedNames = deprecatedNames
        return this
    }

    /**
     * A message string or message format string rendered in multiple formats.
     */
    fun getShortDescription(): MultiformatMessageString? {
        return shortDescription
    }

    /**
     * A message string or message format string rendered in multiple formats.
     */
    fun setShortDescription(shortDescription: MultiformatMessageString?) {
        this.shortDescription = shortDescription
    }

    fun withShortDescription(shortDescription: MultiformatMessageString?): ReportingDescriptor {
        this.shortDescription = shortDescription
        return this
    }

    /**
     * A message string or message format string rendered in multiple formats.
     */
    fun getFullDescription(): MultiformatMessageString? {
        return fullDescription
    }

    /**
     * A message string or message format string rendered in multiple formats.
     */
    fun setFullDescription(fullDescription: MultiformatMessageString?) {
        this.fullDescription = fullDescription
    }

    fun withFullDescription(fullDescription: MultiformatMessageString?): ReportingDescriptor {
        this.fullDescription = fullDescription
        return this
    }

    /**
     * A set of name/value pairs with arbitrary names. Each value is a multiformatMessageString object, which holds message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can be used to construct a message in combination with an arbitrary number of additional string arguments.
     */
    fun getMessageStrings(): MessageStrings? {
        return messageStrings
    }

    /**
     * A set of name/value pairs with arbitrary names. Each value is a multiformatMessageString object, which holds message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can be used to construct a message in combination with an arbitrary number of additional string arguments.
     */
    fun setMessageStrings(messageStrings: MessageStrings?) {
        this.messageStrings = messageStrings
    }

    fun withMessageStrings(messageStrings: MessageStrings?): ReportingDescriptor {
        this.messageStrings = messageStrings
        return this
    }

    /**
     * Information about a rule or notification that can be configured at runtime.
     */
    fun getDefaultConfiguration(): ReportingConfiguration? {
        return defaultConfiguration
    }

    /**
     * Information about a rule or notification that can be configured at runtime.
     */
    fun setDefaultConfiguration(defaultConfiguration: ReportingConfiguration?) {
        this.defaultConfiguration = defaultConfiguration
    }

    fun withDefaultConfiguration(defaultConfiguration: ReportingConfiguration?): ReportingDescriptor {
        this.defaultConfiguration = defaultConfiguration
        return this
    }

    fun withHelpUri(helpUri: URI?): ReportingDescriptor {
        this.helpUri = helpUri
        return this
    }

    /**
     * A message string or message format string rendered in multiple formats.
     */
    fun getHelp(): MultiformatMessageString? {
        return help
    }

    /**
     * A message string or message format string rendered in multiple formats.
     */
    fun setHelp(help: MultiformatMessageString?) {
        this.help = help
    }

    fun withHelp(help: MultiformatMessageString?): ReportingDescriptor {
        this.help = help
        return this
    }

    /**
     * An array of objects that describe relationships between this reporting descriptor and others.
     */
    fun getRelationships(): Set<ReportingDescriptorRelationship>? {
        return relationships
    }

    /**
     * An array of objects that describe relationships between this reporting descriptor and others.
     */
    fun setRelationships(relationships: Set<ReportingDescriptorRelationship>?) {
        this.relationships = relationships
    }

    fun withRelationships(relationships: Set<ReportingDescriptorRelationship>?): ReportingDescriptor {
        this.relationships = relationships
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

    fun withProperties(properties: PropertyBag?): ReportingDescriptor {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ReportingDescriptor::class.java.name).append('@').append(
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
        sb.append("deprecatedIds")
        sb.append('=')
        sb.append((if ((this.deprecatedIds == null)) "<null>" else this.deprecatedIds))
        sb.append(',')
        sb.append("guid")
        sb.append('=')
        sb.append((if ((this.guid == null)) "<null>" else this.guid))
        sb.append(',')
        sb.append("deprecatedGuids")
        sb.append('=')
        sb.append((if ((this.deprecatedGuids == null)) "<null>" else this.deprecatedGuids))
        sb.append(',')
        sb.append("name")
        sb.append('=')
        sb.append((if ((this.name == null)) "<null>" else this.name))
        sb.append(',')
        sb.append("deprecatedNames")
        sb.append('=')
        sb.append((if ((this.deprecatedNames == null)) "<null>" else this.deprecatedNames))
        sb.append(',')
        sb.append("shortDescription")
        sb.append('=')
        sb.append((if ((this.shortDescription == null)) "<null>" else this.shortDescription))
        sb.append(',')
        sb.append("fullDescription")
        sb.append('=')
        sb.append((if ((this.fullDescription == null)) "<null>" else this.fullDescription))
        sb.append(',')
        sb.append("messageStrings")
        sb.append('=')
        sb.append((if ((this.messageStrings == null)) "<null>" else this.messageStrings))
        sb.append(',')
        sb.append("defaultConfiguration")
        sb.append('=')
        sb.append((if ((this.defaultConfiguration == null)) "<null>" else this.defaultConfiguration))
        sb.append(',')
        sb.append("helpUri")
        sb.append('=')
        sb.append((if ((this.helpUri == null)) "<null>" else this.helpUri))
        sb.append(',')
        sb.append("help")
        sb.append('=')
        sb.append((if ((this.help == null)) "<null>" else this.help))
        sb.append(',')
        sb.append("relationships")
        sb.append('=')
        sb.append((if ((this.relationships == null)) "<null>" else this.relationships))
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
        result = ((result * 31) + (if ((this.deprecatedIds == null)) 0 else deprecatedIds.hashCode()))
        result = ((result * 31) + (if ((this.deprecatedGuids == null)) 0 else deprecatedGuids.hashCode()))
        result = ((result * 31) + (if ((this.shortDescription == null)) 0 else shortDescription.hashCode()))
        result = ((result * 31) + (if ((this.fullDescription == null)) 0 else fullDescription.hashCode()))
        result = ((result * 31) + (if ((this.helpUri == null)) 0 else helpUri.hashCode()))
        result = ((result * 31) + (if ((this.defaultConfiguration == null)) 0 else defaultConfiguration.hashCode()))
        result = ((result * 31) + (if ((this.help == null)) 0 else help.hashCode()))
        result = ((result * 31) + (if ((this.relationships == null)) 0 else relationships.hashCode()))
        result = ((result * 31) + (if ((this.messageStrings == null)) 0 else messageStrings.hashCode()))
        result = ((result * 31) + (if ((this.name == null)) 0 else name.hashCode()))
        result = ((result * 31) + (if ((this.guid == null)) 0 else guid.hashCode()))
        result = ((result * 31) + (if ((this.deprecatedNames == null)) 0 else deprecatedNames.hashCode()))
        result = ((result * 31) + (if ((this.id == null)) 0 else id.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ReportingDescriptor) == false) {
            return false
        }
        val rhs = other
        return (((((((((((((((this.deprecatedIds === rhs.deprecatedIds) || ((this.deprecatedIds != null) && (this.deprecatedIds == rhs.deprecatedIds))) && ((this.deprecatedGuids === rhs.deprecatedGuids) || ((this.deprecatedGuids != null) && (this.deprecatedGuids == rhs.deprecatedGuids)))) && ((this.shortDescription === rhs.shortDescription) || ((this.shortDescription != null) && shortDescription.equals(
            rhs.shortDescription
        )))) && ((this.fullDescription === rhs.fullDescription) || ((this.fullDescription != null) && fullDescription.equals(
            rhs.fullDescription
        )))) && ((this.helpUri === rhs.helpUri) || ((this.helpUri != null) && (this.helpUri == rhs.helpUri)))) && ((this.defaultConfiguration === rhs.defaultConfiguration) || ((this.defaultConfiguration != null) && defaultConfiguration.equals(
            rhs.defaultConfiguration
        )))) && ((this.help === rhs.help) || ((this.help != null) && help.equals(rhs.help)))) && ((this.relationships === rhs.relationships) || ((this.relationships != null) && (this.relationships == rhs.relationships)))) && ((this.messageStrings === rhs.messageStrings) || ((this.messageStrings != null) && messageStrings.equals(
            rhs.messageStrings
        )))) && ((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name)))) && ((this.guid === rhs.guid) || ((this.guid != null) && (this.guid == rhs.guid)))) && ((this.deprecatedNames === rhs.deprecatedNames) || ((this.deprecatedNames != null) && (this.deprecatedNames == rhs.deprecatedNames)))) && ((this.id === rhs.id) || ((this.id != null) && (this.id == rhs.id)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
