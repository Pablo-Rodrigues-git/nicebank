fun testaComportamentosConta() {
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
