fun main() {
    fun hello(value:String, transform: (String)-> String): String {
        val result = transform(value)
        return "Hello $result"
    }

    val upper = fun(value: String): String {
        if (value.isBlank()) {
            return "Ups, kosong."
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("Fauzan", upper))
    println(hello("", upper))
}