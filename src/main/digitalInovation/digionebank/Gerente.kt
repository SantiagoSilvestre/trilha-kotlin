package main.digitalInovation.digionebank

class Gerente(nome: String, cpf: String, salario: Double, val senha: String) : Funcionario(nome, cpf, salario), Logavel {

    override fun calculoAuxilio(): Double = salario * 0.2
    override fun login(): Boolean = "Senha" == senha
}