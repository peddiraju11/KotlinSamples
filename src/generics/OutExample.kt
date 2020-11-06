package generics

fun main() {

    val out = OutClass("Hello There!!")
    val ref: OutClass<Any> = out
    println(ref.get())

}

class OutClass<out T>(private val value: T) {
    fun get(): T {
        return value
    }
}