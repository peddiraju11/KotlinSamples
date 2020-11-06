package generics

fun main() {

    val inClassObject: InClass<Number> = InClass()
    println(inClassObject.toString())
}

class InClass<in T> {
    fun test(value: T): String {
        return value.toString()
    }
}