fun main() {
    println("Digite a altura:")
    var altura = readLine()!!.toDouble()
    var pesoH =( 72.7 * altura) -58
    var pesoM =( 62.1 * altura) -44.7

    println("Para homens: $pesoH")
    println("Para mulheres: $pesoM")
}