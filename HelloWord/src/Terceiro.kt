fun main() {
    println("Digite uma distancia em metros:")
    var distanciaMetro = readLine()!!.toDouble()
    val multiplicadorCm = 100
    var resultado = distanciaMetro * multiplicadorCm
    println("Distância em centimetros  "+ resultado)

}