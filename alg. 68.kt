fun main() {
    print("Digite o primeiro número: ")
    var a = readln().trim().replace(',', '.').toDouble()

    print("Digite o segundo número: ")
    var b = readln().trim().replace(',', '.').toDouble()

    val auxiliar = a
    a = b
    b = auxiliar

    println("A = $a")
    println("B = $b")
}
