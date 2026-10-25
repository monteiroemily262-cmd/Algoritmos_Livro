fun main() {
    print("Digite a conta de três dígitos: ")
    val conta = readln().trim().toInt()

    val centena = conta / 100
    val dezena = conta % 100 / 10
    val unidade = conta % 10

    val inverso = unidade * 100 + dezena * 10 + centena
    val soma = conta + inverso
    val ultimosTres = soma % 1000

    val d1 = ultimosTres / 100
    val d2 = ultimosTres % 100 / 10
    val d3 = ultimosTres % 10

    val digito = (d1 * 1 + d2 * 2 + d3 * 3) % 10

    println("Dígito verificador: $digito")
}
