import main.epl.*

fun main(args: Array<String>) {

    println("Hello World")
    val eval = Eval()

    //EXAMPLE SUM
    var lit1 = Literal(2)
    var lit2 = Literal(3)
    val add = Add(lit1, lit2)
    add.accept(eval)
    print(add.print() + " = ")
    println(eval.result())


    // #### EXAMPLE SUB ####
    var literal400 = Literal(400)
    var literal300 = Literal(300)
    val sub = Sub(literal400, literal300)
    sub.accept(eval)
    print(sub.print() + " = ")
    println(eval.result())


    // #### EXAMPLE MULT ####
    var literal500 = Literal(500)
    var literal600 = Literal(600)
    val mult = Mult(literal500, literal600)
    mult.accept(eval)
    print(mult.print() + " = ")
    println(eval.result())

}