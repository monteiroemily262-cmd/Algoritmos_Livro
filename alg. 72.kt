fun main() {
    print("Entre com o depósito: ")
    val deposito = readln().trim().replace(',', '.').toDouble()

    print("Entre com a taxa de juros (%): ")
    val taxa = readln().trim().replace(',', '.').toDouble()

    val rendimento = deposito * taxa / 100.0

    println("Rendimento: $rendimento")
    println("Total: ${deposito + rendimento}")
}
