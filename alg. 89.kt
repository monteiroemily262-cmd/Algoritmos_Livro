fun main() {
    println("Planetas que podem ser analisados:")
    println("1 Mercúrio")
    println("2 Vênus")
    println("3 Marte")
    println("4 Júpiter")
    println("5 Saturno")
    println("6 Urano")

    print("Escolha o planeta: ")
    val opcao = readln().trim().toInt()

    print("Entre com o peso na Terra: ")
    val pesoTerra = readln().trim().replace(',', '.').toDouble()

    val gravidade = when (opcao) {
        1 -> 0.37
        2 -> 0.88
        3 -> 0.38
        4 -> 2.64
        5 -> 1.15
        6 -> 1.17
        else -> {
            println("Este planeta não pode ser analisado.")
            return
        }
    }

    println("Seu peso no planeta selecionado é: ${(pesoTerra / 10.0) * gravidade}")
}
