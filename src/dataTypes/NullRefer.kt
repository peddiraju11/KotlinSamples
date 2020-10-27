fun main(args: Array<String>) {

    val type: String? = "new"
    val type1 = type!!.toUpperCase()

    println("Sample data: ${type.toUpperCase()}")

    val type2 = type ?: "default value"
    println(type2)

    val something: Any = arrayOf(1, 2, 3, 4)
    val type3 = something as? String
    println(type3)

    println(type3?.toUpperCase())
}




