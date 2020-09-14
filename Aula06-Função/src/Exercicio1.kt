fun main(){
    println("Digite o primeiro número:")
    var num1 = readLine()!!.toInt()
    println("Digite o segundo número:")
    var num2 = readLine()!!.toInt()
    println("Digite o terceiro número:")
    var num3 = readLine()!!.toInt()
    var resultado = soma(num1, num2, num3)
    println("Resultado $resultado")

}
fun soma(num1: Int, num2: Int, num3: Int): Int{
    return num1 + num2 + num3
}
