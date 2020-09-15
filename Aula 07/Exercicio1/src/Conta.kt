class Conta (val numeroConta:Int,var saldo: Double,val titular: Cliente) {
    fun deposito(valor: Double){
        saldo += valor
        println("Deposito, valor atualizado "+saldo)
    }
    fun saque(valor: Double){
        if(saldo >= valor){
            saldo -= valor
            println("Saque, valor atualizado "+saldo)
        }else{
            println("Saldo Insuficiente")
        }
    }
}