import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Digite o número: ")
    val numero = readln().trim().replace(',', '.').toDouble()

    if (numero > 0) {
        println("Raiz: ${sqrt(numero)}")
    } else if (numero < 0) {
        println("Quadrado: ${numero.pow(2)}")
    }
}
