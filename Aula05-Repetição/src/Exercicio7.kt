fun main() {
    println("Digite um  número:")
    var numero = readLine()!!.toInt()

    for ( i in 1..10) {
        println("$numero X $i = "+(numero*i))
    }
}