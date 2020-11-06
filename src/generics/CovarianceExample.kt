package generics

fun main(args: Array<String>) {

    // val x: MyClass<Any> = MyClass<Int>()        // Error: Type mismatch
    val y: MyClass<out Any> = MyClass<String>() // Works since String is a subtype of Any
    // val z: MyClass<out String> = MyClass<Any>() // Error since Any is a supertype of String
    //val y1: MyClass<Any> = MyClass<String>() // Compiles without error

}
class MyClass<T>

//class MyClass<out T>