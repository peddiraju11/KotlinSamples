package delegation

import kotlin.properties.Delegates

fun main() {

    val carName = CarName()
    carName.name = "BMW"
    carName.name = "HONDA"
}

class CarName {

    var name: String by Delegates.observable("car name") { _, old, new ->
        println("$old -> $new")
    }
}