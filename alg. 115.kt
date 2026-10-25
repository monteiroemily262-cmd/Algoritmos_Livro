import kotlin.math.*

fun main() {
    print("Digite o valor de x: ")
    val x = readln().trim().replace(',', '.').toDouble()

    print("Digite o valor de y: ")
    val y = readln().trim().replace(',', '.').toDouble()

    if (x == y) {
        println("Números iguais")
        return
    }

    val menor = min(x, y)
    val maior = max(x, y)

    if (maior >= 0) {
        println("Raiz quadrada do maior: ${sqrt(maior)}")
        println("Quadrado do menor: ${menor.pow(2)}")
    } else {
        println("Não existe raiz quadrada real do maior número.")
        println("Quadrado do menor: ${menor.pow(2)}")
    }
}
