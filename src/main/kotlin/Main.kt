fun main() {
    println("Bem vindo ao Nice Bank!!!")
    Conta() // Instância de uma classe
    val conta = Conta()  // Apontando para um objeto, o que me permite alterar os atributos dentro dele.
    conta.titular = "Pablao Mitico"
    println(conta.titular)

    }

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaLacos(){
    var i = 0
    while (i < 5) {

        val titular = "Pablo Rodrigues $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0


        println("Titular $titular")
        println("Numero da Conta $numeroConta")
        println("Saldo R$ $saldo")
        println()
        i++

    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo >= 0) {
        if (saldo == 0.0) {
            println("Conta é neutra")

        } else {
            println("Conta é Positiva")
        }
    } else {
        println("Conta é negativa ")
    }


}