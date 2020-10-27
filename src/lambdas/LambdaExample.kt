package lambdas

fun main() {

    val members = listOf(Family("Raju", "Father", 60),
            Family("Ravi", "brother", 58),
            Family("Radha", "Wife", 55))

    println(members.minBy { e -> e.age })
    println(members.maxBy { it.age })
    println(members.maxBy(Family::age))


}

fun getEachItems(members: List<Family>, age: Int) {

    members.forEach {
        println(it.name)
    }
}

data class Family(val name: String, val relationship: String, val age: Int) {

}