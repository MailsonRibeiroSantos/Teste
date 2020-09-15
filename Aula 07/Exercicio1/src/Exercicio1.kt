fun main(){
    var cliente1:Cliente = Cliente("Mailson", "Ribeiro")
    var cliente2:Cliente = Cliente("Carlos", "Santos")
    var conta1: Conta = Conta(2,14.5,cliente1)
    var conta2: Conta = Conta(2,200.0,cliente2)
    conta1.saque(200.0)
    conta1.deposito(500.0)
    conta1.saque(200.0)
    conta2.deposito(100.0)
    conta2.saque(50.0)

    println("Número conta ${conta1.numeroConta} saldo ${conta1.saldo}, cliente: ${conta1.titular.nome} ${conta1.titular.sobreNome}")
    println("Número conta ${conta2.numeroConta} saldo ${conta2.saldo}, cliente: ${conta2.titular.nome} ${conta2.titular.sobreNome}")
}