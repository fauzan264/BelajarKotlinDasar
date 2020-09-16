fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name = "Fauzan"

    println(name.hello())

    name.printHello()

    "Ahmad".printHello()
}