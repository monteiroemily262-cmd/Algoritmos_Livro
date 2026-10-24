fun main() {
    print("Entre com um nome: ")
    val nome = readln()

    println("Todo nome: $nome")
    println("Primeiro caractere: ${nome.firstOrNull() ?: ""}")
    println("Último caractere: ${nome.lastOrNull() ?: ""}")
    println("Do primeiro ao terceiro caractere: ${nome.take(3)}")
    println("Quarto caractere: ${nome.getOrNull(3) ?: "nome com menos de quatro caracteres"}")
    println("Todos menos o primeiro: ${nome.drop(1)}")
    println("Os dois últimos: ${nome.takeLast(2)}")
}
