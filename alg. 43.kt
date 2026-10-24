import kotlin.math.ln

fun main() {
    print("Entre com o logaritmando: ")
    val numero = readln().trim().replace(',', '.').toDouble()

    if (numero > 0) {
        println("Logaritmo: ${ln(numero) / ln(10.0)}")
    } else {
        println("Digite um número maior que zero.")
    }
}
