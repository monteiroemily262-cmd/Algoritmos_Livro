fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readln().trim().replace(',', '.').toDouble()
    print("Digite a segunda nota: ")
    val nota2 = readln().trim().replace(',', '.').toDouble()
    println("Média: ${(nota1 + nota2) / 2.0}")
}
