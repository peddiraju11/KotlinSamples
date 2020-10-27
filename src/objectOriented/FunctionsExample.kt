package objectOriented

fun main(args: Array<String>) {

    //println(labelMultiply(label = "result:", operand2 = 3, operand1 = 4))

    val bike1 = Bike("blue", "Honda", 2007)
    val bike2 = Bike("red", "Hero", 2007)
    val bike3 = Bike("grey", "Hero", 2009)

    //printColors(bike1, bike2, bike3)

    val manyBikes = arrayOf(bike1, bike2, bike3)
    printColors(*manyBikes)

}

fun printColors(vararg bikes: Bike) {
    for (car in bikes) {
        println(car.color)
    }
}

fun labelMultiply(operand1: Int, operand2: Int,
                  label: String = "Print:") =
    "$label ${operand1 * operand2}"

data class Bike(val color: String, val model: String, val year: Int) {

}



