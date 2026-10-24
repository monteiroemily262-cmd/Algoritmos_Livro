fun main() {
    print("Número de aulas dadas no mês: ")
    val numeroAulas = readln().trim().toInt()

    print("Valor da hora-aula: ")
    val valorHoraAula = readln().trim().replace(',', '.').toDouble()

    print("Percentual de desconto do INSS: ")
    val percentualDesconto = readln().trim().replace(',', '.').toDouble()

    val salarioBruto = numeroAulas * valorHoraAula
    val desconto = percentualDesconto / 100.0 * salarioBruto

    println("Salário líquido: ${salarioBruto - desconto}")
}
