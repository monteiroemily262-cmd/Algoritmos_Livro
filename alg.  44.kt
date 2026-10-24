import kotlin.math.ln

fun main() {
    print("Entre com o logaritmando: ")
    val numero = readln().trim().replace(',', '.').toDouble()

    print("Entre com a base: ")
    val base = readln().trim().replace(',', '.').toDouble()

    if (numero > 0 && base > 0 && base != 1.0) {
        println("Logaritmo: ${ln(numero) / ln(base)}")
    } else {
        println("Valores inválidos para calcular o logaritmo.")
    }
}
