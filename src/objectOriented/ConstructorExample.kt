package objectOriented

fun main() {

    var student = Student1("Raj", true)
    var student11 = Student1("Ravi", false)

    println(student)
}

private class Student1(name: String, isQualified: Boolean = false) {

}