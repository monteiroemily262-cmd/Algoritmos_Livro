import kotlin.math.PI
import kotlin.math.pow

fun main() {
    print("Digite a altura da lata: ")
    val altura = readln().trim().replace(',', '.').toDouble()

    print("Digite o raio da lata: ")
    val raio = readln().trim().replace(',', '.').toDouble()

    println("Volume da lata: ${PI * raio.pow(2) * altura}")
}
