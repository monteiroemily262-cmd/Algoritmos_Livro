import kotlin.math.*

fun main() {
    print("Digite o número: ")
    val numero = readln().trim().replace(',', '.').toDouble()

    println("Número: $numero")
    println("Quadrado: ${numero.pow(2)}")

    if (numero >= 0) {
        println("Raiz quadrada: ${sqrt(numero)}")
    } else {
        println("Não existe raiz quadrada real desse número.")
    }
}
