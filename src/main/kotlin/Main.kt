fun main() {
    println("Bem vindo ao Nice Bank!!!")

    val Pablo = Funcionario(
        nome = "Pablo",
        cpf = "111.111.111.11.111",
        salario = 1000.0,
        tipo = 0
    )

    val Valdirene = Funcionario(
        nome = "Valdirene",
        cpf = "222.222.222-22",
        salario = 5000.0,
        tipo = 1
    )

    println("Nome: ${Pablo.nome}")
    println("Cpf: ${Pablo.cpf}")
    println("Salario: ${Pablo.salario}")
    println("Bonificação: ${Pablo.bonificacao()}")

    println("Nome ${Valdirene.nome}")
    println("Cpf ${Valdirene.cpf}")
    println("Salario ${Valdirene.salario}")
    println("Bonificação ${Valdirene.bonificacao()}")
}