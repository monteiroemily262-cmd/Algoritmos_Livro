import kotlin.math.floor

fun main() {
    print("Entre com um número com parte fracionária: ")
    val numero = readln().trim().replace(',', '.').toDouble()

    val parteInteira = floor(numero).toInt()
    val parteFracionaria = numero - parteInteira
    val arredondado = floor(numero + 0.5).toInt()

    println("Parte inteira: $parteInteira")
    println("Parte fracionária: ${"%.3f".format(java.util.Locale.US, parteFracionaria)}")
    println("Número arredondado: $arredondado")
}
