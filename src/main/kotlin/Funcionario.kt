class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val cargo: Int,
) {
    fun bonificacao(): Double {
        return when (cargo) {
            0 -> return salario * 0.1

            1 -> return salario * 0.2

            else -> salario * 0.3
        }
    }
}
