import kotlin.math.floor

fun main() {
    print("Digite PR1: ")
    val pr1 = readln().trim().replace(',', '.').toDouble()

    print("Digite PR2: ")
    val pr2 = readln().trim().replace(',', '.').toDouble()

    val media = (pr1 + pr2) / 2.0

    println("Média truncada = ${media.toInt()}")
    println("Média arredondada = ${floor(media + 0.5).toInt()}")
}
