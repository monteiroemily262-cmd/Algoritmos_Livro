import kotlin.math.abs

fun main() {
    print("Digite o número: ")
    val numero = readln().trim().replace(',', '.').toDouble()

    if (numero > 0) {
        println("Inverso: ${1.0 / numero}")
    } else {
        println("Absoluto: ${abs(numero)}")
    }
}
