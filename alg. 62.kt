fun main() {
    print("Digite o valor do produto: ")
    val preco = readln().trim().replace(',', '.').toDouble()

    println("Preço com desconto: ${preco * 0.91}")
}
