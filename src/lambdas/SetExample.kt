package lambdas

fun main() {

    val letters = setOf(1, 2, 3, 4, 5)
    letters.forEach { e -> println(e) }
    println(letters.count())
    println(letters.max())
    println(letters.min())
    println(letters.sum())
    println(letters.average())

    val cars = setOf(Car("Mazda", 6300), Car("Toyota", 12400),
            Car("Skoda", 5670), Car("Mercedes", 18600))

    val res = cars.sortedBy { car -> car.name }
    res.forEach { e -> println(e) }

    println("##########################################")

    val res2 = cars.sortedByDescending { car -> car.name }
    res2.forEach { e -> println(e) }

}

data class Car(var name: String, var price: Int)
