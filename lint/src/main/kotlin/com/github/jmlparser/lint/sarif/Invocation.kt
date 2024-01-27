package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import java.util.*
import javax.annotation.processing.Generated

/**
 * The runtime environment of the analysis tool run.
 */
@Generated("jsonschema2pojo")
class Invocation {
    /**
     * The command line used to invoke the tool.
     */
    /**
     * The command line used to invoke the tool.
     */
    /**
     * The command line used to invoke the tool.
     */
    @SerializedName("commandLine")
    @Expose
    var commandLine: String? = null
    /**
     * An array of strings, containing in order the command line arguments passed to the tool from the operating system.
     */
    /**
     * An array of strings, containing in order the command line arguments passed to the tool from the operating system.
     */
    /**
     * An array of strings, containing in order the command line arguments passed to the tool from the operating system.
     */
    @SerializedName("arguments")
    @Expose
    var arguments: List<String>? = ArrayList()

    /**
     * The locations of any response files specified on the tool's command line.
     */
    @SerializedName("responseFiles")
    @Expose
    private var responseFiles: Set<ArtifactLocation>? = LinkedHashSet<ArtifactLocation>()
    /**
     * The Coordinated Universal Time (UTC) date and time at which the run started. See "Date/time properties" in the SARIF spec for the required format.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which the run started. See "Date/time properties" in the SARIF spec for the required format.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which the run started. See "Date/time properties" in the SARIF spec for the required format.
     */
    @SerializedName("startTimeUtc")
    @Expose
    var startTimeUtc: Date? = null
    /**
     * The Coordinated Universal Time (UTC) date and time at which the run ended. See "Date/time properties" in the SARIF spec for the required format.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which the run ended. See "Date/time properties" in the SARIF spec for the required format.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which the run ended. See "Date/time properties" in the SARIF spec for the required format.
     */
    @SerializedName("endTimeUtc")
    @Expose
    var endTimeUtc: Date? = null
    /**
     * The process exit code.
     */
    /**
     * The process exit code.
     */
    /**
     * The process exit code.
     */
    @SerializedName("exitCode")
    @Expose
    var exitCode: Int = 0

    /**
     * An array of configurationOverride objects that describe rules related runtime overrides.
     */
    @SerializedName("ruleConfigurationOverrides")
    @Expose
    private var ruleConfigurationOverrides: Set<ConfigurationOverride>? = LinkedHashSet<ConfigurationOverride>()

    /**
     * An array of configurationOverride objects that describe notifications related runtime overrides.
     */
    @SerializedName("notificationConfigurationOverrides")
    @Expose
    private var notificationConfigurationOverrides: Set<ConfigurationOverride>? = LinkedHashSet<ConfigurationOverride>()

    /**
     * A list of runtime conditions detected by the tool during the analysis.
     */
    @SerializedName("toolExecutionNotifications")
    @Expose
    private var toolExecutionNotifications: List<Notification>? = ArrayList<Notification>()

