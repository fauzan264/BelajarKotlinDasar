fun main() {
    // val itu tidak bisa merubah variablenya bukan datanya

    val names: Array<String> = arrayOf("Ahmad", "Fauzan", "Nicky")
    println(names[1])
    println(names.size)
    println(names.get(1))
    names[2] = "ah.fauzan"

    println(names[2])
    names.set(1, "Fauzzz")

    println(names[1])


    // array boleh null
    val members: Array<String?> = arrayOfNulls(6)
    members[0] = "Ahmad"
    members[1] = "Ahmad"
    members[2] = "Ahmad"
    members[3] = "Fauzan"
    members[4] = null
    members[5] = "Fauzan"

    println(members[3])
    println(members[4])
}