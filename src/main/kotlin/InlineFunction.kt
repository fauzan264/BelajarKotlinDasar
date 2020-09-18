inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

fun main() {

    for (i in 1..100) {
        println(hello({"Fauzan $i"}))
    }
}