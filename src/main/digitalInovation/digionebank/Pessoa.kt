package main.digitalInovation.digionebank

class Pessoa {

    public var nome: String = "Santiago"
    var cpf: String = "123.123.123-11"
}

fun main () {
    val santiago = Pessoa ()

    println(santiago.nome)
    println(santiago.cpf)
}