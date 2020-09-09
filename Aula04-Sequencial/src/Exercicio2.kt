fun main() {
    println("Quanto vale sua hora?")
    var valorHora = readLine()!!.toDouble()
    println("Quantas horas você trabalhou?")
    var numeroHora = readLine()!!.toInt()
    var salario = valorHora * numeroHora
    println("Você receberá R\$ $salario")
}