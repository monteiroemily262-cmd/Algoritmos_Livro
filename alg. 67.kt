fun main() {
    print("Digite o valor da prestação: ")
    val valor = readln().trim().replace(',', '.').toDouble()

    print("Digite a taxa (%): ")
    val taxa = readln().trim().replace(',', '.').toDouble()

    print("Digite o tempo em meses: ")
    val tempo = readln().trim().toInt()

    val prestacao = valor + valor * (taxa / 100.0) * tempo

    println("Valor da prestação em atraso: $prestacao")
}
