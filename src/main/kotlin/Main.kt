fun main() {
    println("Bem vindo ao Nice Bank!!!")

    val contaPablo = Conta()  // Apontando para um objeto, o que me permite acessar e alterar os atributos dentro dele.
    contaPablo.titular = "Pablao Mitico"
    contaPablo.numero = 1000
    contaPablo.saldo = 1000.0


    val contaMaria = Conta()
    contaMaria.titular = "Maria Rafaela"
    contaMaria.numero = 1001
    contaMaria.saldo = 1000.0

    println(contaMaria.titular)
    println(contaMaria.numero)

    println(contaPablo.titular)
    println(contaPablo.numero)

    println("Depositando na conta da Maria")
    deposita(contaMaria, 50.0)
    println(contaMaria.saldo)

    println("Depositando na conta do Pablo")
    deposita(contaPablo, 100.0)
    println(contaPablo.saldo)

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun deposita (conta: Conta, valor: Double){ // criado a função, espera uma conta : Conta e espera um valor : Double

    conta.saldo += valor // estou dizendo que conta.saldo incrementa o valor que é double

}

fun testaCopiaEReferencias(){

    Conta() // Instância de uma classe Conta()

    val numeroX = 10
    var numeroY = numeroX // criei uma segunda variável que recebe por parâmetro a variavel numeroX (anterior)
    numeroY++ // incrementei a variavel numeroY sem alterar o valor de numeroX

    println(numeroX)
    println(numeroY)

    /* o numeroX não é alterado porque isso acontece?
    quando instancio uma referencia de variavel primitiva,(Float, Int, Double ETC)
    estou enviando apenas uma cópia da mesma e não uma referência da mesma.
     */


    val contaLucas = Conta()
    contaLucas.titular = "Lucas"
    var contaCarol = contaLucas
    contaCarol.titular = "Carol"

    println("titular conta Lucas: ${contaLucas.titular}")
    println("titular conta Lucas: ${contaCarol.titular}")

    println(contaLucas) // a hash gerada é alterada quando mudamos o objeto
    println(contaCarol)

    /* A contaLucas é alterada, porque isso acontece?
    quando instancio uma referência de objeto, ao assinar um novo valor o mesmo também é alterado
     */
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