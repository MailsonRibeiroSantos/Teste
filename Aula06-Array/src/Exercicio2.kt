fun main() {
    var numeros = IntArray(10)
    for (i in 0..(numeros.size - 1)) {
        println("Digite o número $i")
        numeros[i] = readLine()!!.toInt()
    }
    numeros.reverse()
    for (numero in numeros) {
        println(numero)
    }
}