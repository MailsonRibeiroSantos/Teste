fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toInt()

    if (numero % 2 == 0) {
        println("par")
    } else {
        println("ímpar")
    }
}
