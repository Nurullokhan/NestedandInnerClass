package InnerClass

fun main(args: Array<String>) {

    val outer = Outer()
    println(outer.a)

    val inner = Outer().Inner()
    println(inner.callMe()) //This is inner function

}