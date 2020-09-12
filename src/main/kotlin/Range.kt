fun main() {
    val range = 1..100
    println(range)

    println(range.count()) // menghitung jumlah range
    println(range.contains(26)) // apakah angka ada di dalam renge
    println(range.contains(200)) // apakah angka ada di dalam range
    println(range.first) // nilai pertama
    println(range.last) // nilai terakhir
    println(range.step) // kelipatan kenaikan

    val rangeDown = 100 downTo 2

    println(rangeDown)
    println(rangeDown.count()) // menghitung jumlah range
    println(rangeDown.contains(25)) // apakah angka ada di dalam range
    println(rangeDown.contains(200)) // apakah angka ada di dalam range
    println(rangeDown.first) // nilai pertama
    println(rangeDown.last) // nilai terakhir
    println(rangeDown.step) // kelipatan pengurangan

    val rangeStep = 0..200 step 15
    println(rangeStep)
    println(rangeStep.step)
}