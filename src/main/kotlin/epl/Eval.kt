package main.epl

class Eval : Visitor {
    var res : Int = 0

    override fun visit(exp: Literal) { res = exp.value }

    // ### ADD ###
    override fun visit(exp: Add) {
        exp.lhs.accept(this)
        val vl = res
        exp.rhs.accept(this)
        val vr = res
        res = vl + vr
    }

    // ### SUB ###
    override fun visit(exp: Sub) {
        exp.lhs.accept(this)
        val vl = res
        exp.rhs.accept(this)
        val vr = res
        res = vl - vr
    }

    // ### MULT ###
    override fun visit(exp: Mult) {
        exp.lhs.accept(this)
        val vl = res
        exp.rhs.accept(this)
        val vr = res
        res = vl * vr
    }


    fun result() : Int = res

}