fun main(){
    var cliente1:Cliente = Cliente("Mailson", "Ribeiro")
    var cliente2:Cliente = Cliente("Carlos", "Santos")
    var conta1: Conta = Conta(2,14.5,cliente1)
    var conta2: Conta = Conta(2,200.0,cliente2)
    conta1.sacar(200.0)
    conta1.depositar(500.0)
    conta1.sacar(200.0)
    conta2.depositar(100.0)
    conta2.sacar(50.0)

    println("Número conta ${conta1.numeroConta} saldo ${conta1.saldo}, cliente: ${conta1.titular.nome} ${conta1.titular.sobreNome}")
    println("Número conta ${conta2.numeroConta} saldo ${conta2.saldo}, cliente: ${conta2.titular.nome} ${conta2.titular.sobreNome}")
}