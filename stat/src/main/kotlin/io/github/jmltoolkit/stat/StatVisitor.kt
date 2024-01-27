package io.github.jmltoolkit.stat

import com.github.javaparser.ast.*
import com.github.javaparser.ast.body.*
import com.github.javaparser.ast.expr.*
import com.github.javaparser.ast.jml.*
import com.github.javaparser.ast.jml.expr.JmlLabelExpr
import com.github.javaparser.ast.jml.expr.JmlLetExpr
import com.github.javaparser.ast.jml.expr.JmlMultiCompareExpr
import com.github.javaparser.ast.jml.expr.JmlTypeExpr
import com.github.javaparser.ast.type.*
import com.github.javaparser.ast.visitor.VoidVisitorAdapter
import org.w3c.dom.Document
import org.w3c.dom.Element
import java.util.*

/**
 * @author Alexander Weigl
 * @version 1 (24.05.22)
 */
class StatVisitor(
    private val xmlDocument: Document,
    private val keys: List<String>,
    private val expressionCosts: ExpressionCosts
) : VoidVisitorAdapter<Element?>() {
    //region Java Stuff
    fun visit(n: CompilationUnit, arg: Element) {
        super.visit(n, newJavaContext(arg, n.javaClass.getSimpleName(), n.getStorage().get().getFileName()))
    }

    fun visit(n: MethodDeclaration, arg: Element) {
        var arg = arg
        arg = newJavaContext(
            arg, n.javaClass.getSimpleName(),
            n.getDeclarationAsString(false, false, true)
        )
        super.visit(n, arg)
    }

    fun visit(n: ClassOrInterfaceDeclaration?, arg: Element?) {
        var arg = arg
        arg = newJavaContext(arg, n)
        super.visit(n, arg)
    }

    fun visit(n: ConstructorDeclaration, arg: Element) {
        var arg = arg
        arg = newJavaContext(
            arg, n.javaClass.getSimpleName(),
            n.getDeclarationAsString(false, false, true)
        )
        super.visit(n, arg)
    }

    fun visit(n: AnnotationDeclaration?, arg: Element?) {
        var arg = newJavaContext(arg, n)
        super.visit(n, arg)
    }

    fun visit(n: AnnotationMemberDeclaration?, arg: Element?) {
        super.visit(n, arg)
    }

    fun visit(n: EnumDeclaration?, arg: Element?) {
        super.visit(n, newJavaContext(arg, n))
    }

    fun visit(n: LocalClassDeclarationStmt?, arg: Element?) {
        super.visit(n, arg)
    }

    fun visit(n: ModuleDeclaration?, arg: Element?) {
        super.visit(n, newJavaContext(arg, n))
    }

    private fun newJavaContext(parent: Element, node: NodeWithName<*>): Element {
        return newJavaContext(parent, node.javaClass.getSimpleName(), node.getNameAsString())
    }

    private fun newJavaContext(parent: Element, node: NodeWithSimpleName<*>): Element {
        return newJavaContext(parent, node.javaClass.getSimpleName(), node.getNameAsString())
    }

    private fun newJavaContext(parent: Element, simpleName: String, name: String): Element {
        val e = xmlDocument.createElement(simpleName)
        e.setAttribute("name", name)
        parent.appendChild(e)
        return e
    }

    //endregion
    //region plain text reporting
    fun visit(n: JmlDocDeclaration, arg: Element) {
        reportPlainText(n, arg)
    }

    fun visit(n: JmlDoc?, arg: Element?) {
    }

    fun visit(n: JmlDocStmt, arg: Element) {
        reportPlainText(n, arg)
    }

    fun visit(n: JmlDocType, arg: Element) {
        reportPlainText(n, arg)
    }

    private fun reportPlainText(n: JmlDocContainer, arg: Element) {
        val doc: JmlDocSanitizer = JmlDocSanitizer(TreeSet<E>(keys))
        val san: String = doc.asString(n.getJmlComments(), false)
        val newlines = newlines(san)
        val e = xmlDocument.createElement("jml-comment")
        arg.appendChild(e)
        e.setAttribute("newlines", "" + newlines)
        e.setAttribute("type", n.javaClass.getSimpleName())
        e.setAttribute("chars", "" + san.length)
    }

    //endregion
    fun visit(n: JmlClassExprDeclaration, arg: Element) {
        if (active(n)) {
            val e = newElement(arg, n.getKind().getIdentifier())
            val expr = getExpressionStat(n.getInvariant())
            e.appendChild(expr)
            if (n.getName().isPresent()) {
                e.setAttribute("name", n.getName().get().asString())
            }
            setModifierAsAttributes(n, e)
        }
    }

    private fun setModifierAsAttributes(n: NodeWithModifiers<*>, e: Element) {
        for (modifier in n.getModifiers()) {
            e.setAttribute("has" + modifier.getKeyword().asString(), "true")
        }
    }

    private fun getExpressionStat(expr: Expression): Element {
        val e = xmlDocument.createElement("expr")
        val costs: Int = expr.accept(ExpressionComplexity(), expressionCosts)
        val numOfVariables = numberOfVariables(expr)
        val length = lengthOf(expr)
        e.setAttribute("complexity", "" + costs)
        e.setAttribute("numOfVariables", "" + numOfVariables)
        e.setAttribute("length", "" + length)

        val map = count(expr)
        map.forEach(BiConsumer<Class<*>, Int> { k: Class<*>, v: Int -> e.setAttribute(k.simpleName, "" + v) })
        return e
    }

    private fun lengthOf(expr: Expression): Int {
        return expr.toString().length()
    }

    private fun numberOfVariables(expr: Expression): Int {
        var sum = 0
        for (childNode in expr.getChildNodes()) {
            if (childNode is NameExpr) sum++
            else if (childNode is Expression && !childNode.getChildNodes().isEmpty()) {
                sum += numberOfVariables(childNode as Expression)
            }
        }
        return sum
    }

    private fun newElement(parent: Element, tag: String): Element {
        val e = xmlDocument.createElement(tag)
        parent.appendChild(e)
        return e
    }

    private fun active(n: NodeWithJmlTags<*>): Boolean {
        return equal(keys, n.getJmlTags())
    }


    fun visit(n: JmlRepresentsDeclaration, arg: Element) {
        if (active(n)) {
            val a = newElement(arg, "represents")
            a.setAttribute("name", n.getNameAsString())
            setModifierAsAttributes(n, a)
        }
    }

    fun visit(n: JmlMethodDeclaration, arg: Element) {
        var arg = arg
        if (active(n)) {
            arg = newJavaContext(arg, n.javaClass.getSimpleName(), n.getMethodDeclaration().getNameAsString())
            setModifierAsAttributes(n.getMethodDeclaration(), arg)
            super.visit(n.getMethodDeclaration(), arg)
        }
    }


    fun visit(n: JmlContract, arg: Element) {
        if (active(n)) {
            var name = "contract_" + n.getRange().get().begin.line
            if (n.getName().isPresent()) {
                name = n.getName().get().getIdentifier()
            }
            val e = newJavaContext(arg, n.javaClass.getSimpleName(), name)
            e.setAttribute("type", n.getType().toString())
            setModifierAsAttributes(n, e)
            e.setAttribute("behavior", "" + n.getBehavior())
            super.visit(n, e)
        }
    }

    fun visit(n: JmlExpressionStmt, arg: Element) {
        if (active(n)) {
            val e = newElement(arg, n.getKind().jmlSymbol())
            e.appendChild(getExpressionStat(n.getExpression()))
        }
    }

    fun visit(n: JmlUnreachableStmt, arg: Element) {
        if (active(n)) {
            val e = newElement(arg, "jml-unreachable")
        }
    }

    fun visit(n: JmlBeginStmt, arg: Element) {
        if (active(n)) {
            newElement(arg, "jml-begin")
        }
    }

    fun visit(n: JmlEndStmt, arg: Element) {
        if (active(n)) {
            newElement(arg, "jml-end")
        }
    }

    fun visit(n: JmlGhostStmt, arg: Element) {
        if (active(n)) {
            val e = newElement(arg, "jml-ghost")
            e.setAttribute("statements", "")
            super.visit(n, e)
        }
    }


    fun visit(n: JmlLabelStmt, arg: Element) {
        if (active(n)) {
            newElement(arg, "jml-label")
        }
    }

    fun visit(n: JmlSimpleExprClause, arg: Element) {
        val e = newElement(arg, n.getKind().jmlSymbol)
        e.appendChild(getExpressionStat(n.getExpression()))
    }

    fun visit(n: JmlSignalsClause, arg: Element) {
        newElement(arg, n.getKind().jmlSymbol)
    }

    fun visit(n: JmlSignalsOnlyClause, arg: Element) {
        val e = newElement(arg, n.getKind().jmlSymbol)
        e.setAttribute("numOfTypes", "" + n.getTypes().size())
    }

    fun visit(n: JmlOldClause, arg: Element) {
        val e = newElement(arg, n.getKind().jmlSymbol)
        e.setAttribute("numOfDecls", "" + n.getDeclarations().getVariables().size())
    }

    fun visit(n: JmlAccessibleClause?, arg: Element?) {
        super.visit(n, arg)
    }

    fun visit(n: JmlMultiExprClause, arg: Element) {
        val e = newElement(arg, n.getKind().jmlSymbol)
        for (expression in n.getExpressions()) {
            e.appendChild(getExpressionStat(expression))
        }
    }

    fun visit(n: JmlCallableClause, arg: Element) {
        val e = newElement(arg, n.getKind().jmlSymbol)
    }

    fun visit(n: JmlCapturesClause, arg: Element) {
        val e = newElement(arg, n.getKind().jmlSymbol)
    }

    fun visit(n: JmlForallClause, arg: Element) {
        val e = newElement(arg, n.getKind().jmlSymbol)
        e.setAttribute("numVars", "" + n.getBoundedVariables().size())
    }

    fun visit(n: JmlRefiningStmt, arg: Element) {
        if (active(n)) {
            val e = newElement(arg, "jml-refining")
        }
    }

    fun visit(n: JmlClauseIf?, arg: Element?) {
        super.visit(n, arg)
    }

    fun visit(n: JmlFieldDeclaration, arg: Element?) {
        update(n, this::update)
    }

    interface Update<R> {
        fun fn(parent: Element?, node: R)
    }

    fun <R : NodeWithJmlTags<*>?> update(n: R, update: Update<R>?) {
    }

    private fun update(parent: Element, n: JmlFieldDeclaration) {
        /*if (n.getDecl().hasModifier(Modifier.DefaultKeyword.JML_GHOST)) {
            getClassStat(stat, n).addNumOfGhostFields(1);
        } else if (n.getDecl().hasModifier(Modifier.DefaultKeyword.JML_MODEL)) {
            getClassStat(stat, n).addNumOfModelFields(1);
        }
         */
    }


    private fun count(e: Expression): Map<Class<*>, Int> {
        val occCounter: MutableMap<Class<*>, Int> = HashMap()
        val q: ArrayDeque<Node> = ArrayDeque<Node>()
        q.add(e)

        while (!q.isEmpty()) {
            val n: Node = q.pop()
            occCounter.compute(
                n.javaClass,
                BiFunction<Class<*>, Int, Int> { k: Class<*>?, i: Int? -> if (i == null) 1 else i + 1 })
            for (childNode in n.getChildNodes()) {
                if (childNode is Expression) {
                    q.add(childNode)
                }
            }
        }
        return occCounter
    }

    companion object {
        private fun newlines(text: String): Int {
            val chars = text.toCharArray()
            var n = 0
            for (aChar in chars) {
                if (aChar == '\n') {
                    n++
                }
            }
            return n
        }


        private fun equal(keySet: List<String>, jmlTags: NodeList<SimpleName>): Boolean {
            if (keySet.size != jmlTags.size()) {
                return false
            }

            for (i in keySet.indices) {
                if (keySet[i] != jmlTags.get(i).getIdentifier()) {
                    return false
                }
            }
            return true
        }
    }
}

