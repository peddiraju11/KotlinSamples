package lambdas

fun main(args: Array<String>) {

    println(countTo100())

    val members = listOf(Family("Raju", "Father", 60),
            Family("Ravi", "brother", 58),
            Family("Radha", "Wife", 55))


    findByLastName(members, "RadhaRam")
    findByLastName(members, "Raju")

    "Sample Data".apply {
        "Another Sample".apply {
            println(toLowerCase())
            println(this.toUpperCase())
        }
    }
}

fun findByLastName(family: List<Family>, name: String) {
    family.forEach {
        if (it.name == name) {
            println("Yes, there's a member with the given name $name")
            return
        }
    }
    println("Nope, there's no member with the given name $name")
}

fun countTo100() =
        StringBuilder().apply() {
            for (i in 1..99) {
                append(i)
                append(", ")
            }
            append(100)
        }.toString()

/*fun countTo100() =
        with(StringBuilder()) {
            for (i in 1..99) {
                append(i)
                append(", ")
            }
            append(100)
            toString()
        }*/


/*
fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}
*/

