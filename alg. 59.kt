import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Entre com o primeiro cateto: ")
    val cateto1 = readln().trim().replace(',', '.').toDouble()

    print("Entre com o segundo cateto: ")
    val cateto2 = readln().trim().replace(',', '.').toDouble()

    println("A hipotenusa é: ${sqrt(cateto1.pow(2) + cateto2.pow(2))}")
}
