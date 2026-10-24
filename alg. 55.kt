fun main() {
    print("Entre com a base: ")
    val base = readln().trim().replace(',', '.').toDouble()

    print("Entre com a altura do triângulo: ")
    val altura = readln().trim().replace(',', '.').toDouble()

    println("Área = ${(base * altura) / 2.0}")
}
