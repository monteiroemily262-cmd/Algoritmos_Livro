fun main() {
    print("Digite o número: ")
    val numero = readln().trim().replace(',', '.').toDouble()

    if (numero > 20 && numero < 90) {
        println("O número está na faixa de 20 a 90, exclusive")
    } else {
        println("O número está fora da faixa de 20 a 90")
    }
}
