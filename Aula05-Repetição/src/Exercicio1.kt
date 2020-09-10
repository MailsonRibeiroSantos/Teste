import kotlin.math.max

fun main() {
    println("Digite número:")
    var numero = readLine()!!.toInt()
    var maximo = numero
    for ( i in 1..4) {
        println("Digite número:")
        var numero = readLine()!!.toInt()
        var max = max(maximo,numero)
    }
    println("O maior número é $maximo")
}