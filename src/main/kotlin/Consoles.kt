

fun main(){
    val sony = "Playstation"
    var notaSony = 6

    val microsoft = "Xbox"
    var notaXbox = 9

    val nintendo = "Switch"
    var notaNintendo = 8

    val myCompany = "NiceGame"
    var notaMyCompany = 7

    when{
        notaSony >= 10 -> println("$sony esta acima de 10")
        notaSony < 10 -> println("$sony esta abaixo de 10")

        notaXbox <= 10 -> println("$microsoft esta abaixo de 10")
        notaXbox >= 10 -> println("$microsoft xbox esta acima do Playstation")

        notaNintendo == 10 -> println("$nintendo esta na disputa do topo")
        notaNintendo <= 10 -> println("$nintendo esta na segunda disputa")

        notaMyCompany >= 10 -> println("$myCompany esta vencendo de marcas maiores")
        notaMyCompany <= 10 -> println("$myCompany esta perdendo, mas esta entre os maiores")
    }
}