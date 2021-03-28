package main.digitalInovation.digionebank.teste

import main.digitalInovation.digionebank.Analista
import main.digitalInovation.digionebank.Funcionario
import main.digitalInovation.digionebank.Gerente
import java.math.BigDecimal

fun main () {
    val lucia = Gerente (nome = "Lúcia José", cpf = "123.123.123-12", salario = 4041.25, "Senha" )
    ImprimeRelFuncionario.imprime(lucia)

    AutenticacaoTeste().autentica(lucia)

}