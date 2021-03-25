package main.digitalInovation.digionebank

class Pessoa {

    var nome: String = "Santiago"
    var cpf: String = "123.123.123-11"


    inner class Endereco {
        var rua: String = "Rua teste"
    }
}

fun main () {
    val santiago = Pessoa ()

    println(santiago.nome)
    println(santiago.cpf)
    println(santiago.Endereco().rua)
}