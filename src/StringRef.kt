
fun main(args: Array<String>)  {

    var number: Int = 20

    val student1 = Student1("P Raj", number)
    student1.name = "G Raj"

    println(student1)

    val change = 4.22
    println("Your change is $")

    val numerator = 1809.252
    val denominator = 1020.333
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    println("The Student's id is ${student1.number}")
}

class Student1(var name: String, var number : Int) {

    override fun toString(): String {
        return "Student(name=$name, id=$number)"
    }
}


