fun main() {
    print("Digite o numerador: ")
    val numerador = readln().trim().toInt()

    print("Digite o denominador: ")
    val denominador = readln().trim().toInt()

    if (denominador == 0) {
        println("O denominador não pode ser zero.")
        return
    }

    println("Decimal: ${numerador.toDouble() / denominador}")
}
