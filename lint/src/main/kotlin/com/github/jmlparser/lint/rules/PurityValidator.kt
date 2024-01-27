package com.github.jmlparser.lint.rules

import com.github.javaparser.ast.Modifier

/**
 * @author Alexander Weigl
 * @version 1 (12/29/21)
 */
class PurityValidator : LintRuleVisitor() {
    fun visit(n: JmlSimpleExprClause, arg: LintProblemReporter) {
        val r = PurityVisitor()
        n.getExpression().accept(r, null)
        if (r.reason != null) {
            arg.error(r.reason, "", "", "Expression in JML clause must be pure." + r.text)
        }
    }


    fun visit(n: JmlClassExprDeclaration, arg: LintProblemReporter) {
        val r = PurityVisitor()
        n.getInvariant().accept(r, null)
        if (r.reason != null) {
            arg.error(r.reason, "", "", "Expression in JML invariant clause must be pure." + r.text)
        }
    }

    fun visit(n: JmlExpressionStmt, arg: LintProblemReporter) {
        val r = PurityVisitor()
        n.getExpression().accept(r, null)
        if (r.reason != null) {
            arg.error(r.reason, "", "", "Expression in JML statements must be pure." + r.text)
        }
    }


    private class PurityVisitor : VoidVisitorAdapter<Void?>() {
        var reason: Node? = null
        var text: String? = null

        fun visit(n: AssignExpr?, arg: Void?) {
            reason = n
        }

        fun visit(n: UnaryExpr, arg: Void?) {
            when (n.getOperator()) {
                POSTFIX_DECREMENT, POSTFIX_INCREMENT -> {
                    reason = n
                    text = "Postfix de-/increment operator found."
                }

                PREFIX_INCREMENT, PREFIX_DECREMENT -> {
                    reason = n
                    text = "Prefix de-/increment operator found"
                }

                else -> n.getExpression().accept(this, arg)
            }
        }

        fun visit(n: MethodCallExpr, arg: Void?) {
            val r: Unit = n.resolve().toAst()
            if (r.isPresent() && r.get() is NodeWithModifiers<*>
                && (mods.hasModifier(Modifier.DefaultKeyword.JML_PURE)
                        || mods.hasModifier(Modifier.DefaultKeyword.JML_STRICTLY_PURE))
            ) {
                super.visit(n, arg)
            } else {
                reason = n
                text = METHOD_NOT_PURE
            }
        }
    }

    companion object {
        const val METHOD_NOT_PURE: String = "JML expressions should be pure and this method might not be pure"
        const val ASSIGNMENT_NOT_PURE: String = "JML expressions should be pure and assignments are not pure"
    }
}
