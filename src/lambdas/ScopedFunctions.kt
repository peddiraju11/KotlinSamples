package lambdas

fun main() {

    //Scoped functions are functions that execute a block of code within the context of an object.

    var person = Person("Raju", "Kotlin")

    //let in Kotlin
    //let takes the object it is invoked upon as the parameter and returns the result of the lambda expression.
    //Kotlin let is a scoping function wherein the variables declared inside the expression cannot be used outside
    var str = "Hello World"
    str.let { println("$it!!") }
    //println(str)

    /*var strLength = str.let { "$it function".length }
    println("Length is $strLength") */

    //###################################################################################################//

    //run in Kotlin
    //Similar to the let function, the run function also returns the last statement.
    //Unlike let, the run function doesn’t support the it keyword.
    //Kotlin run expression can change the outer property
    var tutorial = "This is sample test"
    //println(tutorial)
    tutorial = run {
        var tutorial = "This is run test"
        tutorial
    }
   // println(tutorial)

    //###################################################################################################//

    //also in Kotlin
    //also expressions does some additional processing on the object it was invoked
    var m = 1
    m = m.also { println(it + 1) }.also { it + 1 }
    //println(m)

    //###################################################################################################//

    //apply in Kotlin
    //apply is an extension function on a type.
    //It runs on the object reference into the expression and returns the object reference on completion
    person.apply { this.subject = "Swift" }
    //println(person)

    //###################################################################################################//

    //with in Kotlin
    //Like apply, with is used to change instance properties without the need to call dot operator over the reference every time.

    with(person) {
        name = "No Name"
        subject = "Kotlin tutorials"
    }
    //println(person)

    //###################################################################################################//


}

data class Person(var name: String, var subject: String)
