package dataTypes

fun main() {

    //declare non null float in two ways
    val item1 = 10.8f
    val item2: Float = 20.78f

    //change above both to nullable
    val item3: Float? = 10.8f
    val item4: Float? = 20.78f

    //Non nullable array short
    var array = shortArrayOf(1, 2, 3, 4, 5)
    val array1: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    //declare an int array with printing the values of 10,20,30....
    val array3 = Array<Int?>(10) { k -> (k + 1) * 10 }
    //println(array3[0])

    //Write a char array with some data
    val charArray = charArrayOf('w', 'e', 'r')

    //Check alvice operator usage
    var text1: String? = "PRODDATUR IS GOLDEN CITY"
    // var text1:String?=null
    var test2 = text1?.toLowerCase() ?: "Kadapa"
    // println(test2)

    //replace string
    text1?.let { println(text1.toLowerCase().replace("golden", "pink")) }


}