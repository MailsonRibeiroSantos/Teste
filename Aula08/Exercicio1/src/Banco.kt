class Banco: Imprimivel {
    val contasBancaria: ArrayList<ContaBancaria> = ArrayList<ContaBancaria>()
    fun inserir(contaBancaria: ContaBancaria){
        contasBancaria.add(contaBancaria)
    }
    fun remover(contaBancaria: ContaBancaria) {
        contasBancaria.remove(contaBancaria)
    }
    fun procurarConta(numeroConta:Int):ContaBancaria?{
        if(numeroConta <= contasBancaria.size) {
            return contasBancaria[numeroConta-1]
        }
            return  null

    }

    override fun mostrarDados() {
        for( conta in contasBancaria){
            conta.mostrarDados()
        }
    }

}