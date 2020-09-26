fun main(){

    println("Digite marca 1")
    var marca1: String = readLine()!!.toString()
    println("Digite modelo 1")
    var modelo1: String = readLine()!!.toString()
    println("Digite marca 1")
    var marca2 = readLine()!!.toString()
    println("Digite modelo 2")
    var modelo2 = readLine()!!.toString()
    var peca1 = Pertence(marca1,modelo1)
    var peca2 = Pertence(marca2,modelo2)
    var guardaVolume = GuardaVolume()
    var listaPeca = mutableListOf<Pertence>(peca1,peca2)
    guardaVolume.guardarPecas(listaPeca)
    guardaVolume.mostrarPecas()


}