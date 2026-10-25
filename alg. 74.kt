fun main() {
    print("Entre com o salário mínimo: ")
    val salarioMinimo = readln().trim().replace(',', '.').toDouble()

    print("Entre com o salário da pessoa: ")
    val salarioPessoa = readln().trim().replace(',', '.').toDouble()

    if (salarioMinimo > 0) {
        println("A pessoa ganha ${salarioPessoa / salarioMinimo} salários mínimos")
    } else {
        println("O salário mínimo deve ser maior que zero.")
    }
}
