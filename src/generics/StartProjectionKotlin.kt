package generics


fun main(args: Array<String>) {
    val name = arrayOf("SAMSUNG", "APPLE", "XIOMI")
    val number = arrayOf(1, 2, 58)
    val checkIt = arrayOf(true, false)

    printArray(name)
    printArray(number)
    printArray(checkIt)

}

// star projection in array
fun printArray(array: Array<*>) {
    array.forEach {
        println(it)
    }
}