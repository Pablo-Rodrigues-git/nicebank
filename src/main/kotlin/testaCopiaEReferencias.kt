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