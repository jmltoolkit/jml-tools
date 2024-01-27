package io.github.jmltoolkit.smt.model

import com.github.javaparser.resolution.types.ResolvedType

/**
 * @author Alexander Weigl
 * @version 1 (07.08.22)
 */
class SAtom(stype: SmtType?, javaType: ResolvedType?, value: String) : SExpr() {
    val value: String

    init {
        this.smtType = stype
        this.javaType = javaType
        this.value = value
    }

    fun appendTo(writer: PrintWriter) {
        writer.write(value)
    }
}
