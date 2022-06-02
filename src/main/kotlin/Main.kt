fun main() {
    println("Bem vindo ao Nice Bank!!!")

    val pablo = Funcionario(
        nome = "Pablo",
        cpf = "111.111.111.11.111",
        salario = 1000.0,
    )

    val valdirene = Gerente(
        nome = "Valdirene",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    val maria = Diretor(
        nome = "Maria",
        cpf = "333.333.333-33",
        salario = 5000.0,
        senha = 1337,
        plr = 1000.0
    )
    val ceo = CEO.newInstance()

    val gerente = Gerente.newInstance()



    println("Nome: ${gerente.nome}")
    println("Cpf: ${gerente.cpf}")
    println("Salario: ${gerente.salario}")
    println("Bonificação: ${gerente.bonificacao()}")

    if (gerente.autentica(5678)){
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    println("Nome: ${pablo.nome}")
    println("Cpf: ${pablo.cpf}")
    println("Salario: ${pablo.salario}")
    println("Bonificação: ${pablo.bonificacao()}")

    println("Nome: ${valdirene.nome}")
    println("Cpf: ${valdirene.cpf}")
    println("Salario: ${valdirene.salario}")
    println("Bonificação: ${valdirene.bonificacao()}")

    if (valdirene.autentica(1234)){
        println("Autenticou com sucesso")
    } else {
        println("Autenticação Falhou")
    }

    println("Nome: ${maria.nome}")
    println("Cpf: ${maria.cpf}")
    println("Salario: ${maria.salario}")
    println("Bonificação: ${maria.bonificacao()}")
    println("Sua PLR: ${maria.plr}")

    if (maria.autentica(1337)){
        println("Autenticou com sucesso")
    } else {
        println("Autenticação Falhou")
    }

    println("Nome: ${ceo.nome}")
    println("Cpf: ${ceo.cpf}")
    println("Salario: ${ceo.salario}")
    println("Bonificação: ${ceo.bonificacao()}")
    println("Sua PLR: ${ceo.plr}")

    if (ceo.autentica(1337)){
        println("Autenticou com sucesso")
    } else {
        println("Autenticação falhou")
    }

}
