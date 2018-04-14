package main.epl

interface Visitor {
    fun visit(exp: Literal) : Unit
    fun visit(exp: Add) : Unit
    fun visit(exp: Sub) : Unit
    fun visit(exp: Mult) : Unit
}