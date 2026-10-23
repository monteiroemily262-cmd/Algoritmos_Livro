fun main() {
    print("Digite a data no formato DDMMAA: ")
    val data = readln().trim().toInt()
    val dia = data / 10000
    val mes = data % 10000 / 100
    val ano = data % 100
    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
}
