fun main() {
    println("Bem vindo ao Nice Bank!!!")
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