package generics


fun main(args: Array<String>) {
    var name: Company<String> = Company("Welcome")
    var rank: Company<Int> = Company(12)
}

class Company<T>(text: T) {
    var x = text
    init {
        println(x)
    }
}

/*
class Company (text: String) {
    var x = text
    init{
        println(x)
    }
}*/
