fun main() {
    println("Digite o peso dos peixes::")
    var peso = readLine()!!.toDouble()
    val limite = 50
    var  excesso = peso - limite
    var multa = 4 * excesso

    println("Excedeu $excesso Kg")
    println("O Valor a ser pago é de R\$ $multa")
}