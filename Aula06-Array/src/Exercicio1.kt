fun main() {
    var numeros = IntArray(5)
    for (i in 0..(numeros.size - 1)) {
        println("Digite o número $i")
        numeros[i] = readLine()!!.toInt()
    }
    for (numero in numeros) {
        println(numero)
    }
}