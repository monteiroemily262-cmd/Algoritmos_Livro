import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Digite o lado do quadrado: ")
    val lado = readln().trim().replace(',', '.').toDouble()

    println("Perímetro: ${4 * lado}")
    println("Área: ${lado.pow(2)}")
    println("Diagonal: ${lado * sqrt(2.0)}")
}
