fun main() {
    print("Entre com o dividendo: ")
    val dividendo = readln().trim().toInt()
    print("Entre com o divisor: ")
    val divisor = readln().trim().toInt()
    if (divisor == 0) {
        println("O divisor não pode ser zero.")
        return
    }
    println("Dividendo: $dividendo")
    println("Divisor: $divisor")
    println("Quociente: ${dividendo / divisor}")
    println("Resto: ${dividendo % divisor}")
}