    /**
     * A list of conditions detected by the tool that are relevant to the tool's configuration.
     */
    @SerializedName("toolConfigurationNotifications")
    @Expose
    private var toolConfigurationNotifications: List<Notification>? = ArrayList<Notification>()
    /**
     * The reason for the process exit.
     */
    /**
     * The reason for the process exit.
     */
    /**
     * The reason for the process exit.
     */
    @SerializedName("exitCodeDescription")
    @Expose
    var exitCodeDescription: String? = null
    /**
     * The name of the signal that caused the process to exit.
     */
    /**
     * The name of the signal that caused the process to exit.
     */
    /**
     * The name of the signal that caused the process to exit.
     */
    @SerializedName("exitSignalName")
    @Expose
    var exitSignalName: String? = null
    /**
     * The numeric value of the signal that caused the process to exit.
     */
    /**
     * The numeric value of the signal that caused the process to exit.
     */
    /**
     * The numeric value of the signal that caused the process to exit.
     */
    @SerializedName("exitSignalNumber")
    @Expose
    var exitSignalNumber: Int = 0
    /**
     * The reason given by the operating system that the process failed to start.
     */
    /**
     * The reason given by the operating system that the process failed to start.
     */
    /**
     * The reason given by the operating system that the process failed to start.
     */
    @SerializedName("processStartFailureMessage")
    @Expose
    var processStartFailureMessage: String? = null
    /**
     * Specifies whether the tool's execution completed successfully.
     * (Required)
     */
    /**
     * Specifies whether the tool's execution completed successfully.
     * (Required)
     */
    /**
     * Specifies whether the tool's execution completed successfully.
     * (Required)
     */
    @SerializedName("executionSuccessful")
    @Expose
    var isExecutionSuccessful: Boolean = false
    /**
     * The machine that hosted the analysis tool run.
     */
    /**
     * The machine that hosted the analysis tool run.
     */
    /**
     * The machine that hosted the analysis tool run.
     */
    @SerializedName("machine")
    @Expose
    var machine: String? = null
    /**
     * The account that ran the analysis tool.
     */
    /**
     * The account that ran the analysis tool.
     */
    /**
     * The account that ran the analysis tool.
     */
    @SerializedName("account")
    @Expose
    var account: String? = null
    /**
     * The process id for the analysis tool run.
     */
    /**
     * The process id for the analysis tool run.
     */
    /**
     * The process id for the analysis tool run.
     */
    @SerializedName("processId")
    @Expose
    var processId: Int = 0

    /**
     * Specifies the location of an artifact.
     */
    @SerializedName("executableLocation")
    @Expose
    private var executableLocation: ArtifactLocation? = null

    /**
     * Specifies the location of an artifact.
     */
    @SerializedName("workingDirectory")
    @Expose
    private var workingDirectory: ArtifactLocation? = null

    /**
     * The environment variables associated with the analysis tool process, expressed as key/value pairs.
     */
    @SerializedName("environmentVariables")
    @Expose
    private var environmentVariables: EnvironmentVariables? = null

    /**
     * Specifies the location of an artifact.
     */
    @SerializedName("stdin")
    @Expose
    private var stdin: ArtifactLocation? = null

    /**
     * Specifies the location of an artifact.
     */
    @SerializedName("stdout")
    @Expose
    private var stdout: ArtifactLocation? = null

    /**
     * Specifies the location of an artifact.
     */
    @SerializedName("stderr")
    @Expose
    private var stderr: ArtifactLocation? = null

    /**
     * Specifies the location of an artifact.
     */
    @SerializedName("stdoutStderr")
    @Expose
    private var stdoutStderr: ArtifactLocation? = null

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
     * @param endTimeUtc
     * @param stdin
     * @param stdout
     * @param workingDirectory
     * @param exitSignalNumber
     * @param exitCodeDescription
     * @param executableLocation
     * @param processId
     * @param exitCode
     * @param toolConfigurationNotifications
     * @param notificationConfigurationOverrides
     * @param processStartFailureMessage
     * @param stderr
     * @param ruleConfigurationOverrides
     * @param toolExecutionNotifications
     * @param machine
     * @param environmentVariables
     * @param stdoutStderr
     * @param arguments
     * @param responseFiles
     * @param commandLine
     * @param executionSuccessful
     * @param startTimeUtc
     * @param account
     * @param properties
     * @param exitSignalName
     */
    constructor(
        commandLine: String?,
        arguments: List<String>?,
        responseFiles: Set<ArtifactLocation>?,
        startTimeUtc: Date?,
        endTimeUtc: Date?,
        exitCode: Int,
        ruleConfigurationOverrides: Set<ConfigurationOverride>?,
        notificationConfigurationOverrides: Set<ConfigurationOverride>?,
        toolExecutionNotifications: List<Notification>?,
        toolConfigurationNotifications: List<Notification>?,
        exitCodeDescription: String?,
        exitSignalName: String?,
        exitSignalNumber: Int,
        processStartFailureMessage: String?,
        executionSuccessful: Boolean,
        machine: String?,
        account: String?,
        processId: Int,
        executableLocation: ArtifactLocation?,
        workingDirectory: ArtifactLocation?,
        environmentVariables: EnvironmentVariables?,
        stdin: ArtifactLocation?,
        stdout: ArtifactLocation?,
        stderr: ArtifactLocation?,
        stdoutStderr: ArtifactLocation?,
        properties: PropertyBag?
    ) : super() {
        this.commandLine = commandLine
        this.arguments = arguments
        this.responseFiles = responseFiles
        this.startTimeUtc = startTimeUtc
        this.endTimeUtc = endTimeUtc
        this.exitCode = exitCode
        this.ruleConfigurationOverrides = ruleConfigurationOverrides
        this.notificationConfigurationOverrides = notificationConfigurationOverrides
        this.toolExecutionNotifications = toolExecutionNotifications
        this.toolConfigurationNotifications = toolConfigurationNotifications
        this.exitCodeDescription = exitCodeDescription
        this.exitSignalName = exitSignalName
        this.exitSignalNumber = exitSignalNumber
        this.processStartFailureMessage = processStartFailureMessage
        this.isExecutionSuccessful = executionSuccessful
        this.machine = machine
        this.account = account
        this.processId = processId
        this.executableLocation = executableLocation
        this.workingDirectory = workingDirectory
        this.environmentVariables = environmentVariables
        this.stdin = stdin
        this.stdout = stdout
        this.stderr = stderr
        this.stdoutStderr = stdoutStderr
        this.properties = properties
    }

