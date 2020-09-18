fun main(){
    var cliente:Cliente = Cliente("Mailson","Ribeiro","83456298")
    var veiculo:Veiculo = Veiculo("Ford","Uno",2015,"preto",2030)
    var concessionaria:Concessionaria = Concessionaria()
    concessionaria.registrarVenda(veiculo,cliente,15000.0)
    println("Cliente ${concessionaria.registroVendas[0].cliente.nome} comprou um ${concessionaria.registroVendas[0].veiculo.modelo} ")

}