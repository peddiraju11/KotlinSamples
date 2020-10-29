package delegation

fun main() {

    val mobile = Mobile(mapOf(
            "modelName" to "SAMSUNG",
            "variant" to 64))

    println(mobile.modelName)
    println(mobile.variant)
}

class Mobile(private val map: Map<String, Any?>) {
    val modelName: String by map
    val variant: Int by map
}