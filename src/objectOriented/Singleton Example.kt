package objectOriented

fun main() {

    println(UserData.userCountry())
    println(UserData.userId())

}

object UserData{

    var dob= "1985"

    fun userId()=78

    fun userCountry()="India"
}