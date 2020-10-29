package delegation

import kotlin.properties.Delegates

fun main() {

    println(max)

    max = 10

    println(max)

    max = 5

    println(max)

}

var max: Int by Delegates.vetoable(0) { _, oldValue, newValue ->
    newValue > oldValue
}

