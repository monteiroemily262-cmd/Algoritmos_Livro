fun main() {
    print("Digite o salário bruto: ")
    val salarioBruto = readln().trim().replace(',', '.').toDouble()

    print("Digite o valor da prestação: ")
    val prestacao = readln().trim().replace(',', '.').toDouble()

    if (prestacao <= 0.30 * salarioBruto) {
        println("Empréstimo concedido")
    } else {
        println("Empréstimo negado")
    }
}
