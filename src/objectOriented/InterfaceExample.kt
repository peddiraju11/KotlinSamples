package objectOriented

fun main() {

    var classItem = MyClass()
}

class MyClass : SampleInterface {

    override fun initData() {
        TODO("Not yet implemented")
    }

}

interface SampleInterface {

    fun initData()
}