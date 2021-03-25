package main.digitalInovation.digionebank

class Pessoa {

    var nome: String = "Santiago"
    var cpf: String = "123.123.123-11"
    private set

}

fun main () {
    val santiago = Pessoa ()
    println(santiago)
    println(santiago.nome)
    println(santiago.cpf)
}