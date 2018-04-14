package main.epl

class Add(val lhs: Expression, val rhs: Expression) : Expression{
    override fun print(): String {
        return  "(" + lhs.print() + " + " + rhs.print() + ")"
    }

    override fun accept(v: Eval) {
        v.visit(this)
    }


}