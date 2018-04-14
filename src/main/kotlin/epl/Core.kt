package main.epl

interface Expression {
    fun print(): String
    fun accept(v: Eval): Unit
}

class Literal(val value: Int) : Expression {

    override fun print(): String {
        return value.toString()
    }

    override fun accept(v: Eval){ v.visit(this) }
}