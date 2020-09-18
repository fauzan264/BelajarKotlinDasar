fun main() {
    fun sayHello(value: String, transform: (String)-> String): String {
        val name: String = transform(value)
        return "Hello $name"
    }

    val result = sayHello("Fauzan", {value: String -> value.toUpperCase()})
    println(result)

    // trailing lambda
    val result2 = sayHello("Ahmad") {
        it.toLowerCase()
    }

    println(result2)

}