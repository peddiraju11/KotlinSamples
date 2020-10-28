package sealedClasess


fun main() {

    val obj = Fruit.Apple()
    val obj1 = Fruit.Mango()
    val obj2 = Pomegranate()

    display(obj)
    display(obj1)
    display(obj2)
}

sealed class Fruit(val x: String) {
    class Apple : Fruit("Apple")
    class Mango : Fruit("Mango")
}

class Pomegranate : Fruit("Pomegranate")

fun display(fruit: Fruit) {
    when (fruit) {
        is Fruit.Apple -> println("${fruit.x} is good for iron")
        is Fruit.Mango -> println("${fruit.x} is delicious")
        is Pomegranate -> println("${fruit.x} is good for vitamin d")
    }
}




