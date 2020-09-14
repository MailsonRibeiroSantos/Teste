fun main() {
    var alturas = FloatArray(10)
    for (i in alturas.indices) {
        println("Digite a altura:")
        alturas[i] = readLine()!!.toFloat()
    }
    alturas.reverse()
    for (altura in alturas) {
        println("Altura  $altura")
    }
}