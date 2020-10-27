package expressions

fun main() {
/*
    //5,10,15...5000
    for (i in 5..5000 step 5)
        println(i)

    //-500,-499,-498...0
    for (i in -500..0)
        println(i)
        */

    //Fibinacco series

    var count:Int
    var lastToSecondLast:Int =0
    var lastItem:Int =1

    for (i in 1..15) {

        count=lastToSecondLast+lastItem;
        println(count)
        lastToSecondLast=lastItem;
        lastItem=count

    }

    // 1, 11, 100, 99, 98, 2

    iloop@ for (i in 1..5) {
        println(i)
        if (i == 2) {
            break
        }
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    continue@iloop
                }
            }
        }
    }


}