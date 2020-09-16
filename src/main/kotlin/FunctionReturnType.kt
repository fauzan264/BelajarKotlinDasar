fun jumlah(nilai1: Int, nilai2: Int): Int {
    val total = nilai1 + nilai2
    return total
}

fun bagi(nilai1: Int, nilai2: Int): Int {
    if (nilai2 == 0) {
        return 0
    } else {
        val total = nilai1 / nilai2
        return total
    }
}

fun main() {
    println(jumlah(2, 2))

    val result = jumlah(2,6)
    println(result)

    println(bagi(20, 0))

    val result2 = bagi(26, 2)
    println(result2)
}