    fun withCommandLine(commandLine: String?): Invocation {
        this.commandLine = commandLine
        return this
    }

    fun withArguments(arguments: List<String>?): Invocation {
        this.arguments = arguments
        return this
    }

    /**
     * The locations of any response files specified on the tool's command line.
     */
    fun getResponseFiles(): Set<ArtifactLocation>? {
        return responseFiles
    }

    /**
     * The locations of any response files specified on the tool's command line.
     */
    fun setResponseFiles(responseFiles: Set<ArtifactLocation>?) {
        this.responseFiles = responseFiles
    }

    fun withResponseFiles(responseFiles: Set<ArtifactLocation>?): Invocation {
        this.responseFiles = responseFiles
        return this
    }

    fun withStartTimeUtc(startTimeUtc: Date?): Invocation {
        this.startTimeUtc = startTimeUtc
        return this
    }

    fun withEndTimeUtc(endTimeUtc: Date?): Invocation {
        this.endTimeUtc = endTimeUtc
        return this
    }

    fun withExitCode(exitCode: Int): Invocation {
        this.exitCode = exitCode
        return this
    }

    /**
     * An array of configurationOverride objects that describe rules related runtime overrides.
     */
    fun getRuleConfigurationOverrides(): Set<ConfigurationOverride>? {
        return ruleConfigurationOverrides
    }

    /**
     * An array of configurationOverride objects that describe rules related runtime overrides.
     */
    fun setRuleConfigurationOverrides(ruleConfigurationOverrides: Set<ConfigurationOverride>?) {
        this.ruleConfigurationOverrides = ruleConfigurationOverrides
    }

    fun withRuleConfigurationOverrides(ruleConfigurationOverrides: Set<ConfigurationOverride>?): Invocation {
        this.ruleConfigurationOverrides = ruleConfigurationOverrides
        return this
    }

    /**
     * An array of configurationOverride objects that describe notifications related runtime overrides.
     */
    fun getNotificationConfigurationOverrides(): Set<ConfigurationOverride>? {
        return notificationConfigurationOverrides
    }

    /**
     * An array of configurationOverride objects that describe notifications related runtime overrides.
     */
    fun setNotificationConfigurationOverrides(notificationConfigurationOverrides: Set<ConfigurationOverride>?) {
        this.notificationConfigurationOverrides = notificationConfigurationOverrides
    }

    fun withNotificationConfigurationOverrides(notificationConfigurationOverrides: Set<ConfigurationOverride>?): Invocation {
        this.notificationConfigurationOverrides = notificationConfigurationOverrides
        return this
    }

