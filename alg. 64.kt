fun main() {
    print("Digite a temperatura em graus centígrados: ")
    val celsius = readln().trim().replace(',', '.').toDouble()

    val fahrenheit = (9 * celsius + 160) / 5.0

    println("Temperatura em Fahrenheit: $fahrenheit")
}
