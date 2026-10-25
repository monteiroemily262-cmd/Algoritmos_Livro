fun main() {
    print("Entre com o ano atual: ")
    val anoAtual = readln().trim().toInt()

    print("Entre com o ano de nascimento: ")
    val anoNascimento = readln().trim().toInt()

    if (anoNascimento > anoAtual) {
        println("Ano de nascimento inválido")
    } else {
        println("Idade: ${anoAtual - anoNascimento}")
    }
}
