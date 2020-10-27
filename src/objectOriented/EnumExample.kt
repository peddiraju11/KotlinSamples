package objectOriented

fun main() {

    println(SchoolTeacher.ENGLISH.getDetails())

}

enum class SchoolTeacher(private val subjectName: String, private val number: Int) {

    MATHS("Maths", 7), SCIENCE("Science", 12),
    ENGLISH("English", 56), HINDI("Hindi", 12);

    fun getDetails() = "Total $number no. of teachers available for $subjectName "
}