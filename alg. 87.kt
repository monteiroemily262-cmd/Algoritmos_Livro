fun main() {
    print("Qual a capital do Brasil? ")
    val resposta = readln()

    when (resposta) {
        "BRASÍLIA", "Brasília" -> println("PARABÉNS!")
        "brasília", "Brazília", "brazília" ->
            println("CERTO! Mas atenção para a grafia: Brasília ou BRASÍLIA.")
        else -> println("ERRADO! ESTUDE MAIS!")
    }
}
