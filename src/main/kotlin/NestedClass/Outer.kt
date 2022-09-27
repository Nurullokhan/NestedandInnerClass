package NestedClass

class Outer {

    val a: String = "Outside Nested class"

    class Nested {
        val b: String = "Inside Nested class"
        fun callMe(): String {
            return "Function call from inside Nested class"
        }
    }

}