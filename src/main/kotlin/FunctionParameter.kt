fun sayHello(firstName:String, lastName:String?, age:Int) {
    if (lastName == null) {
        println("Hello nama saya $firstName, umur saya $age tahun.")
    } else {
        println("Hello nama saya $firstName $lastName, umur saya $age tahun.")
    }
}

fun main() {
    sayHello("Ahmad", "Fauzan", 25)
    sayHello("Jovan", null, 23)
    sayHello("Haris", "Syuaidi", 28)
}