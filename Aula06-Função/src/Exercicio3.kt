fun main(){
    println("Digite a taxa de imposto:")
    var taxaImposto = readLine()!!.toDouble()
    println("Digite o valor do produto:")
    var valor = readLine()!!.toDouble()

    var resultado = adicionaImposto(valor,taxaImposto)
    println("O valor do produto $resultado")

}
fun adicionaImposto(valor: Double, taxaImposto: Double): Double{
    return valor * 1 +(taxaImposto/100.0)
}
