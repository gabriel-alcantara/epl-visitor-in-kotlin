import main.epl.*

fun main(args: Array<String>) {

    //println("Hello World")

    val eval1 = Eval()
    val eval2 = Eval()
    val eval3 = Eval()
    val eval4 = Eval()


    // #### EXAMPLE SUM ####
    println("#### EXAMPLE ADD ####")
    var lit1 = Literal(2)
    var lit2 = Literal(3)
    val add = Add(lit1, lit2)
    add.accept(eval1)
    print(add.print() + " = ")
    println(eval1.result())
    println("Height = " + eval1.height())


    // #### EXAMPLE SUB ####
    println("#### EXAMPLE SUB ####")
    var literal400 = Literal(400)
    var literal300 = Literal(300)
    val sub = Sub(literal400, literal300)
    sub.accept(eval2)
    print(sub.print() + " = ")
    println(eval2.result())
    println("Height = " + eval2.height())

    // #### EXAMPLE MULT ####
    println("#### EXAMPLE MULT ####")
    var literal500 = Literal(500)
    var literal600 = Literal(600)
    val mult = Mult(literal500, literal600)
    mult.accept(eval3)
    print(mult.print() + " = ")
    println(eval3.result())
    println("Height = " + eval3.height())

    // #### EXAMPLE SUM ####
    println("#### EXAMPLE ADD COMPOST ####")
    var lit3 = Literal(1)
    var lit4 = Literal(2)
    var lit5 = Literal(3)
    val add2 = Add(lit3, lit4)
    val add3 = Add(add2, lit5)
    add2.accept(eval4)
    add3.accept(eval4)
    print(add3.print() + " = ")
    println(eval4.result())
    println("Height = " + eval4.height())

}