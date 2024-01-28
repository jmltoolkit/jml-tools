package jml2java

import com.github.javaparser.ast.jml.expr.JmlQuantifiedExpr
import com.google.common.truth.Truth
import io.github.jmltoolkit.jml2java.Jml2JavaTranslator

/**
 * @author Alexander Weigl
 * @version 1 (11.10.22)
 */
internal class Jml2JavaTranslatorTest {
    @org.junit.jupiter.api.Test
    fun test() {
        val n1: JmlQuantifiedExpr =
            com.github.javaparser.StaticJavaParser.parseJmlExpression<JmlQuantifiedExpr>("(\\forall int x; 0 <= x < a.length; x%2==0)")
        val bound: Unit = Jml2JavaTranslator.findLowerBound(n1, "x")
        Truth.assertThat(bound.toString()).isEqualTo("0")
    }

    @org.junit.jupiter.api.Test
    fun test2() {
        val n1: JmlQuantifiedExpr =
            com.github.javaparser.StaticJavaParser.parseJmlExpression<JmlQuantifiedExpr>("(\\forall int x; 5 < x < a.length; x%2==0)")
        val bound: Unit = Jml2JavaTranslator.findLowerBound(n1, "x")
        Truth.assertThat(bound.toString()).isEqualTo("5 + 1")
    }

    @org.junit.jupiter.api.Test
    fun test3() {
        val n1: JmlQuantifiedExpr =
            com.github.javaparser.StaticJavaParser.parseJmlExpression<JmlQuantifiedExpr>("(\\forall int x; 2+1 < x < a.length; x%2==0)")
        val bound: Unit = Jml2JavaTranslator.findLowerBound(n1, "x")
        Truth.assertThat(bound.toString()).isEqualTo("2 + 1 + 1")
    }

    @org.junit.jupiter.api.Test
    fun test6() {
        val n1: JmlQuantifiedExpr =
            com.github.javaparser.StaticJavaParser.parseJmlExpression<JmlQuantifiedExpr>("(\\forall int y; 2+1 < y < a.length; y%2==0)")
        val bound: Unit = Jml2JavaTranslator.findLowerBound(n1, "y")
        Truth.assertThat(bound.toString()).isEqualTo("2 + 1 + 1")
    }

    @org.junit.jupiter.api.Test
    fun test4() {
        val n1: JmlQuantifiedExpr =
            com.github.javaparser.StaticJavaParser.parseJmlExpression<JmlQuantifiedExpr>("(\\forall int x; 0 < x && x < a.length; x%2==0)")
        val bound: Unit = Jml2JavaTranslator.findLowerBound(n1, "x")
        Truth.assertThat(bound.toString()).isEqualTo("0 + 1")
    }

    @org.junit.jupiter.api.Test
    fun test5() {
        val n1: JmlQuantifiedExpr =
            com.github.javaparser.StaticJavaParser.parseJmlExpression<JmlQuantifiedExpr>("(\\forall int x; 0 <= x && x < a.length; x%2==0)")
        val bound: Unit = Jml2JavaTranslator.findLowerBound(n1, "x")
        Truth.assertThat(bound.toString()).isEqualTo("0")
    }
}