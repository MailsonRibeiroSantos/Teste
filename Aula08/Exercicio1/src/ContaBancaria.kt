abstract class ContaBancaria(protected open val numeroConta:Int, protected var saldo:Double):Imprimivel {
    abstract fun sacar(quantia:Double) :Boolean
    abstract fun depositar(quantia:Double) :Boolean

     override fun mostrarDados() {
         println("-----------------------------------------")
         println("Informações Conta: ")
         println("Saldo $saldo")
         println("Número conta $numeroConta")
    }
    fun transferir(valor: Double, contaDestino: ContaBancaria) {
        val saldoContaOrigem = saldo
        if (!sacar(valor) || !contaDestino.depositar(valor)) {
            saldo = saldoContaOrigem
            println("Operação cancelada!!")
        }
    }


}