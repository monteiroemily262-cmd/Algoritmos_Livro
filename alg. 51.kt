import kotlin.math.PI
import kotlin.math.pow

fun main() {
    print("Digite o raio: ")
    val raio = readln().trim().replace(',', '.').toDouble()

    println("Perímetro: ${2 * PI * raio}")
    println("Área: ${PI * raio.pow(2)}")
}
