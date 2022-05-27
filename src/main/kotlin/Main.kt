fun main() {
    println("Bem vindo ao Nice Bank!!!")

    val alex = Funcionario(
        nome = "Alex", // properties
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao()}")
}

