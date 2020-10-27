package expressions

fun main() {

    try {
        var int = 10 / 0
        println(int)
    } catch (e: ArithmeticException) {
        println(e)
    } finally {
        println("finally block always executes")
    }
}