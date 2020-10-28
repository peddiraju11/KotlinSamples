package delegation

fun main() {
    println(lazyValue)
    println(lazyValue)
}

val lazyValue: String by lazy {
    println("STEP-1")
    "STEP-2"
}



