package expressions


fun main(args: Array<String>) {

    for (i in 1..15) {
        println(i)
    }

    for (num in 1..20 step 4) {
        println(num)
    }

    for (i in 1 until 10) {
        println(i)
    }

    for (i in 20 downTo 10 step 5) {
        println(i)
    }

    val str = "Hello"
    for (c in str) {
        println(c)
    }

    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
                    continue@jloop
                }
            }
        }
    }


}