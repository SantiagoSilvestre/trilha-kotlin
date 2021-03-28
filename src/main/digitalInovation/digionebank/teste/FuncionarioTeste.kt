package main.digitalInovation.digionebank.teste

import main.digitalInovation.digionebank.Funcionario
import java.math.BigDecimal

fun main () {
    val funcionario = Funcionario (nome = "ZÉZÉ", cpf = "123.123.123-12", salario = BigDecimal.valueOf(2000.00))
    println(funcionario.nome)
    println(funcionario.cpf)
    println(funcionario.salario)
}