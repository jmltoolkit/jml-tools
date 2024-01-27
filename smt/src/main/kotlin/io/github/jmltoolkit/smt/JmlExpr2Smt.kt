package io.github.jmltoolkit.smt

import com.github.javaparser.ast.ArrayCreationLevel
import java.math.BigInteger

/**
 * @author Alexander Weigl
 * @version 1 (01.07.22)
 */
class JmlExpr2Smt(private val smtLog: SmtQuery, val translator: ArithmeticTranslator) :
    GenericVisitorAdapter<SExpr?, Any?>() {
    private val boundedVars = VariableStack()

    fun visit(n: ArrayAccessExpr, arg: Any?): SExpr? {
        val array: SExpr = n.getName().accept(this, arg)
        val index: SExpr = n.getIndex().accept(this, arg)
        val rtype: ResolvedType = n.calculateResolvedType()
        val stype: SmtType? = translator.getType(rtype)
        return termFactory.select(stype, rtype, array, index)
    }

    fun visit(n: ArrayCreationExpr, arg: Any?): SExpr? {
        if (n.getInitializer().isPresent()) return n.getInitializer().get().accept(this, arg)

        val name = "anon_array_" + (++anonCnt)
        val rType: ResolvedType = n.calculateResolvedType()
        val type: SmtType? = translator.getType(rType)
        smtLog.declareConst(name, type)
        val `var`: SExpr? = termFactory.`var`(type, rType, name)
        val zero: SExpr = translator.makeInt(BigInteger.ZERO)
        val arrayLength: SExpr? = translator.arrayLength(`var`)

        val boundedVars: MutableList<SExpr?> = ArrayList<SExpr?>()
        var accessLevel: SExpr? = `var`
        for (i in 0 until n.getLevels().size()) {
            val level: ArrayCreationLevel = n.getLevels().get(i)
            if (i == 0) {
                if (level.getDimension().isPresent()) {
                    val length: SExpr = level.getDimension().get().accept(this, arg)
                    smtLog.addAssert(termFactory.equality(arrayLength, length))
                } else {
                    smtLog.addAssert(termFactory.lessOrEquals(zero, arrayLength, true))
                }
            } else {
                if (level.getDimension().isPresent()) {
                    val length: SExpr = level.getDimension().get().accept(this, arg)
                    smtLog.addAssert(
                        termFactory.forall(
                            boundedVars,
                            termFactory.equality(translator.arrayLength(accessLevel), length)
                        )
                    )
                } else {
                    smtLog.addAssert(
                        termFactory.forall(
                            boundedVars,
                            termFactory.lessOrEquals(zero, translator.arrayLength(accessLevel), true)
                        )
                    )
                }
            }
            boundedVars.add(termFactory.binder(SmtType.INT, "idx$i"))
            accessLevel = termFactory.select(
                null, null, accessLevel,
                termFactory.`var`(SmtType.INT, null, "idx$i")
            )
        }
        return `var`
    }

    fun visit(n: ArrayInitializerExpr, arg: Any?): SExpr? {
        val name = "anon_array_" + (++anonCnt)
        val seq: List<SExpr> = n.getValues().stream().map { it -> it.accept(this, arg) }
            .toList()
        val myType: SmtType.Array = Array(SmtType.INT, seq[0].getSmtType())
        smtLog.declareConst(name, myType)
        val `var`: SExpr? = termFactory.`var`(myType, null, name)
        for (i in seq.indices) {
            smtLog.addAssert( //(store ary idx sub)
                termFactory.store(`var`, translator.makeInt(i.toLong()), seq[i])
            )
        }

        val zero: SExpr = translator.makeInt(0)
        val length: SExpr? = translator.arrayLength(`var`)
        smtLog.addAssert(termFactory.equality(length, translator.makeInt(n.getValues().size())))
        return `var`
    }

    fun visit(n: AssignExpr?, arg: Any?): SExpr {
        return super.visit(n, arg)
    }

    fun visit(n: BinaryExpr, arg: Any?): SExpr? {
        val left: SExpr = n.getLeft().accept(this, arg)
        val right: SExpr = n.getRight().accept(this, arg)
        return translator.binary(n.getOperator(), left, right)
    }

    fun visit(n: ThisExpr?, arg: Any?): SExpr? {
        return termFactory.makeThis()
    }

    fun visit(n: SuperExpr?, arg: Any?): SExpr? {
        return termFactory.makeSuper()
    }

    fun visit(n: NameExpr, arg: Any?): SExpr? {
        val resolved: ResolvedValueDeclaration = n.resolve()
        val rType: ResolvedType = resolved.getType()
        val type: SmtType? = translator.getType(rType)
        if (!isBound(n.getNameAsString())) {
            smtLog.declareConst(n.getNameAsString(), type)
        }
        return termFactory.`var`(type, rType, n.getNameAsString())
    }

    private fun isBound(nameAsString: String): Boolean {
        return boundedVars.contains(nameAsString)
    }


    fun visit(n: NullLiteralExpr?, arg: Any?): SExpr? {
        return termFactory.makeNull()
    }

    fun visit(n: BooleanLiteralExpr, arg: Any?): SExpr? {
        return translator.makeBoolean(n.getValue())
    }

    fun visit(n: CastExpr?, arg: Any?): SExpr {
        return super.visit(n, arg)
    }

    fun visit(n: CharLiteralExpr, arg: Any?): SExpr? {
        return translator.makeChar(n)
    }

    fun visit(n: ClassExpr?, arg: Any?): SExpr {
        return super.visit(n, arg)
    }

    fun visit(n: ConditionalExpr, arg: Any?): SExpr? {
        return termFactory.ite(
            n.getCondition().accept(this, arg),
            n.getThenExpr().accept(this, arg),
            n.getElseExpr().accept(this, arg)
        )
    }

    fun visit(n: DoubleLiteralExpr?, arg: Any?): SExpr {
        return super.visit(n, arg)
    }

    fun visit(n: FieldAccessExpr, arg: Any?): SExpr? {
        val scopeType: ResolvedType = n.getScope().calculateResolvedType()
        val javaType: ResolvedType = n.calculateResolvedType()
        val stype: SmtType? = translator.getType(javaType)
        val obj: SExpr = n.getScope().accept(this, arg)

        if (n.getNameAsString().equals("length") && scopeType.isArray()) {
            return translator.arrayLength(obj)
        }

        return termFactory.fieldAccess(javaType, stype, n.getNameAsString(), obj)
    }

    fun visit(n: InstanceOfExpr, arg: Any?): SExpr? {
        val leftType: ResolvedType = n.getExpression().calculateResolvedType()
        val rightType: ResolvedType = n.getType().resolve()

        //TODO weigl return leftType.asReferenceType()
        //Pattern matching
        return termFactory.makeTrue()
    }

    fun visit(n: IntegerLiteralExpr, arg: Any?): SExpr? {
        return translator.makeInt(n)
    }

    fun visit(n: LongLiteralExpr, arg: Any?): SExpr? {
        return translator.makeLong(n)
    }

    fun visit(n: MethodCallExpr, arg: Any?): SExpr? {
        val method: Unit = n.resolve()
        val variable: SExpr? = translator.makeVar(method.getReturnType())
        val ast: Unit = method.toAst()
        if (ast.isPresent() && ast.get() is NodeWithContracts<*>) {
            val contract: Unit =
                JMLUtils.createJointContract(hasContracts.getContracts().get())
            //TODO weigl add assertion for the return variable
            //TODO weigl add assertion for each parameter
            // smtLog.addAssert();
        }
        return variable
    }

    var anonCnt: Int = 0

    fun visit(n: ObjectCreationExpr?, arg: Any?): SExpr? {
        val name = "anon" + (++anonCnt)
        smtLog.declareConst(name, SmtType.JAVA_OBJECT)
        val `var`: SExpr? = termFactory.`var`(SmtType.JAVA_OBJECT, null, name)
        smtLog.addAssert(termFactory.nonNull(`var`))
        return `var`
    }

    fun visit(n: StringLiteralExpr, arg: Any?): SExpr {
        return SAtom(SmtType.STRING, null, ("\"" + n.asString()).toString() + "\"")
    }

    fun visit(n: UnaryExpr, arg: Any?): SExpr? {
        return translator.unary(n.getOperator(), n.getExpression().accept(this, arg))
    }

    fun visit(n: LambdaExpr?, arg: Any?): SExpr {
        return super.visit(n, arg)
    }

    fun visit(n: TypeExpr?, arg: Any?): SExpr {
        return super.visit(n, arg)
    }

    fun visit(n: SwitchExpr?, arg: Any?): SExpr {
        return super.visit(n, arg)
    }

    fun visit(n: TextBlockLiteralExpr, arg: Any?): SExpr {
        return SAtom(SmtType.STRING, null, ("\"" + n.asString()).toString() + "\"")
    }

    fun visit(n: PatternExpr?, arg: Any?): SExpr {
        return super.visit(n, arg)
    }

    fun visit(n: JmlQuantifiedExpr, arg: Any?): SExpr? {
        boundedVars.bind(n.getVariables()).use { ignored ->
            when (n.getBinder() as JmlDefaultBinder) {
                FORALL -> {
                    val e: Expression =
                        if (n.getExpressions().size() === 2
                        ) BinaryExpr(
                            n.getExpressions().get(0),
                            n.getExpressions().get(1),
                            BinaryExpr.Operator.IMPLICATION
                        )
                        else n.getExpressions().get(0)
                    e.setParentNode(n)
                    return termFactory.forall(
                        translator.getVariable(n.getVariables()),
                        e.accept(this, arg)
                    )
                }

                EXISTS -> {
                    val e1: Expression =
                        if (n.getExpressions().size() === 2
                        ) BinaryExpr(n.getExpressions().get(0), n.getExpressions().get(1), BinaryExpr.Operator.AND)
                        else n.getExpressions().get(0)
                    e1.setParentNode(n)
                    return termFactory.forall(
                        translator.getVariable(n.getVariables()),
                        e1.accept(this, arg)
                    )
                }

                BSUM, MIN, MAX, PRODUCT -> return translator.makeIntVar()
                else -> return null
            }
        }
    }

    fun visit(n: JmlLabelExpr, arg: Any?): SExpr {
        return n.getExpression().accept(this, arg)
    }

    fun visit(n: JmlLetExpr, arg: Any?): SExpr? {
        boundedVars.bind(n.getVariables()).use { ignored ->
            val vars: MutableList<SExpr?> = ArrayList<SExpr?>()
            for (variable in n.getVariables().getVariables()) {
                vars.add(
                    termFactory.list(
                        null, null, variable.getNameAsString(),
                        variable.getInitializer().get().accept(this, arg)
                    )
                )
            }
            val body: SExpr = n.getBody().accept(this, arg)
            return termFactory.let(vars, body)
        }
    }

    fun visit(n: JmlMultiCompareExpr?, arg: Any?): SExpr {
        return JMLUtils.unroll(n).accept(this, arg)
    }

    fun visit(n: JmlBinaryInfixExpr, arg: Any?): SExpr? {
        val left: SExpr = n.getLeft().accept(this, arg)
        val right: SExpr = n.getRight().accept(this, arg)
        return termFactory.list(null, null, n.getOperator().getIdentifier(), left, right)
    }

    fun visit(n: JmlTypeExpr?, arg: Any?): SExpr {
        return super.visit(n, arg)
    }

    companion object {
        private val termFactory: SmtTermFactory = SmtTermFactory.INSTANCE
    }
}


internal class VariableStack {
    private val seq = ArrayList<String>(16)

    fun bind(variables: VariableDeclarationExpr): TruncateStack {
        val curPosition = seq.size
        for (variable in variables.getVariables()) seq.add(variable.getNameAsString())
        return TruncateStack { truncate(curPosition) }
    }

    fun bind(variables: NodeList<Parameter?>): TruncateStack {
        val curPosition = seq.size
        for (variable in variables) seq.add(variable.getNameAsString())
        return TruncateStack { truncate(curPosition) }
    }

    private fun truncate(curPosition: Int) {
        while (seq.size > curPosition) {
            seq.removeAt(seq.size - 1)
        }
    }

    fun contains(nameAsString: String): Boolean {
        return seq.contains(nameAsString)
    }
}

internal interface TruncateStack : AutoCloseable {
    override fun close()
}
