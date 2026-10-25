fun main() {
    print("Digite o nome: ")
    val nome = readln()

    if (nome.firstOrNull() == 'A' || nome.firstOrNull() == 'a') {
        println(nome)
    }
}
