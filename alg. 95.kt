fun main() {
    print("Digite o número: ")
    val numero = readln().trim().toInt()

    if (numero % 5 == 0) {
        println("É divisível por 5")
    } else {
        println("Não é divisível por 5")
    }
}
