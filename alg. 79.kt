import kotlin.math.pow

fun main() {
    print("Digite o valor da aplicação mensal: ")
    val aplicacao = readln().trim().replace(',', '.').toDouble()

    print("Digite a taxa de juros na forma decimal (ex.: 0,01): ")
    val taxa = readln().trim().replace(',', '.').toDouble()

    print("Digite o número de meses: ")
    val meses = readln().trim().toInt()

    val valorAcumulado = if (taxa == 0.0) {
        aplicacao * meses
    } else {
        aplicacao * ((1 + taxa).pow(meses) - 1) / taxa
    }

    println("Valor acumulado: $valorAcumulado")
}