internal class ExpressionComplexity : GenericVisitorAdapter<Int?, ExpressionCosts?>() {
    fun visit(n: ArrayAccessExpr?, arg: ExpressionCosts?): Int {
        return super.visit(n, arg)
    }

    fun visit(n: ArrayCreationExpr?, arg: ExpressionCosts?): Int {
        return super.visit(n, arg)
    }

    fun visit(n: ArrayInitializerExpr?, arg: ExpressionCosts?): Int {
        return super.visit(n, arg)
    }

    fun visit(n: AssignExpr, arg: ExpressionCosts): Int {
        return arg.getAssign() + n.getTarget().accept(this, arg) + n.getValue().accept(this, arg)
    }

    fun visit(n: BinaryExpr, arg: ExpressionCosts): Int {
        //TODO distinguish by operator
        return arg.getMinus() + n.getLeft().accept(this, arg) + n.getRight().accept(this, arg)
    }

    fun visit(n: UnaryExpr?, arg: ExpressionCosts?): Int {
        return super.visit(n, arg)
    }

    fun visit(n: LambdaExpr?, arg: ExpressionCosts?): Int {
        return super.visit(n, arg)
    }

    fun visit(n: CastExpr, arg: ExpressionCosts): Int {
        return arg.getCast() + n.getExpression().accept(this, arg)
    }

