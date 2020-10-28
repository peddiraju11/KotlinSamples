package sealedClasess

fun main() {


    //var d = Car()

    val obj = Car.Honda
    obj.display()

    val obj1 = Car.BMW
    obj1.display()
}

sealed class Car {

    object BMW : Car() {
        fun display() {
            println("Subclass BMW of sealed class CAR")
        }
    }

    object Honda : Car() {
        fun display() {
            println("Subclass Honda of sealed class CAR")
        }
    }
}

