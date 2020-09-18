class Concessionaria  {

    val registroVendas: ArrayList<Venda> = ArrayList<Venda>()

   fun registrarVenda( veiculo: Veiculo, cliente: Cliente, valor: Double){
        var venda = Venda(cliente,veiculo,valor)
        registroVendas.add(venda)
    }
}