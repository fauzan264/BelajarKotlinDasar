fun main() {
    var i = 0
    // contoh penggunaan break
    while (true) {
        println("Angka ke $i")
        i++
        if (i > 500) {
            break
        }
    }

    // contoh penggunaan continue
    for (i in 1..10) {
        if (i % 2 == 1) {
            continue
        }
        // akan print angka ganjil
        println("Lihat sudah angka ke $i")
    }

}