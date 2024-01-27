package com.github.jmlparser.lint.rules

import com.github.javaparser.ast.NodeList
import java.util.*

/**
 * @author Alexander Weigl
 * @version 1 (13.10.22)
 */
class AllowedJmlClauses : LintRuleVisitor() {
    private val LOOP_INVARIANT_CLAUSES: EnumSet<JmlClauseKind> = EnumSet.of<JmlClauseKind>(
        DECREASES,
        MODIFIES,
        MODIFIABLE,
        ASSIGNABLE,
        ACCESSIBLE,
        MAINTAINING,
        MAINTAINING_REDUNDANTLY,
        DECREASING,
        DECREASES_REDUNDANTLY,
        LOOP_INVARIANT,
        LOOP_INVARIANT_FREE,
        LOOP_INVARIANT_REDUNDANTLY
    )

    private val LOOP_CONTRACT_CLAUSES: EnumSet<JmlClauseKind> = EnumSet.of<JmlClauseKind>(
        ENSURES,
        ENSURES_FREE,
        ENSURES_REDUNDANTLY,
        REQUIRES,
        REQUIRES_FREE,
        REQUIRES_REDUNDANTLY,
        DECREASES,
        MODIFIES,
        MODIFIABLE,
        ASSIGNABLE,
        ACCESSIBLE,
        PRE,
        POST,
        PRE_REDUNDANTLY,
        POST_REDUNDANTLY,
        MAINTAINING,
        MAINTAINING_REDUNDANTLY,
        DECREASING,
        DECREASES_REDUNDANTLY,
        LOOP_INVARIANT,
        LOOP_INVARIANT_FREE,
        LOOP_INVARIANT_REDUNDANTLY,
        MEASURED_BY,
        RETURNS,
        RETURNS_REDUNDANTLY,
        BREAKS,
        BREAKS_REDUNDANTLY,
        CONTINUES,
        CONTINUES_REDUNDANTLY,
        OLD,
        FORALL,
        SIGNALS,
        SIGNALS_REDUNDANTLY,
        SIGNALS_ONLY,
        WHEN,
        WORKING_SPACE,
        WORKING_SPACE_REDUNDANTLY,
        CAPTURES,
        CAPTURES_REDUNDANTLY,
        INITIALLY,
        INVARIANT_REDUNDANTLY,
        INVARIANT,
        ASSIGNABLE_REDUNDANTLY,
        MODIFIABLE_REDUNDANTLY,
        MODIFIES_REDUNDANTLY,
        CALLABLE,
        CALLABLE_REDUNDANTLY,
        DIVERGES,
        DIVERGES_REDUNDANTLY,
        DURATION,
        DURATION_REDUNDANTLY
    )

    private val BLOCK_CONTRACT_CLAUSES: EnumSet<JmlClauseKind> = EnumSet.of<JmlClauseKind>(
        ENSURES,
        ENSURES_FREE,
        ENSURES_REDUNDANTLY,
        REQUIRES,
        REQUIRES_FREE,
        REQUIRES_REDUNDANTLY,
        DECREASES,
        MODIFIES,
        MODIFIABLE,
        ASSIGNABLE,
        ACCESSIBLE,
        PRE,
        POST,
        PRE_REDUNDANTLY,
        POST_REDUNDANTLY,
        MAINTAINING,
        MAINTAINING_REDUNDANTLY,
        DECREASING,
        DECREASES_REDUNDANTLY,
        LOOP_INVARIANT,
        LOOP_INVARIANT_FREE,
        LOOP_INVARIANT_REDUNDANTLY,
        MEASURED_BY,
        RETURNS,
        RETURNS_REDUNDANTLY,
        BREAKS,
        BREAKS_REDUNDANTLY,
        CONTINUES,
        CONTINUES_REDUNDANTLY,
        OLD,
        FORALL,
        SIGNALS,
        SIGNALS_REDUNDANTLY,
        SIGNALS_ONLY,
        WHEN,
        WORKING_SPACE,
        WORKING_SPACE_REDUNDANTLY,
        CAPTURES,
        CAPTURES_REDUNDANTLY,
        INITIALLY,
        INVARIANT_REDUNDANTLY,
        INVARIANT,
        ASSIGNABLE_REDUNDANTLY,
        MODIFIABLE_REDUNDANTLY,
        MODIFIES_REDUNDANTLY,
        CALLABLE,
        CALLABLE_REDUNDANTLY,
        DIVERGES,
        DIVERGES_REDUNDANTLY,
        DURATION,
        DURATION_REDUNDANTLY
    )

    private val currentlyAllowed: Set<JmlClauseKind> = HashSet<JmlClauseKind>()

    fun visit(n: JmlContract, arg: LintProblemReporter) {
        val a: Optional<NodeWithContracts> = n.findAncestor(NodeWithContracts::class.java)
        if (a.isPresent()) {
            val owner: NodeWithContracts = a.get()
            if (owner is ForEachStmt
                || owner is ForStmt
                || owner is WhileStmt
                || owner is DoStmt
            ) {
                if (n.getType() === JmlContract.Type.LOOP_INV) checkClauses(
                    arg,
                    n.getClauses(),
                    LOOP_INVARIANT_CLAUSES,
                    "loop_invariant"
                )
                else checkClauses(arg, n.getClauses(), LOOP_CONTRACT_CLAUSES, "loop")
            } else if (owner is MethodDeclaration) {
                checkClauses(arg, n.getClauses(), METHOD_CONTRACT_CLAUSES, "method")
            } else if (owner is BlockStmt) {
                checkClauses(arg, n.getClauses(), BLOCK_CONTRACT_CLAUSES, "block")
            }
        }
    }

    private fun checkClauses(
        arg: LintProblemReporter, clauses: NodeList<JmlClause>,
        allowed: EnumSet<JmlClauseKind>, type: String
    ) {
        for (clause in clauses) {
            if (!allowed.contains(clause.getKind())) {
                arg.warn(clause, "", "", "%s clause not allowed in a %s contract", clause.getKind(), type)
            }
        }
    }

    companion object {
        val METHOD_CONTRACT_CLAUSES: EnumSet<JmlClauseKind> = EnumSet.of<JmlClauseKind>(
            ENSURES,
            ENSURES_FREE,
            ENSURES_REDUNDANTLY,
            REQUIRES,
            REQUIRES_FREE,
            REQUIRES_REDUNDANTLY,
            DECREASES,
            MODIFIES,
            MODIFIABLE,
            ASSIGNABLE,
            ACCESSIBLE,
            PRE,
            POST,
            PRE_REDUNDANTLY,
            POST_REDUNDANTLY,
            DECREASING,
            DECREASES_REDUNDANTLY,
            MEASURED_BY,
            OLD,
            FORALL,
            SIGNALS,
            SIGNALS_REDUNDANTLY,
            SIGNALS_ONLY,
            WHEN,
            WORKING_SPACE,
            WORKING_SPACE_REDUNDANTLY,
            CAPTURES,
            CAPTURES_REDUNDANTLY,
            ASSIGNABLE_REDUNDANTLY,
            MODIFIABLE_REDUNDANTLY,
            MODIFIES_REDUNDANTLY,
            CALLABLE,
            CALLABLE_REDUNDANTLY,
            DIVERGES,
            DIVERGES_REDUNDANTLY,
            DURATION,
            DURATION_REDUNDANTLY
        )
    }
}
