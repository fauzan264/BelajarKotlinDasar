fun main() {


    val arr = arrayOf("Ahmad", "Fauzan", "c", "j", "heheh")

    var total = 0
    for (name in arr) {
        println(name)
        total++
    }
    println("Jumlah total: $total")

    for (i in 0..100 step 20) {
        println(i)
    }

    for (i in 100 downTo 1 step 30) {
        println(i)
    }

    val ukuranArr = arr.size - 1
    for (i in 0..ukuranArr) {
        println("Index $i = ${arr.get(i)}")
    }
}