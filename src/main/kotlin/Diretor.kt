class Diretor(
    nome: String,
    salario: Double,
    cpf: String,
    val senha: Int,
    val plr: Double
) : Funcionario(nome = nome, salario = salario, cpf = cpf) {

    override fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autentica(senha: Int): Boolean {
        if (senha == 1337) {
            return true
        }
        return false
    }
}