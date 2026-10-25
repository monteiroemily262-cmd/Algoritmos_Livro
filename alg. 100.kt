fun main() {
    print("Digite um número de quatro algarismos: ")
    val numero = readln().trim().toInt()

    val formado = numero / 100

    if (formado % 4 == 0) {
        println("O número é múltiplo de 4: $formado")
    } else {
        println("O número não é múltiplo de 4: $formado")
    }
}