    fun visit(n: CharLiteralExpr?, arg: ExpressionCosts): Int {
        return arg.getCharLiteral()
    }

    fun visit(n: ConditionalExpr, arg: ExpressionCosts): Int {
        return arg.getConditional() + n.getCondition().accept(this, arg) + n.getThenExpr()
            .accept(this, arg) + n.getElseExpr().accept(
            this, arg
        )
    }

    fun visit(n: EnclosedExpr, arg: ExpressionCosts?): Int {
        return n.getInner().accept(this, arg)
    }

    fun visit(n: IntegerLiteralExpr?, arg: ExpressionCosts): Int {
        return arg.getIntegerLiteral()
    }

    fun visit(n: LongLiteralExpr?, arg: ExpressionCosts): Int {
        return arg.getLongLiteral()
    }

    fun visit(n: MethodCallExpr, arg: ExpressionCosts): Int {
        return arg.getMethodCall() + sum(n.getArguments(), arg)
    }

    fun visit(n: NameExpr?, arg: ExpressionCosts): Int {
        return arg.getName()
    }

    fun visit(n: NullLiteralExpr?, arg: ExpressionCosts): Int {
        return arg.getNullLiteral()
    }

    fun visit(n: JmlQuantifiedExpr, arg: ExpressionCosts): Int {
        return arg.getQuantor() + n.getVariables().size() * arg.getBinderCostsPerVariable() + sum(
            n.getExpressions(),
            arg
        )
    }

