fun main() {
    var a = readlnValor("Digite o primeiro número: ")
    var b = readlnValor("Digite o segundo número: ")
    var c = readlnValor("Digite o terceiro número: ")

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

    println("Ordem crescente: $a $b $c")
}

fun readlnValor(mensagem: String): Double {
    print(mensagem)
    return readln().trim().replace(',', '.').toDouble()
}