    /**
     * A list of runtime conditions detected by the tool during the analysis.
     */
    fun getToolExecutionNotifications(): List<Notification>? {
        return toolExecutionNotifications
    }

    /**
     * A list of runtime conditions detected by the tool during the analysis.
     */
    fun setToolExecutionNotifications(toolExecutionNotifications: List<Notification>?) {
        this.toolExecutionNotifications = toolExecutionNotifications
    }

    fun withToolExecutionNotifications(toolExecutionNotifications: List<Notification>?): Invocation {
        this.toolExecutionNotifications = toolExecutionNotifications
        return this
    }

    /**
     * A list of conditions detected by the tool that are relevant to the tool's configuration.
     */
    fun getToolConfigurationNotifications(): List<Notification>? {
        return toolConfigurationNotifications
    }

    /**
     * A list of conditions detected by the tool that are relevant to the tool's configuration.
     */
    fun setToolConfigurationNotifications(toolConfigurationNotifications: List<Notification>?) {
        this.toolConfigurationNotifications = toolConfigurationNotifications
    }

    fun withToolConfigurationNotifications(toolConfigurationNotifications: List<Notification>?): Invocation {
        this.toolConfigurationNotifications = toolConfigurationNotifications
        return this
    }

    fun withExitCodeDescription(exitCodeDescription: String?): Invocation {
        this.exitCodeDescription = exitCodeDescription
        return this
    }

    fun withExitSignalName(exitSignalName: String?): Invocation {
        this.exitSignalName = exitSignalName
        return this
    }

    fun withExitSignalNumber(exitSignalNumber: Int): Invocation {
        this.exitSignalNumber = exitSignalNumber
        return this
    }

    fun withProcessStartFailureMessage(processStartFailureMessage: String?): Invocation {
        this.processStartFailureMessage = processStartFailureMessage
        return this
    }

    fun withExecutionSuccessful(executionSuccessful: Boolean): Invocation {
        this.isExecutionSuccessful = executionSuccessful
        return this
    }

    fun withMachine(machine: String?): Invocation {
        this.machine = machine
        return this
    }

    fun withAccount(account: String?): Invocation {
        this.account = account
        return this
    }

    fun withProcessId(processId: Int): Invocation {
        this.processId = processId
        return this
    }

    /**
     * Specifies the location of an artifact.
     */
    fun getExecutableLocation(): ArtifactLocation? {
        return executableLocation
    }

    /**
     * Specifies the location of an artifact.
     */
    fun setExecutableLocation(executableLocation: ArtifactLocation?) {
        this.executableLocation = executableLocation
    }

    fun withExecutableLocation(executableLocation: ArtifactLocation?): Invocation {
        this.executableLocation = executableLocation
        return this
    }

    /**
     * Specifies the location of an artifact.
     */
    fun getWorkingDirectory(): ArtifactLocation? {
        return workingDirectory
    }

    /**
     * Specifies the location of an artifact.
     */
    fun setWorkingDirectory(workingDirectory: ArtifactLocation?) {
        this.workingDirectory = workingDirectory
    }

    fun withWorkingDirectory(workingDirectory: ArtifactLocation?): Invocation {
        this.workingDirectory = workingDirectory
        return this
    }

    /**
     * The environment variables associated with the analysis tool process, expressed as key/value pairs.
     */
    fun getEnvironmentVariables(): EnvironmentVariables? {
        return environmentVariables
    }

    /**
     * The environment variables associated with the analysis tool process, expressed as key/value pairs.
     */
    fun setEnvironmentVariables(environmentVariables: EnvironmentVariables?) {
        this.environmentVariables = environmentVariables
    }

    fun withEnvironmentVariables(environmentVariables: EnvironmentVariables?): Invocation {
        this.environmentVariables = environmentVariables
        return this
    }

    /**
     * Specifies the location of an artifact.
     */
    fun getStdin(): ArtifactLocation? {
        return stdin
    }

