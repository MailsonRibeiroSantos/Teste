fun main(){
    var numeros = mutableSetOf<Int>(7,8,9,10,11,12,14)
    var prova = Prova()
    prova.somaTotal(numeros)
    numeros.forEach{
        println(it)
    }
}