fun main() {
    val love = false
    val dia = love
    var jawab = ""
    if (dia) {
        jawab = "Dia cinta kamu"
    } else {
        jawab = "silahkan cari yang lain lagi."
    }

    println(jawab)

    val nilaiUjian = 80
    val nilaiAbsen = 79
    val nilaiEkstra = 90

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusEkstra = nilaiEkstra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusEkstra
    println(apakahLulus)
}