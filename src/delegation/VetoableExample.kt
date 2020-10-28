package delegation

import kotlin.properties.Delegates

fun main() {

    // printing value of max valriable default zero
    println(max)

    // assigning new value to max variable
    max = 10

    // printing newly assigned value to max variable
    println(max)

    // assigning new value to max variable but it
    // doesnot satisfy max condition
    max = 5

    println(max)

}

var max: Int by Delegates.vetoable(0) { _, oldValue, newValue ->
    newValue > oldValue
}

