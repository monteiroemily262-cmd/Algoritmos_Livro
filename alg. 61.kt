import kotlin.math.pow

fun main() {
    print("Entre com o primeiro termo: ")
    val primeiroTermo = readln().trim().replace(',', '.').toDouble()

    print("Entre com a razão: ")
    val razao = readln().trim().replace(',', '.').toDouble()

    println("O 5º termo desta P.G. é: ${primeiroTermo * razao.pow(4)}")
}
