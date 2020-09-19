import kotlin.math.max

class Estoque(var nome:String, var  qtdAtual: Int, var qtdMinima: Int) {
     fun mudarNome( nome :String) {
         this.nome = nome
     }

    fun mudarQtdMinima(qtdMinima:Int){
        this.qtdMinima = max(0,qtdMinima)
    }

    fun repor(qtd:Int){
    qtdAtual += qtd
    }

    fun darBaixa(qtd: Int) {
        if(qtdAtual - qtd>0 ) {
            qtdAtual -= qtd
        }else{
            println("Estoque insuficiente!!")
        }

    }

    fun  mostra() : String{
    return "Nome $nome, quatidade $qtdAtual e quantidade minima $qtdMinima "
    }

    fun  precisaRepor(): Boolean{
        return qtdAtual <= qtdMinima

    }
}