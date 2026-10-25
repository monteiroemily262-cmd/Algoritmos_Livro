fun main() {
    println("*************")
    println("* CALCULADORA *")
    println("*************")
    println("+ para somar")
    println("- para subtrair")
    println("* para multiplicar")
    println("/ para dividir")

    print("Digite a opção: ")
    val opcao = readln()

    if (opcao !in listOf("+", "-", "*", "/")) {
        println("OPÇÃO NÃO DISPONÍVEL!")
        return
    }

    print("Digite o primeiro número: ")
    val a = readln().trim().replace(',', '.').toDouble()

    print("Digite o segundo número: ")
    val b = readln().trim().replace(',', '.').toDouble()

    when (opcao) {
        "+" -> println("SOMA: ${a + b}")
        "-" -> println("SUBTRAÇÃO: ${a - b}")
        "*" -> println("MULTIPLICAÇÃO: ${a * b}")
        "/" -> {
            if (b == 0.0) {
                println("Não é possível dividir por zero.")
            } else {
                println("DIVISÃO: ${a / b}")
            }
        }
    }
}
