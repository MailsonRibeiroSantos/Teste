class Item (var numero:Int, var descricao:String, var quantidade:Int, var preco:Double){
    init {
        if(quantidade<0)
        {
            quantidade =0
        }
        if (preco<0.0){
            preco = 0.0
        }
    }

}