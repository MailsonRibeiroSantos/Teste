fun main(){
    var item1 = Item(1,"mouse",2,40.5)
    var item2 = Item(2,"fone",1,50.0)
    var fatura = Fatura()
    fatura.adicionarItens(item1)
    fatura.adicionarItens(item2)
    println("Total fatura ${fatura.getTotalFatura()}")
}