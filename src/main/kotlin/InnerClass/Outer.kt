package InnerClass

class Outer {

    val a: String = "Outside Inner class"

    inner class Inner {
        fun callMe(): String {
            return a
        }
    }

}