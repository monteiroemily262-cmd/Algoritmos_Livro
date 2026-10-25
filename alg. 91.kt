fun main() {
    print("Digite o primeiro número: ")
    val a = readln().trim().toInt()

    print("Digite o segundo número: ")
    val b = readln().trim().toInt()

    val soma = a + b

    if (soma > 10) {
        println("Soma: $soma")
    }
}
