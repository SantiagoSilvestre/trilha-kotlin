package main.digitalInovation.digionebank.teste

import main.digitalInovation.digionebank.Banco

fun main () {
    val digiOneBank = Banco(nome ="Digione", numero =147)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy("DigiTwo")

    println(banco2.info())

}