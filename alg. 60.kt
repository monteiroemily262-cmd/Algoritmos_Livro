fun main() {
    print("Entre com o primeiro termo: ")
    val primeiroTermo = readln().trim().replace(',', '.').toDouble()

    print("Entre com a razão: ")
    val razao = readln().trim().replace(',', '.').toDouble()

    println("O 10º termo desta P.A. é: ${primeiroTermo + 9 * razao}")
}
