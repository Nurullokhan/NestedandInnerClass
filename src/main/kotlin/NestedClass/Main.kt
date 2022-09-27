package NestedClass

fun main(args: Array<String>) {

    val nested = Outer.Nested() //This is static class
    println(nested.callMe())

}