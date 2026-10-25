fun main() {
    print("Entre com seu peso em kg (parte inteira): ")
    val peso = readln().trim().toInt()

    val pesoGramas = peso * 1000

    println("Peso em gramas: $pesoGramas")
    println("Novo peso em gramas: ${pesoGramas * 1.12}")
}