    private fun sum(n: NodeList<Expression>, arg: ExpressionCosts): Int {
        return n.stream().mapToInt { it -> Objects.requireNonNull(it.accept(this, arg), it.javaClass.getSimpleName()) }
            .sum()
    }

    fun visit(n: JmlTypeExpr?, arg: ExpressionCosts?): Int {
        return 1
    }

    fun visit(n: SuperExpr?, arg: ExpressionCosts?): Int {
        return 0
    }

    fun visit(n: SwitchExpr, arg: ExpressionCosts): Int {
        return n.getSelector().accept(this, arg) + n.getEntries().stream()
            .mapToInt { it -> sum(it.getLabels(), arg) + 1 }
            .sum()
    }

    fun visit(n: PatternExpr?, arg: ExpressionCosts?): Int {
        return 0
    }

    fun visit(n: BooleanLiteralExpr?, arg: ExpressionCosts?): Int {
        return 0
    }

    fun visit(n: InstanceOfExpr, arg: ExpressionCosts): Int {
        return arg.get_instanceof() + n.getExpression().accept(this, arg)
    }

    fun visit(n: JmlLabelExpr?, arg: ExpressionCosts?): Int {
        return super.visit(n, arg)
    }

    fun visit(n: JmlLetExpr, arg: ExpressionCosts): Int {
        return arg.getLet() + arg.getBinderCostsPerVariable() * n.getVariables().getVariables().size()
    }

    fun visit(n: JmlMultiCompareExpr, arg: ExpressionCosts): Int {
        return arg.getCompare() * n.getOperators().size()
    }
}