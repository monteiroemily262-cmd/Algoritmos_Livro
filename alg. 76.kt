fun main() {
    print("Digite um número entre 0 e 60: ")
    val numero = readln().trim().toInt()

    if (numero in 0..60) {
        println("Sucessor: ${(numero + 1) % 61}")
    } else {
        println("Digite um número entre 0 e 60.")
    }
}
