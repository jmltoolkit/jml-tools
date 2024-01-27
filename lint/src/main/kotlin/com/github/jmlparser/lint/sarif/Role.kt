package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.SerializedName
import javax.annotation.processing.Generated

@Generated("jsonschema2pojo")
enum class Role(private val value: String) {
    @SerializedName("analysisTarget")
    ANALYSIS_TARGET("analysisTarget"),
    @SerializedName("attachment")
    ATTACHMENT("attachment"),
    @SerializedName("responseFile")
    RESPONSE_FILE("responseFile"),
    @SerializedName("resultFile")
    RESULT_FILE("resultFile"),
    @SerializedName("standardStream")
    STANDARD_STREAM("standardStream"),
    @SerializedName("tracedFile")
    TRACED_FILE("tracedFile"),
    @SerializedName("unmodified")
    UNMODIFIED("unmodified"),
    @SerializedName("modified")
    MODIFIED("modified"),
    @SerializedName("added")
    ADDED("added"),
    @SerializedName("deleted")
    DELETED("deleted"),
    @SerializedName("renamed")
    RENAMED("renamed"),
    @SerializedName("uncontrolled")
    UNCONTROLLED("uncontrolled"),
    @SerializedName("driver")
    DRIVER("driver"),
    @SerializedName("extension")
    EXTENSION("extension"),
    @SerializedName("translation")
    TRANSLATION("translation"),
    @SerializedName("taxonomy")
    TAXONOMY("taxonomy"),
    @SerializedName("policy")
    POLICY("policy"),
    @SerializedName("referencedOnCommandLine")
    REFERENCED_ON_COMMAND_LINE("referencedOnCommandLine"),
    @SerializedName("memoryContents")
    MEMORY_CONTENTS("memoryContents"),
    @SerializedName("directory")
    DIRECTORY("directory"),
    @SerializedName("userSpecifiedConfiguration")
    USER_SPECIFIED_CONFIGURATION("userSpecifiedConfiguration"),
    @SerializedName("toolSpecifiedConfiguration")
    TOOL_SPECIFIED_CONFIGURATION("toolSpecifiedConfiguration"),
    @SerializedName("debugOutputFile")
    DEBUG_OUTPUT_FILE("debugOutputFile");

    override fun toString(): String {
        return this.value
    }

    fun value(): String {
        return this.value
    }

    companion object {
        private val CONSTANTS: MutableMap<String, Role> = HashMap()

        init {
            for (c in entries) {
                CONSTANTS[c.value] = c
            }
        }

        fun fromValue(value: String): Role {
            val constant = CONSTANTS[value]
            requireNotNull(constant) { value }
            return constant
        }
    }
}
