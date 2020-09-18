class  ContaCorrente(val taxaDeOperacao:Double, numeroConta:Int, saldo:Double):ContaBancaria(numeroConta,saldo){

    override fun sacar(quantia: Double) : Boolean {
        if(saldo >= (quantia+taxaDeOperacao)) {
            saldo -= taxaDeOperacao
            saldo -= quantia
            println("Saque realizado com sucesso!!")
            return true
        }else{
            println("Saldo Insuficiente!!")
            return false
        }
    }

    override fun depositar(quantia: Double):Boolean {
        if((saldo+quantia)>=taxaDeOperacao) {
            saldo -= taxaDeOperacao
            saldo += quantia
            println("Deposito realizado com sucesso!!")
            return true
        }else
        {
            println("Deposito não possível!!")
            return false
        }
    }



    override fun mostrarDados() {
        super.mostrarDados()
        println("Taxa de operação $taxaDeOperacao")
        println("\n\n\n")
    }

}