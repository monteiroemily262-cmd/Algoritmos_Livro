fun main() {
    print("Digite o número: ")
    val numero = readln().trim().toInt()

    if (numero % 2 == 0) {
        println("PAR")
    } else {
        println("ÍMPAR")
    }
}
