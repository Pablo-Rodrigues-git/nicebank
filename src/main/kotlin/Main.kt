fun main() {
    println("Bem vindo ao Nice Bank!!!")

    Conta() // Instância de uma classe

//    val contaPablo = Conta()  // Apontando para um objeto, o que me permite acessar e alterar os atributos dentro dele.
//    contaPablo.titular = "Pablao Mitico"
//    contaPablo.numero = 1000
//    contaPablo.saldo = 10000.0
//    println(contaPablo.titular)
//    println(contaPablo.numero)
//    println(contaPablo.saldo)
//
//    val contaMaria = Conta()
//    contaMaria.titular = "Maria Rafaela"
//    contaMaria.numero = 1001
//    contaMaria.saldo = 12000.0
//    println(contaMaria.titular)
//    println(contaMaria.numero)
//    println(contaMaria.saldo)

    val numeroX = 10 // criei uma variável e passei o numero 10 por parâmetro
    var numeroY = numeroX // criei uma segunda variável que recebe por parâmetro a variavel numeroX (anterior)
    numeroY++ // incerementei a variavel numeroY sem alterara o valor de numeroX

    println(numeroX)
    println(numeroY)

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaLacos() {
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