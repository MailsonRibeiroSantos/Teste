fun main(){
    var calculoMatematico = CalculoMatematico()
    try {
        calculoMatematico.divisao(4, 0)
    }catch (ex:ArithmeticException ){
        println(ex.message)
    }
}