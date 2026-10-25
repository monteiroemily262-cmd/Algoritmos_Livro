fun main() {
    print("Entre com o valor da conta: ")
    val conta = readln().trim().replace(',', '.').toDouble()

    println("Valor da conta com a gorjeta: ${conta * 1.1}")
}
