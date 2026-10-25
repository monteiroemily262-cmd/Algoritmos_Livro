fun main() {
    print("Digite o primeiro número: ")
    val a = readln().trim().replace(',', '.').toDouble()

    print("Digite o segundo número: ")
    val b = readln().trim().replace(',', '.').toDouble()

    val soma = a + b

    if (soma > 20) {
        println("Soma: ${soma + 8}")
    } else {
        println("Soma: ${soma - 5}")
    }
}
