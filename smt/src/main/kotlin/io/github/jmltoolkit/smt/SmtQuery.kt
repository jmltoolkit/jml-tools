package io.github.jmltoolkit.smt

import com.github.jmlparser.smt.model.SExpr
import java.io.StringWriter
import java.util.function.Consumer

/**
 * @author Alexander Weigl
 * @version 1 (07.08.22)
 */
class SmtQuery : AppendableTo {
    private val commands: MutableList<SExpr?> = ArrayList<SExpr>(1024)

    private val variableStack: MutableList<MutableMap<String, SmtType?>> = ArrayList<MutableMap<String, SmtType?>>()

    init {
        variableStack.add(HashMap<String, SmtType>())
    }

    fun declareConst(name: String, type: SmtType?): Boolean {
        if (!declared(name)) {
            val a: SExpr? = term.list(
                null, SmtType.COMMAND,
                "declare-const", name, term.type(type)
            )
            commands.add(a)
            currentFrame[name] = type
            return true
        }
        return false
    }

    fun push() {
        variableStack.add(HashMap<String, SmtType>())
        commands.add(term.command("push"))
    }

    fun pop() {
        variableStack.remove(currentFrame)
        commands.add(term.command("pop"))
    }

    private fun declared(name: String): Boolean {
        return currentFrame.containsKey(name)
    }

    private val currentFrame: MutableMap<String, Any?>
        get() = variableStack[variableStack.size - 1]

    fun appendTo(pw: PrintWriter) {
        for (command in commands) {
            command.appendTo(pw)
            pw.println()
        }
    }


    fun defineThis() {
        declareConst("this", SmtType.JAVA_OBJECT)
        addAssert(term.nonNull(term.`var`(SmtType.JAVA_OBJECT, null, "this")))
    }

    fun addAssert(nonNull: SExpr?) {
        commands.add(term.command("assert", nonNull))
    }

    fun checkSat() {
        commands.add(term.command("check-sat"))
    }


    override fun toString(): String {
        val sw = StringWriter()
        val pw: PrintWriter = PrintWriter(sw)
        commands.forEach(Consumer<SExpr> { a: SExpr ->
            a.appendTo(pw)
            pw.println()
        })
        return sw.toString()
    }

    companion object {
        private val term: SmtTermFactory = SmtTermFactory.INSTANCE
    }
}
