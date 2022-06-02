class Founder(
    nome: String,
    salario: Double,
    cpf: String,
    val senha: Int,
    val plr: Double
) : Funcionario(nome = nome, salario = salario, cpf = cpf) {

    override fun bonificacao(): Double {
        return salario * 0.5
    }

    fun autentica(senha: Int): Boolean {
        if (senha == 1337) {
            return true
        }
        return false
    }

    companion object {
        fun newInstance(): Founder {
            return Founder(
                nome = "Abner",
                salario = 120000.0,
                cpf = "XXX.XXX.XXX-XX",
                senha = 1234, plr = 200.0
            )
        }
    }
}
