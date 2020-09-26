class Prova {
    fun somaTotal(conjuntoDeInteiros: MutableSet<Int>):Int{
        var total = 0
        conjuntoDeInteiros.forEach{
            total += it
        }
        return total
    }
}