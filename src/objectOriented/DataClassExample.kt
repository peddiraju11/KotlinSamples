package objectOriented

fun main(args: Array<String>) {

    val bike = Bike1("red", "Honda", 1996)
    println(bike)
    val bike2 = Bike1("red", "Honda", 1998)
    println(bike == bike2)
    val bike3 = bike.copy()
    println(bike3)
    val bike4 = bike.copy(year = 2000, color = "yellow")
    println(bike4)
}

data class Bike1(val color: String, val model: String, val year: Int) {

}

