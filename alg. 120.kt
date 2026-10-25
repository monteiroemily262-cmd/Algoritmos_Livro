fun main() {
    val a = lerNumero("Digite o primeiro número: ")
    val b = lerNumero("Digite o segundo número: ")
    val c = lerNumero("Digite o terceiro número: ")

    val maior: Double
    val intermediario: Double
    val menor: Double

    if (a > b) {
        if (c > a) {
            maior = c
            intermediario = a
            menor = b
        } else if (c > b) {
            maior = a
            intermediario = c
            menor = b
        } else {
            maior = a
            intermediario = b
            menor = c
        }
    } else {
        if (c > b) {
            maior = c
            intermediario = b
            menor = a
        } else if (c > a) {
            maior = b
            intermediario = c
            menor = a
        } else {
            maior = b
            intermediario = a
            menor = c
        }
    }

    println("Maior: $maior")
    println("Intermediário: $intermediario")
    println("Menor: $menor")
}

fun lerNumero(mensagem: String): Double {
    print(mensagem)
    return readln().trim().replace(',', '.').toDouble()
}
