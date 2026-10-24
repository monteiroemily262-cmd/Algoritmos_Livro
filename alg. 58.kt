import kotlin.math.ln

fun main() {
    print("Entre com o primeiro valor: ")
    val xnum1 = readln().trim().replace(',', '.').toDouble()

    print("Entre com o segundo valor: ")
    val xnum2 = readln().trim().replace(',', '.').toDouble()

    print("Entre com o terceiro valor: ")
    val xnum3 = readln().trim().replace(',', '.').toDouble()

    val x = xnum1 +
        xnum2 / (xnum3 + xnum1) +
        2 * (xnum1 - xnum2) +
        ln(64.0) / ln(2.0)

    println("X = $x")
}
