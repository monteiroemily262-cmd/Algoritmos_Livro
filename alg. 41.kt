fun main() {
    print("Entre com o primeiro número: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Entre com o segundo número: ")
    val b = readln().trim().replace(',', '.').toDouble()
    print("Entre com o terceiro número: ")
    val c = readln().trim().replace(',', '.').toDouble()
    print("Entre com o quarto número: ")
    val d = readln().trim().replace(',', '.').toDouble()
    val mediaPonderada = (a * 1 + b * 2 + c * 3 + d * 4) / 10.0
    println("Média ponderada: $mediaPonderada")
}
