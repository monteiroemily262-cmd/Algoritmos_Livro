fun main() {
    print("Entre com o salário mínimo: ")
    val salarioMinimo = readln().trim().replace(',', '.').toDouble()

    print("Entre com a quantidade de quilowatts: ")
    val quantidade = readln().trim().replace(',', '.').toDouble()

    val preco = salarioMinimo / 700.0
    val valorPagar = preco * quantidade
    val valorDesconto = valorPagar * 0.90

    println("Preço do quilowatt: $preco")
    println("Valor a ser pago: $valorPagar")
    println("Valor com desconto: $valorDesconto")
}
