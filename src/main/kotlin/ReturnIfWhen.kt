// Return If & When
// kadang dalam sebuah function, kita sering menggunakan If expression atau when expression, lalu di dalam bloknya kita mengembalikan nilai untuk sebuah function
// Kotlin mendukung return if atau when, di mana fitur ini bisa mempermudah kita ketika ingin mengembalikan nilai dalam if atau when

fun main() {
    fun sayHello(name: String = ""): String {

        return when(name) {
            "" -> "Hello Bro!!!"
            else -> "Hello $name"
        }

        //return if (name == "") {
        //    "Hello Bro"
        //} else {
        //    "Hello $name"
        //}
    }

    println(sayHello())
    println(sayHello("Fauzan"))
}