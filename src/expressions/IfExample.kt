package expressions


fun main(args: Array<String>) {

    val a=10
    val b=30

    val max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
}