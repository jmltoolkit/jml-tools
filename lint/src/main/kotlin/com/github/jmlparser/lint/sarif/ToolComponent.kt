package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import java.net.URI
import javax.annotation.processing.Generated

/**
 * A component, such as a plug-in or the driver, of the analysis tool that was run.
 */
@Generated("jsonschema2pojo")
class ToolComponent {
    /**
     * A unique identifer for the tool component in the form of a GUID.
     */
    /**
     * A unique identifer for the tool component in the form of a GUID.
     */
    /**
     * A unique identifer for the tool component in the form of a GUID.
     */
    @SerializedName("guid")
    @Expose
    var guid: String? = null
    /**
     * The name of the tool component.
     * (Required)
     */
    /**
     * The name of the tool component.
     * (Required)
     */
    /**
     * The name of the tool component.
     * (Required)
     */
    @SerializedName("name")
    @Expose
    var name: String? = null
    /**
     * The organization or company that produced the tool component.
     */
    /**
     * The organization or company that produced the tool component.
     */
    /**
     * The organization or company that produced the tool component.
     */
    @SerializedName("organization")
    @Expose
    var organization: String? = null
    /**
     * A product suite to which the tool component belongs.
     */
    /**
     * A product suite to which the tool component belongs.
     */
    /**
     * A product suite to which the tool component belongs.
     */
    @SerializedName("product")
    @Expose
    var product: String? = null
    /**
     * A localizable string containing the name of the suite of products to which the tool component belongs.
     */
    /**
     * A localizable string containing the name of the suite of products to which the tool component belongs.
     */
    /**
     * A localizable string containing the name of the suite of products to which the tool component belongs.
     */
    @SerializedName("productSuite")
    @Expose
    var productSuite: String? = null

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
     * The name of the tool component along with its version and any other useful identifying information, such as its locale.
     */
    /**
     * The name of the tool component along with its version and any other useful identifying information, such as its locale.
     */
    /**
     * The name of the tool component along with its version and any other useful identifying information, such as its locale.
     */
    @SerializedName("fullName")
    @Expose
    var fullName: String? = null
    /**
     * The tool component version, in whatever format the component natively provides.
     */
    /**
     * The tool component version, in whatever format the component natively provides.
     */
    /**
     * The tool component version, in whatever format the component natively provides.
     */
    @SerializedName("version")
    @Expose
    var version: String? = null
    /**
     * The tool component version in the format specified by Semantic Versioning 2.0.
     */
    /**
     * The tool component version in the format specified by Semantic Versioning 2.0.
     */
    /**
     * The tool component version in the format specified by Semantic Versioning 2.0.
     */
    @SerializedName("semanticVersion")
    @Expose
    var semanticVersion: String? = null
    /**
     * The binary version of the tool component's primary executable file expressed as four non-negative integers separated by a period (for operating systems that express file versions in this way).
     */
    /**
     * The binary version of the tool component's primary executable file expressed as four non-negative integers separated by a period (for operating systems that express file versions in this way).
     */
    /**
     * The binary version of the tool component's primary executable file expressed as four non-negative integers separated by a period (for operating systems that express file versions in this way).
     */
    @SerializedName("dottedQuadFileVersion")
    @Expose
    var dottedQuadFileVersion: String? = null
    /**
     * A string specifying the UTC date (and optionally, the time) of the component's release.
     */
    /**
     * A string specifying the UTC date (and optionally, the time) of the component's release.
     */
    /**
     * A string specifying the UTC date (and optionally, the time) of the component's release.
     */
    @SerializedName("releaseDateUtc")
    @Expose
    var releaseDateUtc: String? = null
    /**
     * The absolute URI from which the tool component can be downloaded.
     */
    /**
     * The absolute URI from which the tool component can be downloaded.
     */
    /**
     * The absolute URI from which the tool component can be downloaded.
     */
    @SerializedName("downloadUri")
    @Expose
    var downloadUri: URI? = null
    /**
     * The absolute URI at which information about this version of the tool component can be found.
     */
    /**
     * The absolute URI at which information about this version of the tool component can be found.
     */
    /**
     * The absolute URI at which information about this version of the tool component can be found.
     */
    @SerializedName("informationUri")
    @Expose
    var informationUri: URI? = null

