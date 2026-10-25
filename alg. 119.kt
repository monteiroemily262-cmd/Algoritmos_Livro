fun main() {
    var a = lerValor("Digite o primeiro número: ")
    var b = lerValor("Digite o segundo número: ")
    var c = lerValor("Digite o terceiro número: ")

    var auxiliar: Double

    if (a > b) {
        auxiliar = a
        a = b
        b = auxiliar
    }

    if (a > c) {
        auxiliar = a
        a = c
        c = auxiliar
    }

    if (b > c) {
        auxiliar = b
        b = c
        c = auxiliar
    }

    println("Ordem decrescente: $c $b $a")
}

fun lerValor(mensagem: String): Double {
    print(mensagem)
    return readln().trim().replace(',', '.').toDouble()
}
