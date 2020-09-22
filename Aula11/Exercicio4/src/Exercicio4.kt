fun main(){
    var funcionarios = ArrayList<Funcionario>()
    var funcionario1 = Funcionario("Mailson", 12)
    var funcionario2 = Funcionario("Mailson", 13)
    var funcionario3 = Funcionario("Mailson", 14)
    var funcionario4 = Funcionario("Mailson", 15)
    funcionarios.add(funcionario1)
    funcionarios.add(funcionario2)
    funcionarios.add(funcionario3)
    funcionarios.add(funcionario4)
    var novoFuncionario =  Funcionario("Mailson", 15)
    println(funcionarios.contains(novoFuncionario))

}