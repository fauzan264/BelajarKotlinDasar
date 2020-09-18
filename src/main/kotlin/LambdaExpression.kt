// method expression
fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    var topUpperCase: (String) -> String = ::toUpper

    println(topUpperCase("Ahmad Fauzan"))

    val contohLambda: (String, String) -> String = { firstName:String, lastName:String ->
        val result = "Hello $firstName $lastName"
        result
    }

    println(contohLambda("Ahmad", "Fauzan"))

    val fullName: (String) -> String = {
        val result = "Hey, nama lengkapmu adalah $it"
        result
    }

    println(fullName("Ahmad Fauzan"))
}