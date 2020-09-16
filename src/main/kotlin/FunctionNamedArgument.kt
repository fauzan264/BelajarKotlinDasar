// fungsi dari function named argument
// bisa memanggil parameter ngga sesuai urutan
// dengan cara panggil nama parameternya secara langsung
fun fullName(
    firstName: String,
    middleName: String ="",
    lastName: String
) {
    println("Nama saya adalah $firstName $middleName $lastName")
}

fun main() {
    fullName(firstName = "Ahmad", lastName = "Fauzan")
    fullName(firstName = "Jovan", lastName = "Firmansyah", middleName = "Feryal")
}