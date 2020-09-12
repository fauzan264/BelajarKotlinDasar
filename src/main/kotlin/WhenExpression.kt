fun main() {
    // when digunakan untuk contoh kasus sederhana
    val finalExam = 'E'
    when(finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> {
            println("Bad")
        }
        else -> println("Try Again Next Year")
    }

    // multiple Option
    when(finalExam) {
        'A', 'B', 'C' -> {
            println("Selamat anda lulus!")
        }
        else -> {
            println("Maaf, anda tidak lulus")
        }
    }

    val nilai = "B"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("Selamat Lau Lulus!")
        !in nilaiLulus -> println("Maaf Lau gagal!")
    }

    val name = "Fauzan"
    when(name) {
        is String -> println("Ini adalah String")
        !is String -> println("Ini bukan String")
    }

    // menggunakan when sebagai pengganti if else
    val examValue = 91
    when {
        examValue > 90 -> println("Amazing")
        examValue > 80 -> println("Good Job")
        examValue > 60 -> println("Not Bad")
        else -> println("Try again next year")
    }
}