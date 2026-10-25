fun main() {
    print("Digite o primeiro número: ")
    val a = readln().trim().replace(',', '.').toDouble()

    print("Digite o segundo número: ")
    val b = readln().trim().replace(',', '.').toDouble()

    if (a > b) {
        println("$a $b")
    } else {
        println("$b $a")
    }
}