    /**
     * A dictionary, each of whose keys is a resource identifier and each of whose values is a multiformatMessageString object, which holds message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can be used to construct a message in combination with an arbitrary number of additional string arguments.
     */
    @SerializedName("globalMessageStrings")
    @Expose
    private var globalMessageStrings: GlobalMessageStrings? = null

    /**
     * An array of reportingDescriptor objects relevant to the notifications related to the configuration and runtime execution of the tool component.
     */
    @SerializedName("notifications")
    @Expose
    private var notifications: Set<ReportingDescriptor>? = LinkedHashSet<ReportingDescriptor>()

    /**
     * An array of reportingDescriptor objects relevant to the analysis performed by the tool component.
     */
    @SerializedName("rules")
    @Expose
    private var rules: Set<ReportingDescriptor>? = LinkedHashSet<ReportingDescriptor>()

    /**
     * An array of reportingDescriptor objects relevant to the definitions of both standalone and tool-defined taxonomies.
     */
    @SerializedName("taxa")
    @Expose
    private var taxa: Set<ReportingDescriptor>? = LinkedHashSet<ReportingDescriptor>()

    /**
     * An array of the artifactLocation objects associated with the tool component.
     */
    @SerializedName("locations")
    @Expose
    private var locations: List<ArtifactLocation>? = ArrayList<ArtifactLocation>()
    /**
     * The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter lowercase language code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code associated with a country or region). The casing is recommended but not required (in order for this data to conform to RFC5646).
     */
    /**
     * The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter lowercase language code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code associated with a country or region). The casing is recommended but not required (in order for this data to conform to RFC5646).
     */
    /**
     * The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter lowercase language code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code associated with a country or region). The casing is recommended but not required (in order for this data to conform to RFC5646).
     */
    @SerializedName("language")
    @Expose
    var language: String? = "en-US"
    /**
     * The kinds of data contained in this object.
     */
    /**
     * The kinds of data contained in this object.
     */
    /**
     * The kinds of data contained in this object.
     */
    @SerializedName("contents")
    @Expose
    var contents: Set<Any?>? = LinkedHashSet(mutableListOf<Any?>(null, null))
    /**
     * Specifies whether this object contains a complete definition of the localizable and/or non-localizable data for this component, as opposed to including only data that is relevant to the results persisted to this log file.
     */
    /**
     * Specifies whether this object contains a complete definition of the localizable and/or non-localizable data for this component, as opposed to including only data that is relevant to the results persisted to this log file.
     */
    @SerializedName("isComprehensive")
    @Expose
    var isIsComprehensive: Boolean = false
        private set
    /**
     * The semantic version of the localized strings defined in this component; maintained by components that provide translations.
     */
    /**
     * The semantic version of the localized strings defined in this component; maintained by components that provide translations.
     */
    /**
     * The semantic version of the localized strings defined in this component; maintained by components that provide translations.
     */
    @SerializedName("localizedDataSemanticVersion")
    @Expose
    var localizedDataSemanticVersion: String? = null
    /**
     * The minimum value of localizedDataSemanticVersion required in translations consumed by this component; used by components that consume translations.
     */
    /**
     * The minimum value of localizedDataSemanticVersion required in translations consumed by this component; used by components that consume translations.
     */
    /**
     * The minimum value of localizedDataSemanticVersion required in translations consumed by this component; used by components that consume translations.
     */
    @SerializedName("minimumRequiredLocalizedDataSemanticVersion")
    @Expose
    var minimumRequiredLocalizedDataSemanticVersion: String? = null

    /**
     * Identifies a particular toolComponent object, either the driver or an extension.
     */
    @SerializedName("associatedComponent")
    @Expose
    private var associatedComponent: ToolComponentReference? = null

    /**
     * Provides additional metadata related to translation.
     */
    @SerializedName("translationMetadata")
    @Expose
    private var translationMetadata: TranslationMetadata? = null

