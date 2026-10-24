import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Entre com a base: ")
    val a = readln().trim().replace(',', '.').toDouble()

    print("Entre com a altura: ")
    val b = readln().trim().replace(',', '.').toDouble()

    print("Entre com a profundidade: ")
    val c = readln().trim().replace(',', '.').toDouble()

    println("Diagonal: ${sqrt(a.pow(2) + b.pow(2) + c.pow(2))}")
}
