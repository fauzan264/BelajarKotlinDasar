// const variable global
const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main(){
    // immutable val
    // mutable var
    val firstname = "Ahmad"
    val age = 25
    println(firstname)
    println(age)

    var lastName: String? = "Fauzan"
    lastName = null

    println(lastName?.length)

    println("$APP : $VERSION")
}