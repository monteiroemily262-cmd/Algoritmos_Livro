fun main() {
    print("Digite o número de lados do polígono: ")
    val lados = readln().trim().toInt()

    if (lados >= 3) {
        val diagonais = lados * (lados - 3) / 2.0
        println("Número de diagonais: $diagonais")
    } else {
        println("Um polígono precisa ter pelo menos 3 lados.")
    }
}
