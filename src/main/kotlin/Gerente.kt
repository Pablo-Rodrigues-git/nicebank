class Gerente(
     nome: String,
     salario: Double,
     cpf: String,
    val senha: Int,
): Funcionario(nome = nome, salario = salario, cpf = cpf) {

    override fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autentica(senha: Int): Boolean {
        if (senha == this.senha) {
            return true
        }
            return false
    }

    companion object {
        fun newInstance(): Gerente {
            return Gerente(
                nome = "Luca",
                salario = 5000.0,
                cpf = "XXX.XXX.XXX-XX",
                senha = 5678,
            )
        }
    }
}