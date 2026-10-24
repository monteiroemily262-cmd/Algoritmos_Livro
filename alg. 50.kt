import kotlin.math.*

fun main() {
    print("Digite a base: ")
    val base = readln().trim().replace(',', '.').toDouble()

    print("Digite a altura: ")
    val altura = readln().trim().replace(',', '.').toDouble()

    println("Perímetro: ${2 * (base + altura)}")
    println("Área: ${base * altura}")
    println("Diagonal: ${sqrt(base.pow(2) + altura.pow(2))}")
}
