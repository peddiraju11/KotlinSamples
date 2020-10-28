package delegation

fun main() {

    val b = DelegationImplementation("Welcome Here!")

    NewFeature(b).myMessage()
    NewFeature(b).myMessageLine()
}

interface Delegation {
    fun myMessage()
    fun myMessageLine()
}

class DelegationImplementation(private val y: String) : Delegation {

    override fun myMessage() {
        print(y)
    }

    override fun myMessageLine() {
        println(y)
    }
}

class NewFeature(m: Delegation) : Delegation by m {

    override fun myMessage() {
        println("Hey Check this!!")
    }
}

