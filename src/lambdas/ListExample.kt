package lambdas

fun main() {

    val words = listOf("pen", "cup", "dog", "person",
            "cement", "coal")
    println("The list contains ${words.size} elements.")

    val w1 = words.first()
    println(w1)

    val w2 = words.last()
    println(w2)

    val num_list = mutableListOf(3, 4, 5)

    val words2 = words.filter { e -> e.length == 4 }
    words2.forEach { e -> print("$e ") }

    println()

    val nums = listOf(1, 2, 3, 4, 5, 6)

    val nums2 = nums.map { e -> e * 2 }
    println(nums2)
    
}