fun main() {
    println("Digite o  número de notas:")
    var numeroNotas = readLine()!!.toInt()
    var soma = 0.0
    var media = 0.0
    for ( i in 1..numeroNotas) {
        println("Digite $i nota:")
        var nota = readLine()!!.toDouble()
        soma += nota
    }
    media = soma/numeroNotas
    println("A média é igual a $media")
}