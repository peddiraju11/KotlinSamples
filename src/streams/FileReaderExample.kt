package streams

import java.io.File

fun main() {

    File("SampleFile").reader().forEachLine { println(it) }
}