package objectOriented

fun main(args: Array<String>) {

    val emp = Manager("Raj")
    println(emp.name)
    emp.isQualified = false
    println(emp.isQualified)

    val emp2 = Manager("Ravi")
    println(emp2.name)
    println(emp2.isQualified)

    println(DemoClass().dummy)

}

class Manager(var name: String, isQualified: Boolean = false) {

    var isQualified = isQualified
        get() {
            println("Get Item")
            return field
        }
        set(value) {
            println("Set Item")
            field = value
        }

}

class DemoClass(var dummy: String = "Test") {
}


