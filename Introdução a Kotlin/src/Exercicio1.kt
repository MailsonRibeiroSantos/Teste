import kotlin.math.max

fun main(){
    println("Digite primeiro número:")
    var num1 = readLine()!!.toInt()
    println("Digite segundo número:")
    var num2 = readLine()!!.toInt()
    println("Digite terceiro número:")
    var num3 = readLine()!!.toInt()
    var maximo = max(max(num1,num2),num3)
    println("O valor máximo é $maximo")
}