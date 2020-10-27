package lambdas

fun main() {

    val persons = listOf(
            Person1("Raju", 16),
            Person1("Anna", 23),
            Person1("Anna", 28),
            Person1("Somu", 39)
    )

    val names = persons
            .asSequence()
            .filter { it.age > 18 }
            .map { it.name }
            .distinct()
            .sorted()
            .toList()

    print(names)
}

data class Person1(var name: String, var age: Int)


