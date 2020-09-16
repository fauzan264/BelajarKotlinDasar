// Harus sebagai function member(akan dibahas di OOP) atau function extension
// Harus memiliki 1 parameter
// Parameter tidak boleh varargs dan tidak boleh memiliki nilai default
infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    val result: String = "Fauzan" to "UP"

    println(result)

    val name: String = "Ahmad".to("Low")
    println(name)
}