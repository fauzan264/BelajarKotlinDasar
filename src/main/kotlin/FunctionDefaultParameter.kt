fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Ahmad", "Fauzan")
    hello("Fauzan")
    hello("Jovan", "Feryal")
    hello("Mustopa")
}