fun main() {
    println("Quanto ganha por hora:")
    var valorHora = readLine()!!.toDouble()
    println("Quantas horas trabalha por mês:")
    var numeroHora = readLine()!!.toInt()

    var salarioBruto = valorHora * numeroHora
    var descontoINSS = 0.08 * salarioBruto
    var descontoIR = 0.11 * salarioBruto
    var descontoSindicato = 0.05 * salarioBruto
    var descontoTotal = descontoINSS + descontoIR + descontoSindicato
    var salarioLiquido = salarioBruto - descontoTotal
    println("+ Salário Bruto: R\$ $salarioBruto")
    println("- IR: R\$ $descontoIR")
    println("- INSS: R\$ $descontoINSS")
    println("- Sindicato: R\$ $descontoSindicato")
    println("= Salário Líquido: R\$ $salarioLiquido")


}