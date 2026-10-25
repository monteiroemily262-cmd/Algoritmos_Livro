fun main() {
    print("Digite o número: ")
    val numero = readln().trim().replace(',', '.').toDouble()

    if (numero > 20) {
        println("Maior que 20")
    } else if (numero < 20) {
        println("Menor que 20")
    } else {
        println("Igual a 20")
    }
}
