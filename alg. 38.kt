fun main() {
    print("Entre com um número: ")
    val numero = readln().trim().replace(',', '.').toDouble()
    println("A terça parte é: ${numero / 3.0}")
}
