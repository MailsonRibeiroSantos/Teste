class Carro(val consumo: Double) {
    var nivelCombustivel: Double = 0.0

    fun andar(quilometro: Double){
        nivelCombustivel = nivelCombustivel - (quilometro/this.consumo)
    }
    fun obterGasolina(){
        println("O nível de combustível é igual ${nivelCombustivel}")
    }
    fun adicionarGasolina(  quantidade:Double ){
        nivelCombustivel += quantidade
    }
}
