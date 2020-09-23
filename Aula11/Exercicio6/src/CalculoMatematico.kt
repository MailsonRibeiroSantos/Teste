class CalculoMatematico {

    fun divisao(numero1:Int, numero2:Int ):Int
    {
        if(numero2 == 0){
            throw  ArithmeticException("Não é pssível fazer divisão por zerro")
        }
        else {
            return numero1 / numero2
        }
    }

}