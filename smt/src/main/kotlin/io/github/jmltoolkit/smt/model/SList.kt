package io.github.jmltoolkit.smt.model

import com.github.javaparser.resolution.types.ResolvedType
import java.util.*

/**
 * @author Alexander Weigl
 * @version 1 (07.08.22)
 */
class SList(stype: SmtType?, javaType: ResolvedType?, vararg args: SExpr) : SExpr() {
    val value: Array<SExpr>

    init {
        this.smtType = stype
        this.javaType = javaType
        this.value = args
        for (arg in args) {
            Objects.requireNonNull(arg)
        }
    }

    fun appendTo(writer: PrintWriter) {
        writer.write('('.code)
        for (i in value.indices) {
            value[i].appendTo(writer)
            if (i < value.size - 1) writer.write(' '.code)
        }
        writer.write(')'.code)
    }

    fun get(i: Int): SExpr {
        return value[i]
    }
}
