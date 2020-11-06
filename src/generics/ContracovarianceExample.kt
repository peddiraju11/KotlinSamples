package generics

fun main(args: Array<String>) {
    var a: Container<Dog> = Container<Animal>()  //compiles without error
    //var b: Container<Animal> = Container<Dog>()  //gives compilation error
}
open class Animal
class Dog : Animal()
class Container<in T>