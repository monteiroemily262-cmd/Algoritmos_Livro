fun main() {
    print("Digite o tempo gasto na viagem: ")
    val tempo = readln().trim().replace(',', '.').toDouble()

    print("Digite a velocidade média: ")
    val velocidade = readln().trim().replace(',', '.').toDouble()

    val distancia = tempo * velocidade
    val litros = distancia / 12.0

    println("Velocidade média: $velocidade")
    println("Tempo gasto: $tempo")
    println("Distância percorrida: $distancia")
    println("Litros utilizados: $litros")
}
