fun main() {

    val titular = "Pablo Rodrigues"
    val numeroConta = 1000
    var saldo = 0.0
    saldo = 1000 + 0.2
    saldo = 0.0
    saldo = -1.1

//    if (saldo >= 0) {
//        if(saldo == 0.0){
//            println("Conta é neutra")
//
//        } else{
//            println("Conta é Positiva")
//        }
//    } else {
//        println("Conta é negativa ")
//    }

    when{
        saldo > 0.0 -> println("Conta é Positiva")
        saldo == 0.0 -> println("Conta é Neutra")
        saldo < 0.0 -> println("Conta é Negativa")
    }
}