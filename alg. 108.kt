fun main() {
    print("Digite o nome: ")
    val nome = readln()

    val aceito = nome == "JOSÉ" ||
        nome == "José" ||
        nome == "josé" ||
        nome.startsWith("JOSÉ ") ||
        nome.startsWith("José ") ||
        nome.startsWith("josé ")

    if (aceito) {
        println(nome)
    }
}
