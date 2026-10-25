fun main() {
    print("Entre com a hora atual: ")
    val hora = readln().trim().toInt()

    print("Entre com os minutos: ")
    val minuto = readln().trim().toInt()

    println("Até agora se passaram: ${hora * 60 + minuto} minutos")
}
