fun main() {
    println("Bem vindo ao Nice Bank!!!")

    val contaPablo = Conta(titular = "Pablo Rodrigues", numero = 1000)
    contaPablo.deposita(100.0)


    val contaMaria = Conta(numero = 1001, titular = "Maria Rafaela")
    contaMaria.deposita(100.0)

    println(contaMaria.titular)
    println(contaMaria.numero)
    println(contaMaria.saldo)

    println(contaPablo.titular)
    println(contaPablo.numero)
    println(contaPablo.saldo)


    // deposito
    println("Depositando na conta do Pablo")
    contaPablo.deposita(100.0)
    println(contaPablo.saldo)

    println("Depositando na conta da Maria")
    contaMaria.deposita(100.0)
    println(contaMaria.saldo)

    // saque
    println("Sacando na conta do Pablo")
    contaPablo.saca(50.0)
    println("Saldo atual: ${contaPablo.saldo}")

    println("Sacando na conta da Maria")
    contaMaria.saca(50.0)
    println("Saldo atual: ${contaMaria.saldo}")

    println("transferência da conta do Pablo para Maria")
    if (contaPablo.transfere(100.0, contaMaria)) {
        println("Transferencia realizada com sucesso")
    } else {
        println("Falha na transferência")
    }
    println(contaPablo.saldo)
    println(contaMaria.saldo)

}

class Conta(
    var titular: String,
    var numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}


fun testaCopiaEReferencias() {

    val numeroX = 10
    var numeroY = numeroX // criei uma segunda variável que recebe por parâmetro a variavel numeroX (anterior)
    numeroY++ // incrementei a variavel numeroY sem alterar o valor de numeroX

    println(numeroX)
    println(numeroY)

    /* o numeroX não é alterado porque isso acontece?
    quando instancio uma referencia de variavel primitiva,(Float, Int, Double ETC)
    estou enviando apenas uma cópia da mesma e não uma referência da mesma.
     */


    val contaLucas = Conta("Lucas", 1002)
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