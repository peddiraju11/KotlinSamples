package objectOriented


fun main(args: Array<String>) {

    val laserPrinter = LaserPrinter("Canon-1", 15)
    laserPrinter.printModel()

    SomethingElse("test")
}


abstract class Printer(val modelName: String) {

    open fun printModel() = println("Printer Model $modelName")
    abstract fun bestSellingPrice(): Double

}

open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName) {

    final override fun printModel() = println("Laser printer Model $modelName")
    override fun bestSellingPrice(): Double = 178.12

}

open class Something {

    private val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("Parent's constructor")
    }
}

class SomethingElse : Something {

    constructor(someOtherParameter: String) : super(someOtherParameter) {
        println("Child's constructor")
    }

}

//open data class DataClass(val number: Int) {

//}


