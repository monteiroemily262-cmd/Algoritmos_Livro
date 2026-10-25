fun main() {
    print("Digite o número: ")
    val numero = readln().trim().replace(',', '.').toDouble()

    if (numero > 0) {
        println("POSITIVO")
    } else if (numero < 0) {
        println("NEGATIVO")
    } else {
        println("NULO")
    }
}
