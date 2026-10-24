fun main() {
    print("Digite o saldo: ")
    val saldo = readln().trim().replace(',', '.').toDouble()

    println("Novo saldo: ${saldo * 1.01}")
}
