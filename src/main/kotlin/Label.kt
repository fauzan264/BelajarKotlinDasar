fun breakLabel() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i > 5) break@loopI else println("$i * $j = ${i * j}")
        }
    }
}

fun continueLabel() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j % 2 == 1) continue else println("$i * $j = ${i*j}")
        }
    }
}

fun returnLabel(name: String, operation: (String) -> Unit): Unit = operation(name)

fun main() {
    breakLabel()
    println()

    continueLabel()

    returnLabel("Fauzan") test@{
        if (it == "") {
            return@test
        } else {
            println(it)
        }
    }


}