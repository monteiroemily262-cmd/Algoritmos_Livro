fun main() {
    print("Digite o nome: ")
    val nome = readln()

    print("Digite o sexo (F/f): ")
    val sexo = readln()

    print("Digite a idade: ")
    val idade = readln().trim().toInt()

    if ((sexo == "F" || sexo == "f") && idade < 25) {
        println("$nome ACEITA")
    } else {
        println("$nome NÃO ACEITA")
    }
}
