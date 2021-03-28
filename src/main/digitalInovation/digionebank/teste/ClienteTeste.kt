package main.digitalInovation.digionebank.teste

import main.digitalInovation.digionebank.Cliente
import main.digitalInovation.digionebank.ClienteTipo

fun main () {
    val jose = Cliente(nome = "José Amoedo", cpf = "321.321.321-65", clienteTipo = ClienteTipo.PF, senha = "123456")

    println(jose)

    AutenticacaoTeste().autentica(jose)

}