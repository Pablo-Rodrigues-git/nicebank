class Gerente(
    val nome: String,
    val salario: Double,
    val cpf: String,
    val senha: Int
) {

    fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autentica(senha: Int): Boolean {
        if (senha == 1234) {
            return true
        }
            return false
    }
}