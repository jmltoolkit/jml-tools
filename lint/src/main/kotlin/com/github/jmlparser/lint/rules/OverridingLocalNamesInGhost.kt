package com.github.jmlparser.lint.rules

/**
 * @author Alexander Weigl
 * @version 1 (14.10.22)
 */
class OverridingLocalNamesInGhost : LintRuleVisitor() {
    private var inGhost = false

    protected override fun reset() {
        inGhost = false
    }

    fun visit(n: JmlGhostStmt?, arg: LintProblemReporter?) {
        inGhost = true
        super.visit(n, arg)
        inGhost = false
    }

    fun visit(n: VariableDeclarationExpr, arg: LintProblemReporter) {
        if (inGhost) {
            val s: JmlGhostStmt = n.findAncestor(JmlGhostStmt::class.java).get()
            for (variable in n.getVariables()) {
                val name: Unit = variable.getNameAsExpression()
                name.setParentNode(s)
                val value: Unit = s.getSymbolResolver().resolveDeclaration(name, ResolvedValueDeclaration::class.java)
                name.setParentNode(null)
                if (value != null) {
                    arg.error(variable, "", "", "Variable %s already declared in Java.", variable.getNameAsString())
                }
            }
        }
    }
}
