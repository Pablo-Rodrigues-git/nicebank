class Gerentao(
    val nome: String,
    val cpf: String,
    val salario: Int
){
    fun bonificacao(){
        salario * 0.2
    }
}