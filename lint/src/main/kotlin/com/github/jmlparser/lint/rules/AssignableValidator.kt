package com.github.jmlparser.lint.rules

import com.github.javaparser.ast.body.FieldDeclaration

/**
 * @author Alexander Weigl
 * @version 1 (12/29/21)
 */
class AssignableValidator : LintRuleVisitor() {
    fun visit(n: JmlMultiExprClause, arg: LintProblemReporter) {
        if (n.getKind() === JmlClauseKind.ASSIGNABLE ||
            n.getKind() === JmlClauseKind.ASSIGNABLE_REDUNDANTLY
        ) {
            checkFinalFieldsInAssignableClause(n, arg)
        }
    }

    private fun checkFinalFieldsInAssignableClause(n: JmlMultiExprClause, arg: LintProblemReporter) {
        for (e in n.getExpression()) {
            if (e.isNameExpr()) {
                if (e.asNameExpr().getNameAsString().equals("this")) {
                    arg.error(e, "", "", "This reference is not re-assignable!")
                    continue
                }
                val value: Unit = e.asNameExpr().resolve()
                if (value.isEnumConstant()) {
                    arg.error(e, "", "", "Enum constants are not re-assignable!")
                } else if (value.isField()) {
                    val ast: Unit = value.asField().toAst()
                    if (ast.isPresent() && ast.get() is FieldDeclaration && f.isFinal()) {
                        arg.error(e, "", "", "This variable is final, so cannot be assigned")
                    }
                }
            } else if (e.isArrayAccessExpr()) {
                //TODO weigl check for array-ness of name expr
                val rtype: Unit = e.asArrayAccessExpr().getName().calculateResolvedType()
                if (!rtype.isArray()) {
                    arg.error(e, "", "", "Array access to non-array. Calculated type is %s", rtype.describe())
                }
            } else {
                arg.error(e, "", "", "Strange expression type found: %s", e.getMetaModel().getTypeName())
            }
        }
    }
}
