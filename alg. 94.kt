fun main() {
    print("Digite o número: ")
    val numero = readln().trim().toInt()

    if (numero % 3 == 0) {
        println("É múltiplo de 3")
    } else {
        println("Não é múltiplo de 3")
    }
}
