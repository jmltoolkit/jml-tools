package com.github.jmlparser.lint.rules

import com.github.javaparser.ast.body.MethodDeclaration

class MethodBodyHasNoContract : VisitorValidator() {
    fun visit(n: MethodDeclaration, arg: ProblemReporter) {
        if (n.getBody().isPresent() && n.getBody().get().getContracts().isPresent()
            && !n.getBody().get().getContracts().get().isEmpty()
        ) {
            arg.report(n, "Body of method has a block contract.")
        }
        super.visit(n, arg)
    }
}