    /**
     * Specifies the location of an artifact.
     */
    fun setStdin(stdin: ArtifactLocation?) {
        this.stdin = stdin
    }

    fun withStdin(stdin: ArtifactLocation?): Invocation {
        this.stdin = stdin
        return this
    }

    /**
     * Specifies the location of an artifact.
     */
    fun getStdout(): ArtifactLocation? {
        return stdout
    }

    /**
     * Specifies the location of an artifact.
     */
    fun setStdout(stdout: ArtifactLocation?) {
        this.stdout = stdout
    }

    fun withStdout(stdout: ArtifactLocation?): Invocation {
        this.stdout = stdout
        return this
    }

    /**
     * Specifies the location of an artifact.
     */
    fun getStderr(): ArtifactLocation? {
        return stderr
    }

    /**
     * Specifies the location of an artifact.
     */
    fun setStderr(stderr: ArtifactLocation?) {
        this.stderr = stderr
    }

    fun withStderr(stderr: ArtifactLocation?): Invocation {
        this.stderr = stderr
        return this
    }

    /**
     * Specifies the location of an artifact.
     */
    fun getStdoutStderr(): ArtifactLocation? {
        return stdoutStderr
    }

    /**
     * Specifies the location of an artifact.
     */
    fun setStdoutStderr(stdoutStderr: ArtifactLocation?) {
        this.stdoutStderr = stdoutStderr
    }

