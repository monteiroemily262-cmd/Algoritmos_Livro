import kotlin.math.pow

fun main() {
    print("Digite o primeiro número: ")
    val a = readln().trim().replace(',', '.').toDouble()

    print("Digite o segundo número: ")
    val b = readln().trim().replace(',', '.').toDouble()

    println("Quadrado da diferença: ${(a - b).pow(2)}")
    println("Diferença dos quadrados: ${a.pow(2) - b.pow(2)}")
}
