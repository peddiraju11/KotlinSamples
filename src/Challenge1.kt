fun main() {

    //Declare 2 immutable variables hello1 and hello2 and assign Hello to both variables
    val value1: String = "Hello"
    val value2: String = "Hello"

    //check referencial equal of both variabls
    println(value1 === value2)

    //check structural equality
    println(value1 == value2)

    //Declare a mutable int variable
    var value3: Int = 111

    //Declare a immutable string and print it to uppercase
    val name: String = "raju"
    println(name.toUpperCase())

    //Declare a immutable Any object and print it to uppercase
    val name2: String = "Samsung"

    if (name2 is String)
        println(name2.toUpperCase())

    //using printmargin
    println("""   *
    |  **
| ***
|****""".trimMargin())
}