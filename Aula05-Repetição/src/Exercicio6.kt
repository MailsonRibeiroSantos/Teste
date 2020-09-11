fun main() {
    println("Digite o  número de CDs:")
    var numeroCD = readLine()!!.toInt()
    var total = 0.0
    var media = 0.0
    for ( i in 1..numeroCD) {
        println("Digite o valor do $i $° CD:")
        var nota = readLine()!!.toDouble()
        total += nota
    }
    media = total/numeroCD
    println("O valor médio dos CDs é  $media")
    println("O valor total investido é  $total")
}