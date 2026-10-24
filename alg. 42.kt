
import kotlin.math.*

fun main() {
    print("Digite um ângulo em graus: ")
    val angulo = readln().trim().replace(',', '.').toDouble()

    val radianos = Math.toRadians(angulo)

    val seno = sin(radianos)
    val cosseno = cos(radianos)
    val tangente = tan(radianos)

    println("Seno: $seno")
    println("Co-seno: $cosseno")
    println("Tangente: $tangente")

    if (kotlin.math.abs(cosseno) > 1e-10) {
        println("Secante: ${1.0 / cosseno}")
    } else {
        println("Secante: indefinida")
    }

    if (kotlin.math.abs(seno) > 1e-10) {
        println("Co-secante: ${1.0 / seno}")
    } else {
        println("Co-secante: indefinida")
    }

    if (kotlin.math.abs(tangente) > 1e-10) {
        println("Co-tangente: ${1.0 / tangente}")
    } else {
        println("Co-tangente: indefinida")
    }
}