    fun withStdoutStderr(stdoutStderr: ArtifactLocation?): Invocation {
        this.stdoutStderr = stdoutStderr
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

    fun withProperties(properties: PropertyBag?): Invocation {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Invocation::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("commandLine")
        sb.append('=')
        sb.append((if ((this.commandLine == null)) "<null>" else this.commandLine))
        sb.append(',')
        sb.append("arguments")
        sb.append('=')
        sb.append((if ((this.arguments == null)) "<null>" else this.arguments))
        sb.append(',')
        sb.append("responseFiles")
        sb.append('=')
        sb.append((if ((this.responseFiles == null)) "<null>" else this.responseFiles))
        sb.append(',')
        sb.append("startTimeUtc")
        sb.append('=')
        sb.append((if ((this.startTimeUtc == null)) "<null>" else this.startTimeUtc))
        sb.append(',')
        sb.append("endTimeUtc")
        sb.append('=')
        sb.append((if ((this.endTimeUtc == null)) "<null>" else this.endTimeUtc))
        sb.append(',')
        sb.append("exitCode")
        sb.append('=')
        sb.append(this.exitCode)
        sb.append(',')
        sb.append("ruleConfigurationOverrides")
        sb.append('=')
        sb.append((if ((this.ruleConfigurationOverrides == null)) "<null>" else this.ruleConfigurationOverrides))
        sb.append(',')
        sb.append("notificationConfigurationOverrides")
        sb.append('=')
        sb.append((if ((this.notificationConfigurationOverrides == null)) "<null>" else this.notificationConfigurationOverrides))
        sb.append(',')
        sb.append("toolExecutionNotifications")
        sb.append('=')
        sb.append((if ((this.toolExecutionNotifications == null)) "<null>" else this.toolExecutionNotifications))
        sb.append(',')
        sb.append("toolConfigurationNotifications")
        sb.append('=')
        sb.append((if ((this.toolConfigurationNotifications == null)) "<null>" else this.toolConfigurationNotifications))
        sb.append(',')
        sb.append("exitCodeDescription")
        sb.append('=')
        sb.append((if ((this.exitCodeDescription == null)) "<null>" else this.exitCodeDescription))
        sb.append(',')
        sb.append("exitSignalName")
        sb.append('=')
        sb.append((if ((this.exitSignalName == null)) "<null>" else this.exitSignalName))
        sb.append(',')
        sb.append("exitSignalNumber")
        sb.append('=')
        sb.append(this.exitSignalNumber)
        sb.append(',')
        sb.append("processStartFailureMessage")
        sb.append('=')
        sb.append((if ((this.processStartFailureMessage == null)) "<null>" else this.processStartFailureMessage))
        sb.append(',')
        sb.append("executionSuccessful")
        sb.append('=')
        sb.append(this.isExecutionSuccessful)
        sb.append(',')
        sb.append("machine")
        sb.append('=')
        sb.append((if ((this.machine == null)) "<null>" else this.machine))
        sb.append(',')
        sb.append("account")
        sb.append('=')
        sb.append((if ((this.account == null)) "<null>" else this.account))
        sb.append(',')
        sb.append("processId")
        sb.append('=')
        sb.append(this.processId)
        sb.append(',')
        sb.append("executableLocation")
        sb.append('=')
        sb.append((if ((this.executableLocation == null)) "<null>" else this.executableLocation))
        sb.append(',')
        sb.append("workingDirectory")
        sb.append('=')
        sb.append((if ((this.workingDirectory == null)) "<null>" else this.workingDirectory))
        sb.append(',')
        sb.append("environmentVariables")
        sb.append('=')
        sb.append((if ((this.environmentVariables == null)) "<null>" else this.environmentVariables))
        sb.append(',')
        sb.append("stdin")
        sb.append('=')
        sb.append((if ((this.stdin == null)) "<null>" else this.stdin))
        sb.append(',')
        sb.append("stdout")
        sb.append('=')
        sb.append((if ((this.stdout == null)) "<null>" else this.stdout))
        sb.append(',')
        sb.append("stderr")
        sb.append('=')
        sb.append((if ((this.stderr == null)) "<null>" else this.stderr))
        sb.append(',')
        sb.append("stdoutStderr")
        sb.append('=')
        sb.append((if ((this.stdoutStderr == null)) "<null>" else this.stdoutStderr))
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
        result = ((result * 31) + (if ((this.endTimeUtc == null)) 0 else endTimeUtc.hashCode()))
        result = ((result * 31) + (if ((this.stdin == null)) 0 else stdin.hashCode()))
        result = ((result * 31) + (if ((this.stdout == null)) 0 else stdout.hashCode()))
        result = ((result * 31) + (if ((this.workingDirectory == null)) 0 else workingDirectory.hashCode()))
        result = ((result * 31) + this.exitSignalNumber)
        result = ((result * 31) + (if ((this.exitCodeDescription == null)) 0 else exitCodeDescription.hashCode()))
        result = ((result * 31) + (if ((this.executableLocation == null)) 0 else executableLocation.hashCode()))
        result = ((result * 31) + this.processId)
        result = ((result * 31) + this.exitCode)
        result =
            ((result * 31) + (if ((this.toolConfigurationNotifications == null)) 0 else toolConfigurationNotifications.hashCode()))
        result =
            ((result * 31) + (if ((this.notificationConfigurationOverrides == null)) 0 else notificationConfigurationOverrides.hashCode()))
        result =
            ((result * 31) + (if ((this.processStartFailureMessage == null)) 0 else processStartFailureMessage.hashCode()))
        result = ((result * 31) + (if ((this.stderr == null)) 0 else stderr.hashCode()))
        result =
            ((result * 31) + (if ((this.ruleConfigurationOverrides == null)) 0 else ruleConfigurationOverrides.hashCode()))
        result =
            ((result * 31) + (if ((this.toolExecutionNotifications == null)) 0 else toolExecutionNotifications.hashCode()))
        result = ((result * 31) + (if ((this.machine == null)) 0 else machine.hashCode()))
        result = ((result * 31) + (if ((this.environmentVariables == null)) 0 else environmentVariables.hashCode()))
        result = ((result * 31) + (if ((this.stdoutStderr == null)) 0 else stdoutStderr.hashCode()))
        result = ((result * 31) + (if ((this.arguments == null)) 0 else arguments.hashCode()))
        result = ((result * 31) + (if ((this.responseFiles == null)) 0 else responseFiles.hashCode()))
        result = ((result * 31) + (if ((this.commandLine == null)) 0 else commandLine.hashCode()))
        result = ((result * 31) + (if (this.isExecutionSuccessful) 1 else 0))
        result = ((result * 31) + (if ((this.startTimeUtc == null)) 0 else startTimeUtc.hashCode()))
        result = ((result * 31) + (if ((this.account == null)) 0 else account.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + (if ((this.exitSignalName == null)) 0 else exitSignalName.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Invocation) == false) {
            return false
        }
        val rhs = other
        return (((((((((((((((((((((((((((this.endTimeUtc === rhs.endTimeUtc) || ((this.endTimeUtc != null) && (this.endTimeUtc == rhs.endTimeUtc))) && ((this.stdin === rhs.stdin) || ((this.stdin != null) && stdin.equals(
            rhs.stdin
        )))) && ((this.stdout === rhs.stdout) || ((this.stdout != null) && stdout.equals(rhs.stdout)))) && ((this.workingDirectory === rhs.workingDirectory) || ((this.workingDirectory != null) && workingDirectory.equals(
            rhs.workingDirectory
        )))) && (this.exitSignalNumber == rhs.exitSignalNumber)) && ((this.exitCodeDescription === rhs.exitCodeDescription) || ((this.exitCodeDescription != null) && (this.exitCodeDescription == rhs.exitCodeDescription)))) && ((this.executableLocation === rhs.executableLocation) || ((this.executableLocation != null) && executableLocation.equals(
            rhs.executableLocation
        )))) && (this.processId == rhs.processId)) && (this.exitCode == rhs.exitCode)) && ((this.toolConfigurationNotifications === rhs.toolConfigurationNotifications) || ((this.toolConfigurationNotifications != null) && (this.toolConfigurationNotifications == rhs.toolConfigurationNotifications)))) && ((this.notificationConfigurationOverrides === rhs.notificationConfigurationOverrides) || ((this.notificationConfigurationOverrides != null) && (this.notificationConfigurationOverrides == rhs.notificationConfigurationOverrides)))) && ((this.processStartFailureMessage === rhs.processStartFailureMessage) || ((this.processStartFailureMessage != null) && (this.processStartFailureMessage == rhs.processStartFailureMessage)))) && ((this.stderr === rhs.stderr) || ((this.stderr != null) && stderr.equals(
            rhs.stderr
        )))) && ((this.ruleConfigurationOverrides === rhs.ruleConfigurationOverrides) || ((this.ruleConfigurationOverrides != null) && (this.ruleConfigurationOverrides == rhs.ruleConfigurationOverrides)))) && ((this.toolExecutionNotifications === rhs.toolExecutionNotifications) || ((this.toolExecutionNotifications != null) && (this.toolExecutionNotifications == rhs.toolExecutionNotifications)))) && ((this.machine === rhs.machine) || ((this.machine != null) && (this.machine == rhs.machine)))) && ((this.environmentVariables === rhs.environmentVariables) || ((this.environmentVariables != null) && environmentVariables.equals(
            rhs.environmentVariables
        )))) && ((this.stdoutStderr === rhs.stdoutStderr) || ((this.stdoutStderr != null) && stdoutStderr.equals(rhs.stdoutStderr)))) && ((this.arguments === rhs.arguments) || ((this.arguments != null) && (this.arguments == rhs.arguments)))) && ((this.responseFiles === rhs.responseFiles) || ((this.responseFiles != null) && (this.responseFiles == rhs.responseFiles)))) && ((this.commandLine === rhs.commandLine) || ((this.commandLine != null) && (this.commandLine == rhs.commandLine)))) && (this.isExecutionSuccessful == rhs.isExecutionSuccessful)) && ((this.startTimeUtc === rhs.startTimeUtc) || ((this.startTimeUtc != null) && (this.startTimeUtc == rhs.startTimeUtc)))) && ((this.account === rhs.account) || ((this.account != null) && (this.account == rhs.account)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        )))) && ((this.exitSignalName === rhs.exitSignalName) || ((this.exitSignalName != null) && (this.exitSignalName == rhs.exitSignalName))))
    }
}
