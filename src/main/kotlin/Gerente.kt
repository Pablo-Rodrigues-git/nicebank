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
        if (senha == 1234) {
            return true
        }
            return false
    }
}