// vararg bisa digunakan, harus di parameter paling akhir
// vararg hasil datanya berupa array
fun hitungTotal(vararg values:Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return total
}
fun main() {
    println(hitungTotal(20,10,50,20))
}