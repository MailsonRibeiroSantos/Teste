class Concessionaria  {
        var veiculo: Veiculo? = null
        var cliente: Cliente? = null
        var valor: Double = 0.0

   fun registrarVenda( veiculo: Veiculo, cliente: Cliente, valor: Double){
       this.veiculo = veiculo
       this.cliente = cliente
       this.valor = valor
    }
}