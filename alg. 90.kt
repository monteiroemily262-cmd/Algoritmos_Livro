fun main() {
    print("Digite o número: ")
    val numero = readln().trim().replace(',', '.').toDouble()

    if (numero > 20) {
        println(numero)
    }
}
