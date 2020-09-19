fun main(){
    var estoque = Estoque("Teclado",45,10)
    estoque.darBaixa(30)
    println(estoque.mostra())
    estoque.darBaixa(25)
    println(estoque.mostra())
    estoque.darBaixa(12)
    println(estoque.mostra())
    println(estoque.precisaRepor())
    estoque.repor(50)
    println(estoque.precisaRepor())
    println(estoque.mostra())
}