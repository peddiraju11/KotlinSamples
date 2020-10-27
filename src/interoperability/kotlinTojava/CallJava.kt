import interoperability.kotlinTojava.Bus


fun main(args: Array<String>) {

    val bus = Bus("yellow", "Benz", 2015)
    bus.color = "white"
    println(bus)

    bus.variableMethod(5, "hi", "byerdf")
    val strings = arrayOf("dsfjsdf", "dsfrireji3o")
    bus.variableMethod(10, *strings)

    bus.getIntArray(intArrayOf(1, 2, 3))

    println(Bus.xString())

    bus.demoMethod { println("Sample thread!") }


}