fun main() {
    print("Digite a quantidade de fitas: ")
    val quantidade = readln().trim().toInt()

    print("Digite o valor do aluguel: ")
    val valorAluguel = readln().trim().replace(',', '.').toDouble()

    val alugadasPorMes = quantidade / 3.0
    val faturamentoAnual = alugadasPorMes * valorAluguel * 12
    val multasMensais = valorAluguel * 0.1 * alugadasPorMes / 10
    val quantidadeFinal = quantidade - quantidade * 0.02 + quantidade / 10.0

    println("Faturamento anual: $faturamentoAnual")
    println("Multas mensais: $multasMensais")
    println("Quantidade de fitas no final do ano: $quantidadeFinal")
}
