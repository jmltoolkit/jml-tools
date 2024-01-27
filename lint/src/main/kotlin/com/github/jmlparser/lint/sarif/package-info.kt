/**
 * Generated classes for SARIF 2.1.
 *
 *
 * Used command-line
 * <pre>
 * bin/jsonschema2pojo -p com.github.jmlparser.lint.sarif -P -t ~/work/javaparser/jmlparser-jml-tools/src/main/java/ -tv 17  -a gson -s sarif-schema.json -b -c
</pre> *
 *
 * @author Alexander Weigl
 * @version 1 (11.02.23)
 */
package com.github.jmlparser.lint.sarif

import com.github.jmlparser.lint.LintRuleVisitor
import com.github.jmlparser.lint.LintProblemReporter
import com.github.jmlparser.lint.rules.ResultVarCheck
import com.github.jmlparser.lint.LintProblem
import com.github.jmlparser.lint.rules.PurityValidator.PurityVisitor
import com.github.jmlparser.lint.rules.PurityValidator
import com.github.jmlparser.lint.rules.AllowedJmlClauses
import com.github.jmlparser.lint.rules.JmlNameClashWithJava
import com.github.jmlparser.lint.LintRule
import com.github.jmlparser.lint.rules.ContextSensitiveForbiddenFunctionsValidator
import com.github.jmlparser.lint.sarif.Run.ColumnKind
import com.github.jmlparser.lint.sarif.Run
import com.github.jmlparser.lint.sarif.Result.BaselineState
import com.github.jmlparser.lint.sarif.CodeFlow
import com.github.jmlparser.lint.sarif.FinalState
import com.github.jmlparser.lint.sarif.Headers__1
import com.github.jmlparser.lint.sarif.ThreadFlow
import com.github.jmlparser.lint.sarif.WebRequest
import com.github.jmlparser.lint.sarif.PropertyBag
import com.github.jmlparser.lint.sarif.SarifSchema
import com.github.jmlparser.lint.sarif.Suppression
import com.github.jmlparser.lint.sarif.WebResponse
import com.github.jmlparser.lint.sarif.Fingerprints
import com.github.jmlparser.lint.sarif.EdgeTraversal
import com.github.jmlparser.lint.sarif.ToolComponent
import com.github.jmlparser.lint.sarif.ArtifactChange
import com.github.jmlparser.lint.sarif.GraphTraversal
import com.github.jmlparser.lint.sarif.ImmutableState
import com.github.jmlparser.lint.sarif.MessageStrings
import com.github.jmlparser.lint.sarif.ArtifactContent
import com.github.jmlparser.lint.sarif.InitialState__1
import com.github.jmlparser.lint.sarif.LogicalLocation
import com.github.jmlparser.lint.sarif.ArtifactLocation
import com.github.jmlparser.lint.sarif.PhysicalLocation
import com.github.jmlparser.lint.sarif.ResultProvenance
import com.github.jmlparser.lint.sarif.SpecialLocations
import com.github.jmlparser.lint.sarif.ImmutableState__1
import com.github.jmlparser.lint.sarif.ExternalProperties
import com.github.jmlparser.lint.sarif.OriginalUriBaseIds
import com.github.jmlparser.lint.sarif.ThreadFlowLocation.Importance
import com.github.jmlparser.lint.sarif.ThreadFlowLocation
import com.github.jmlparser.lint.sarif.PartialFingerprints
import com.github.jmlparser.lint.sarif.ReportingDescriptor
import com.github.jmlparser.lint.sarif.TranslationMetadata
import com.github.jmlparser.lint.sarif.EnvironmentVariables
import com.github.jmlparser.lint.sarif.GlobalMessageStrings
import com.github.jmlparser.lint.sarif.LocationRelationship
import com.github.jmlparser.lint.sarif.RunAutomationDetails
import com.github.jmlparser.lint.sarif.ConfigurationOverride
import com.github.jmlparser.lint.sarif.VersionControlDetails
import com.github.jmlparser.lint.sarif.ReportingConfiguration
import com.github.jmlparser.lint.sarif.ToolComponentReference
import com.github.jmlparser.lint.sarif.MultiformatMessageString
import com.github.jmlparser.lint.sarif.ReportingDescriptorReference
import com.github.jmlparser.lint.sarif.ExternalPropertyFileReference
import com.github.jmlparser.lint.sarif.ExternalPropertyFileReferences
import com.github.jmlparser.lint.sarif.ReportingDescriptorRelationship
import com.github.jmlparser.lint.JmlLintingFacade
