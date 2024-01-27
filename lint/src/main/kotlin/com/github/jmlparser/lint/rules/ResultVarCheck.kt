package com.github.jmlparser.lint.rules

import com.github.javaparser.ast.body.MethodDeclaration

/**
 * @author Alexander Weigl
 * @version 1 (14.10.22)
 */
class ResultVarCheck : LintRuleVisitor() {
    private var inMethodWithNonVoidReturnType = false
    private var inPostCondition = false

    protected override fun reset() {
        inPostCondition = false
    }

    fun visit(n: MethodDeclaration, arg: LintProblemReporter?) {
        inMethodWithNonVoidReturnType = !n.getType().isVoidType()
        n.getContracts().ifPresent { l -> l.forEach { v -> v.accept(this, arg) } }
        inMethodWithNonVoidReturnType = false
        n.getBody().ifPresent { l -> l.accept(this, arg) }
    }

    fun visit(n: JmlSimpleExprClause, arg: LintProblemReporter?) {
        inPostCondition =
            n.getKind() === JmlClauseKind.ENSURES || n.getKind() === JmlClauseKind.ENSURES_FREE || n.getKind() === JmlClauseKind.ENSURES_REDUNDANTLY || n.getKind() === JmlClauseKind.POST || n.getKind() === JmlClauseKind.POST_REDUNDANTLY
        super.visit(n, arg)
        inPostCondition = false
    }

    fun visit(n: NameExpr, arg: LintProblemReporter) {
        if (n.getNameAsString().equals("\\result")) {
            if (!inPostCondition) arg.error(n, "", "", "Use of \\result in non-post-conditional clause.")
            if (!inMethodWithNonVoidReturnType) arg.error(n, "", "", NO_METHOD_RESULT)
        }
    }

    companion object {
        const val NO_METHOD_RESULT: String =
            "Cannot use \\result here, as this method / constructor does not return anything"
    }
}
