fun main() {
    println("Bem vindo ao Nice Bank!!!")

    val Pablo = Funcionario(
        nome = "Pablo",
        cpf = "111.111.111.11.111",
        salario = 1000.0,
    )

    val Valdirene = Gerente(
        nome = "Valdirene",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome: ${Pablo.nome}")
    println("Cpf: ${Pablo.cpf}")
    println("Salario: ${Pablo.salario}")
    println("Bonificação: ${Pablo.bonificacao()}")

    println("Nome: ${Valdirene.nome}")
    println("Cpf: ${Valdirene.cpf}")
    println("Salario: ${Valdirene.salario}")
    println("Bonificação: ${Valdirene.bonificacao()}")
    println("Autenticado com sucesso ${Valdirene.autentica(1235)}")

    if (Valdirene.autentica(1235)){
        println("Autenticou com sucesso")
    } else {
        println("Autenticação Falhou")
    }

}
