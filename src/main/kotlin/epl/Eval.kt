package main.epl

class Eval : Visitor {
    var res : Int = 0
    var hei : Int = 0

    override fun visit(exp: Literal) { res = exp.value }

    // ### ADD ###
    override fun visit(exp: Add) {
        exp.lhs.accept(this)
        val vl = res
        exp.rhs.accept(this)
        val vr = res
        res = vl + vr
        hei+=1
    }

    // ### SUB ###
    override fun visit(exp: Sub) {
        exp.lhs.accept(this)
        val vl = res
        exp.rhs.accept(this)
        val vr = res
        res = vl - vr
        hei+=1

    }

    // ### MULT ###
    override fun visit(exp: Mult) {
        exp.lhs.accept(this)
        val vl = res
        exp.rhs.accept(this)
        val vr = res
        res = vl * vr
        hei+=1

    }


    fun result() : Int = res
    fun height() : Int {
        if(hei<2) {
            return hei+1;
        } else {
            return hei;
        }
    }

}