class ContaPoupanca(private val limiteCredito: Double, numeroConta: Int, saldo: Double) :
    ContaBancaria(numeroConta, saldo) {

    override fun sacar(quantia: Double):Boolean {
        if ((saldo + limiteCredito) >= quantia) {
            saldo -= quantia
            println("Saque realizado com sucesso!!")
            return true
        } else {
            println("Saldo Insuficiente")
            return false
        }
    }

    override fun depositar(quantia: Double):Boolean {
        saldo += quantia
        println("Deposito realizado com sucesso!!")
        return true
    }



    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite $limiteCredito")
        println("\n\n\n")
    }

}