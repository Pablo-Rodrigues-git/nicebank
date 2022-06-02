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
    val Maria = Diretor(
        nome = "Maria",
        cpf = "333.333.333-33",
        salario = 5000.0,
        senha = 1337,
        plr = 1000.0
    )

    println("Nome: ${Pablo.nome}")
    println("Cpf: ${Pablo.cpf}")
    println("Salario: ${Pablo.salario}")
    println("Bonificação: ${Pablo.bonificacao()}")

    println("Nome: ${Valdirene.nome}")
    println("Cpf: ${Valdirene.cpf}")
    println("Salario: ${Valdirene.salario}")
    println("Bonificação: ${Valdirene.bonificacao()}")

    if (Valdirene.autentica(1234)){
        println("Autenticou com sucesso")
    } else {
        println("Autenticação Falhou")
    }

    println("Nome: ${Maria.nome}")
    println("Cpf: ${Maria.cpf}")
    println("Salario: ${Maria.salario}")
    println("Bonificação: ${Maria.bonificacao()}")
    println("Sua PLR: ${Maria.plr}")

    if (Maria.autentica(1337)){
        println("Autenticou com sucesso")
    } else {
        println("Autenticação Falhou")
    }

}
