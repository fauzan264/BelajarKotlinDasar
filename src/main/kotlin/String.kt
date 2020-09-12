fun main() {
    val jalan:String = """
        Nama saya, Ahmad Fauzan
    """.trimIndent()

    println(jalan)

    val firstName = "Ahmad"
    val lastName = "Fauzan"
    val address = """
        >Jalan Kp. Karang Kitri, RT.05/09
        >Kota Bekasi,
        >Jawa Barat,
        >Indonesia
        """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)

    var fullname:String = "$firstName $lastName"
    println(fullname)

    var desc:String = "$fullname length = ${fullname.length}"
    println(desc)
}