    /**
     * An array of toolComponentReference objects to declare the taxonomies supported by the tool component.
     */
    @SerializedName("supportedTaxonomies")
    @Expose
    private var supportedTaxonomies: Set<ToolComponentReference>? = LinkedHashSet<ToolComponentReference>()

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
     * @param releaseDateUtc
     * @param rules
     * @param language
     * @param downloadUri
     * @param supportedTaxonomies
     * @param fullDescription
     * @param informationUri
     * @param associatedComponent
     * @param translationMetadata
     * @param productSuite
     * @param taxa
     * @param product
     * @param isComprehensive
     * @param minimumRequiredLocalizedDataSemanticVersion
     * @param fullName
     * @param shortDescription
     * @param version
     * @param globalMessageStrings
     * @param localizedDataSemanticVersion
     * @param dottedQuadFileVersion
     * @param contents
     * @param organization
     * @param name
     * @param semanticVersion
     * @param guid
     * @param locations
     * @param notifications
     * @param properties
     */
    constructor(
        guid: String?,
        name: String?,
        organization: String?,
        product: String?,
        productSuite: String?,
        shortDescription: MultiformatMessageString?,
        fullDescription: MultiformatMessageString?,
        fullName: String?,
        version: String?,
        semanticVersion: String?,
        dottedQuadFileVersion: String?,
        releaseDateUtc: String?,
        downloadUri: URI?,
        informationUri: URI?,
        globalMessageStrings: GlobalMessageStrings?,
        notifications: Set<ReportingDescriptor>?,
        rules: Set<ReportingDescriptor>?,
        taxa: Set<ReportingDescriptor>?,
        locations: List<ArtifactLocation>?,
        language: String?,
        contents: Set<Any?>?,
        isComprehensive: Boolean,
        localizedDataSemanticVersion: String?,
        minimumRequiredLocalizedDataSemanticVersion: String?,
        associatedComponent: ToolComponentReference?,
        translationMetadata: TranslationMetadata?,
        supportedTaxonomies: Set<ToolComponentReference>?,
        properties: PropertyBag?
    ) : super() {
        this.guid = guid
        this.name = name
        this.organization = organization
        this.product = product
        this.productSuite = productSuite
        this.shortDescription = shortDescription
        this.fullDescription = fullDescription
        this.fullName = fullName
        this.version = version
        this.semanticVersion = semanticVersion
        this.dottedQuadFileVersion = dottedQuadFileVersion
        this.releaseDateUtc = releaseDateUtc
        this.downloadUri = downloadUri
        this.informationUri = informationUri
        this.globalMessageStrings = globalMessageStrings
        this.notifications = notifications
        this.rules = rules
        this.taxa = taxa
        this.locations = locations
        this.language = language
        this.contents = contents
        this.isIsComprehensive = isComprehensive
        this.localizedDataSemanticVersion = localizedDataSemanticVersion
        this.minimumRequiredLocalizedDataSemanticVersion = minimumRequiredLocalizedDataSemanticVersion
        this.associatedComponent = associatedComponent
        this.translationMetadata = translationMetadata
        this.supportedTaxonomies = supportedTaxonomies
        this.properties = properties
    }

    fun withGuid(guid: String?): ToolComponent {
        this.guid = guid
        return this
    }

    fun withName(name: String?): ToolComponent {
        this.name = name
        return this
    }

    fun withOrganization(organization: String?): ToolComponent {
        this.organization = organization
        return this
    }

    fun withProduct(product: String?): ToolComponent {
        this.product = product
        return this
    }

