fun main() {
    print("Digite o primeiro número: ")
    val a = readln().trim().replace(',', '.').toDouble()

    print("Digite o segundo número: ")
    val b = readln().trim().replace(',', '.').toDouble()

    print("Digite o terceiro número: ")
    val c = readln().trim().replace(',', '.').toDouble()

    val maior = if (a > b) {
        if (a > c) a else c
    } else {
        if (b > c) b else c
    }

    println("Maior: $maior")
}
