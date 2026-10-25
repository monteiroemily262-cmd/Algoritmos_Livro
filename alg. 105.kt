fun main() {
    print("Digite a sigla do estado: ")
    val sigla = readln()

    when (sigla) {
        "RJ", "rj" -> println("Carioca")
        "SP", "sp" -> println("Paulista")
        "MG", "mg" -> println("Mineiro")
        else -> println("Outros estados")
    }
}
