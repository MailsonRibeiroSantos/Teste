class Fatura {
    private var itens:ArrayList<Item> = ArrayList<Item>()
    fun adicionarItens(item: Item){
        itens.add(item)
    }
    fun removerItens(item: Item){
        itens.remove(item)
    }
    fun getTotalFatura():Double{
        var total = 0.0
        for (item in itens){
            total += item.quantidade * item.preco
        }
        return total
    }
}