    fun withProductSuite(productSuite: String?): ToolComponent {
        this.productSuite = productSuite
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

    fun withShortDescription(shortDescription: MultiformatMessageString?): ToolComponent {
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

    fun withFullDescription(fullDescription: MultiformatMessageString?): ToolComponent {
        this.fullDescription = fullDescription
        return this
    }

    fun withFullName(fullName: String?): ToolComponent {
        this.fullName = fullName
        return this
    }

    fun withVersion(version: String?): ToolComponent {
        this.version = version
        return this
    }

    fun withSemanticVersion(semanticVersion: String?): ToolComponent {
        this.semanticVersion = semanticVersion
        return this
    }

    fun withDottedQuadFileVersion(dottedQuadFileVersion: String?): ToolComponent {
        this.dottedQuadFileVersion = dottedQuadFileVersion
        return this
    }

    fun withReleaseDateUtc(releaseDateUtc: String?): ToolComponent {
        this.releaseDateUtc = releaseDateUtc
        return this
    }

    fun withDownloadUri(downloadUri: URI?): ToolComponent {
        this.downloadUri = downloadUri
        return this
    }

    fun withInformationUri(informationUri: URI?): ToolComponent {
        this.informationUri = informationUri
        return this
    }

    /**
     * A dictionary, each of whose keys is a resource identifier and each of whose values is a multiformatMessageString object, which holds message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can be used to construct a message in combination with an arbitrary number of additional string arguments.
     */
    fun getGlobalMessageStrings(): GlobalMessageStrings? {
        return globalMessageStrings
    }

    /**
     * A dictionary, each of whose keys is a resource identifier and each of whose values is a multiformatMessageString object, which holds message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can be used to construct a message in combination with an arbitrary number of additional string arguments.
     */
    fun setGlobalMessageStrings(globalMessageStrings: GlobalMessageStrings?) {
        this.globalMessageStrings = globalMessageStrings
    }

    fun withGlobalMessageStrings(globalMessageStrings: GlobalMessageStrings?): ToolComponent {
        this.globalMessageStrings = globalMessageStrings
        return this
    }

    /**
     * An array of reportingDescriptor objects relevant to the notifications related to the configuration and runtime execution of the tool component.
     */
    fun getNotifications(): Set<ReportingDescriptor>? {
        return notifications
    }

    /**
     * An array of reportingDescriptor objects relevant to the notifications related to the configuration and runtime execution of the tool component.
     */
    fun setNotifications(notifications: Set<ReportingDescriptor>?) {
        this.notifications = notifications
    }

    fun withNotifications(notifications: Set<ReportingDescriptor>?): ToolComponent {
        this.notifications = notifications
        return this
    }

    /**
     * An array of reportingDescriptor objects relevant to the analysis performed by the tool component.
     */
    fun getRules(): Set<ReportingDescriptor>? {
        return rules
    }

    /**
     * An array of reportingDescriptor objects relevant to the analysis performed by the tool component.
     */
    fun setRules(rules: Set<ReportingDescriptor>?) {
        this.rules = rules
    }

    fun withRules(rules: Set<ReportingDescriptor>?): ToolComponent {
        this.rules = rules
        return this
    }

    /**
     * An array of reportingDescriptor objects relevant to the definitions of both standalone and tool-defined taxonomies.
     */
    fun getTaxa(): Set<ReportingDescriptor>? {
        return taxa
    }

    /**
     * An array of reportingDescriptor objects relevant to the definitions of both standalone and tool-defined taxonomies.
     */
    fun setTaxa(taxa: Set<ReportingDescriptor>?) {
        this.taxa = taxa
    }

    fun withTaxa(taxa: Set<ReportingDescriptor>?): ToolComponent {
        this.taxa = taxa
        return this
    }

    /**
     * An array of the artifactLocation objects associated with the tool component.
     */
    fun getLocations(): List<ArtifactLocation>? {
        return locations
    }

    /**
     * An array of the artifactLocation objects associated with the tool component.
     */
    fun setLocations(locations: List<ArtifactLocation>?) {
        this.locations = locations
    }

    fun withLocations(locations: List<ArtifactLocation>?): ToolComponent {
        this.locations = locations
        return this
    }

    fun withLanguage(language: String?): ToolComponent {
        this.language = language
        return this
    }

    fun withContents(contents: Set<Any?>?): ToolComponent {
        this.contents = contents
        return this
    }

    /**
     * Specifies whether this object contains a complete definition of the localizable and/or non-localizable data for this component, as opposed to including only data that is relevant to the results persisted to this log file.
     */
    fun setIsComprehensive(isComprehensive: Boolean) {
        this.isIsComprehensive = isComprehensive
    }

    fun withIsComprehensive(isComprehensive: Boolean): ToolComponent {
        this.isIsComprehensive = isComprehensive
        return this
    }

    fun withLocalizedDataSemanticVersion(localizedDataSemanticVersion: String?): ToolComponent {
        this.localizedDataSemanticVersion = localizedDataSemanticVersion
        return this
    }

    fun withMinimumRequiredLocalizedDataSemanticVersion(minimumRequiredLocalizedDataSemanticVersion: String?): ToolComponent {
        this.minimumRequiredLocalizedDataSemanticVersion = minimumRequiredLocalizedDataSemanticVersion
        return this
    }

    /**
     * Identifies a particular toolComponent object, either the driver or an extension.
     */
    fun getAssociatedComponent(): ToolComponentReference? {
        return associatedComponent
    }

    /**
     * Identifies a particular toolComponent object, either the driver or an extension.
     */
    fun setAssociatedComponent(associatedComponent: ToolComponentReference?) {
        this.associatedComponent = associatedComponent
    }

    fun withAssociatedComponent(associatedComponent: ToolComponentReference?): ToolComponent {
        this.associatedComponent = associatedComponent
        return this
    }

    /**
     * Provides additional metadata related to translation.
     */
    fun getTranslationMetadata(): TranslationMetadata? {
        return translationMetadata
    }

    /**
     * Provides additional metadata related to translation.
     */
    fun setTranslationMetadata(translationMetadata: TranslationMetadata?) {
        this.translationMetadata = translationMetadata
    }

    fun withTranslationMetadata(translationMetadata: TranslationMetadata?): ToolComponent {
        this.translationMetadata = translationMetadata
        return this
    }

    /**
     * An array of toolComponentReference objects to declare the taxonomies supported by the tool component.
     */
    fun getSupportedTaxonomies(): Set<ToolComponentReference>? {
        return supportedTaxonomies
    }

    /**
     * An array of toolComponentReference objects to declare the taxonomies supported by the tool component.
     */
    fun setSupportedTaxonomies(supportedTaxonomies: Set<ToolComponentReference>?) {
        this.supportedTaxonomies = supportedTaxonomies
    }

    fun withSupportedTaxonomies(supportedTaxonomies: Set<ToolComponentReference>?): ToolComponent {
        this.supportedTaxonomies = supportedTaxonomies
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

    fun withProperties(properties: PropertyBag?): ToolComponent {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ToolComponent::class.java.name).append('@').append(
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
        sb.append("name")
        sb.append('=')
        sb.append((if ((this.name == null)) "<null>" else this.name))
        sb.append(',')
        sb.append("organization")
        sb.append('=')
        sb.append((if ((this.organization == null)) "<null>" else this.organization))
        sb.append(',')
        sb.append("product")
        sb.append('=')
        sb.append((if ((this.product == null)) "<null>" else this.product))
        sb.append(',')
        sb.append("productSuite")
        sb.append('=')
        sb.append((if ((this.productSuite == null)) "<null>" else this.productSuite))
        sb.append(',')
        sb.append("shortDescription")
        sb.append('=')
        sb.append((if ((this.shortDescription == null)) "<null>" else this.shortDescription))
        sb.append(',')
        sb.append("fullDescription")
        sb.append('=')
        sb.append((if ((this.fullDescription == null)) "<null>" else this.fullDescription))
        sb.append(',')
        sb.append("fullName")
        sb.append('=')
        sb.append((if ((this.fullName == null)) "<null>" else this.fullName))
        sb.append(',')
        sb.append("version")
        sb.append('=')
        sb.append((if ((this.version == null)) "<null>" else this.version))
        sb.append(',')
        sb.append("semanticVersion")
        sb.append('=')
        sb.append((if ((this.semanticVersion == null)) "<null>" else this.semanticVersion))
        sb.append(',')
        sb.append("dottedQuadFileVersion")
        sb.append('=')
        sb.append((if ((this.dottedQuadFileVersion == null)) "<null>" else this.dottedQuadFileVersion))
        sb.append(',')
        sb.append("releaseDateUtc")
        sb.append('=')
        sb.append((if ((this.releaseDateUtc == null)) "<null>" else this.releaseDateUtc))
        sb.append(',')
        sb.append("downloadUri")
        sb.append('=')
        sb.append((if ((this.downloadUri == null)) "<null>" else this.downloadUri))
        sb.append(',')
        sb.append("informationUri")
        sb.append('=')
        sb.append((if ((this.informationUri == null)) "<null>" else this.informationUri))
        sb.append(',')
        sb.append("globalMessageStrings")
        sb.append('=')
        sb.append((if ((this.globalMessageStrings == null)) "<null>" else this.globalMessageStrings))
        sb.append(',')
        sb.append("notifications")
        sb.append('=')
        sb.append((if ((this.notifications == null)) "<null>" else this.notifications))
        sb.append(',')
        sb.append("rules")
        sb.append('=')
        sb.append((if ((this.rules == null)) "<null>" else this.rules))
        sb.append(',')
        sb.append("taxa")
        sb.append('=')
        sb.append((if ((this.taxa == null)) "<null>" else this.taxa))
        sb.append(',')
        sb.append("locations")
        sb.append('=')
        sb.append((if ((this.locations == null)) "<null>" else this.locations))
        sb.append(',')
        sb.append("language")
        sb.append('=')
        sb.append((if ((this.language == null)) "<null>" else this.language))
        sb.append(',')
        sb.append("contents")
        sb.append('=')
        sb.append((if ((this.contents == null)) "<null>" else this.contents))
        sb.append(',')
        sb.append("isComprehensive")
        sb.append('=')
        sb.append(this.isIsComprehensive)
        sb.append(',')
        sb.append("localizedDataSemanticVersion")
        sb.append('=')
        sb.append((if ((this.localizedDataSemanticVersion == null)) "<null>" else this.localizedDataSemanticVersion))
        sb.append(',')
        sb.append("minimumRequiredLocalizedDataSemanticVersion")
        sb.append('=')
        sb.append((if ((this.minimumRequiredLocalizedDataSemanticVersion == null)) "<null>" else this.minimumRequiredLocalizedDataSemanticVersion))
        sb.append(',')
        sb.append("associatedComponent")
        sb.append('=')
        sb.append((if ((this.associatedComponent == null)) "<null>" else this.associatedComponent))
        sb.append(',')
        sb.append("translationMetadata")
        sb.append('=')
        sb.append((if ((this.translationMetadata == null)) "<null>" else this.translationMetadata))
        sb.append(',')
        sb.append("supportedTaxonomies")
        sb.append('=')
        sb.append((if ((this.supportedTaxonomies == null)) "<null>" else this.supportedTaxonomies))
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
        result = ((result * 31) + (if ((this.releaseDateUtc == null)) 0 else releaseDateUtc.hashCode()))
        result = ((result * 31) + (if ((this.rules == null)) 0 else rules.hashCode()))
        result = ((result * 31) + (if ((this.language == null)) 0 else language.hashCode()))
        result = ((result * 31) + (if ((this.downloadUri == null)) 0 else downloadUri.hashCode()))
        result = ((result * 31) + (if ((this.supportedTaxonomies == null)) 0 else supportedTaxonomies.hashCode()))
        result = ((result * 31) + (if ((this.fullDescription == null)) 0 else fullDescription.hashCode()))
        result = ((result * 31) + (if ((this.informationUri == null)) 0 else informationUri.hashCode()))
        result = ((result * 31) + (if ((this.associatedComponent == null)) 0 else associatedComponent.hashCode()))
        result = ((result * 31) + (if ((this.translationMetadata == null)) 0 else translationMetadata.hashCode()))
        result = ((result * 31) + (if ((this.productSuite == null)) 0 else productSuite.hashCode()))
        result = ((result * 31) + (if ((this.taxa == null)) 0 else taxa.hashCode()))
        result = ((result * 31) + (if ((this.product == null)) 0 else product.hashCode()))
        result = ((result * 31) + (if (this.isIsComprehensive) 1 else 0))
        result =
            ((result * 31) + (if ((this.minimumRequiredLocalizedDataSemanticVersion == null)) 0 else minimumRequiredLocalizedDataSemanticVersion.hashCode()))
        result = ((result * 31) + (if ((this.fullName == null)) 0 else fullName.hashCode()))
        result = ((result * 31) + (if ((this.shortDescription == null)) 0 else shortDescription.hashCode()))
        result = ((result * 31) + (if ((this.version == null)) 0 else version.hashCode()))
        result = ((result * 31) + (if ((this.globalMessageStrings == null)) 0 else globalMessageStrings.hashCode()))
        result =
            ((result * 31) + (if ((this.localizedDataSemanticVersion == null)) 0 else localizedDataSemanticVersion.hashCode()))
        result = ((result * 31) + (if ((this.dottedQuadFileVersion == null)) 0 else dottedQuadFileVersion.hashCode()))
        result = ((result * 31) + (if ((this.contents == null)) 0 else contents.hashCode()))
        result = ((result * 31) + (if ((this.organization == null)) 0 else organization.hashCode()))
        result = ((result * 31) + (if ((this.name == null)) 0 else name.hashCode()))
        result = ((result * 31) + (if ((this.semanticVersion == null)) 0 else semanticVersion.hashCode()))
        result = ((result * 31) + (if ((this.guid == null)) 0 else guid.hashCode()))
        result = ((result * 31) + (if ((this.locations == null)) 0 else locations.hashCode()))
        result = ((result * 31) + (if ((this.notifications == null)) 0 else notifications.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ToolComponent) == false) {
            return false
        }
        val rhs = other
        return (((((((((((((((((((((((((((((this.releaseDateUtc === rhs.releaseDateUtc) || ((this.releaseDateUtc != null) && (this.releaseDateUtc == rhs.releaseDateUtc))) && ((this.rules === rhs.rules) || ((this.rules != null) && (this.rules == rhs.rules)))) && ((this.language === rhs.language) || ((this.language != null) && (this.language == rhs.language)))) && ((this.downloadUri === rhs.downloadUri) || ((this.downloadUri != null) && (this.downloadUri == rhs.downloadUri)))) && ((this.supportedTaxonomies === rhs.supportedTaxonomies) || ((this.supportedTaxonomies != null) && (this.supportedTaxonomies == rhs.supportedTaxonomies)))) && ((this.fullDescription === rhs.fullDescription) || ((this.fullDescription != null) && fullDescription.equals(
            rhs.fullDescription
        )))) && ((this.informationUri === rhs.informationUri) || ((this.informationUri != null) && (this.informationUri == rhs.informationUri)))) && ((this.associatedComponent === rhs.associatedComponent) || ((this.associatedComponent != null) && associatedComponent.equals(
            rhs.associatedComponent
        )))) && ((this.translationMetadata === rhs.translationMetadata) || ((this.translationMetadata != null) && translationMetadata.equals(
            rhs.translationMetadata
        )))) && ((this.productSuite === rhs.productSuite) || ((this.productSuite != null) && (this.productSuite == rhs.productSuite)))) && ((this.taxa === rhs.taxa) || ((this.taxa != null) && (this.taxa == rhs.taxa)))) && ((this.product === rhs.product) || ((this.product != null) && (this.product == rhs.product)))) && (this.isIsComprehensive == rhs.isIsComprehensive)) && ((this.minimumRequiredLocalizedDataSemanticVersion === rhs.minimumRequiredLocalizedDataSemanticVersion) || ((this.minimumRequiredLocalizedDataSemanticVersion != null) && (this.minimumRequiredLocalizedDataSemanticVersion == rhs.minimumRequiredLocalizedDataSemanticVersion)))) && ((this.fullName === rhs.fullName) || ((this.fullName != null) && (this.fullName == rhs.fullName)))) && ((this.shortDescription === rhs.shortDescription) || ((this.shortDescription != null) && shortDescription.equals(
            rhs.shortDescription
        )))) && ((this.version === rhs.version) || ((this.version != null) && (this.version == rhs.version)))) && ((this.globalMessageStrings === rhs.globalMessageStrings) || ((this.globalMessageStrings != null) && globalMessageStrings.equals(
            rhs.globalMessageStrings
        )))) && ((this.localizedDataSemanticVersion === rhs.localizedDataSemanticVersion) || ((this.localizedDataSemanticVersion != null) && (this.localizedDataSemanticVersion == rhs.localizedDataSemanticVersion)))) && ((this.dottedQuadFileVersion === rhs.dottedQuadFileVersion) || ((this.dottedQuadFileVersion != null) && (this.dottedQuadFileVersion == rhs.dottedQuadFileVersion)))) && ((this.contents === rhs.contents) || ((this.contents != null) && (this.contents == rhs.contents)))) && ((this.organization === rhs.organization) || ((this.organization != null) && (this.organization == rhs.organization)))) && ((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name)))) && ((this.semanticVersion === rhs.semanticVersion) || ((this.semanticVersion != null) && (this.semanticVersion == rhs.semanticVersion)))) && ((this.guid === rhs.guid) || ((this.guid != null) && (this.guid == rhs.guid)))) && ((this.locations === rhs.locations) || ((this.locations != null) && (this.locations == rhs.locations)))) && ((this.notifications === rhs.notifications) || ((this.notifications != null) && (this.notifications == rhs.notifications)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
