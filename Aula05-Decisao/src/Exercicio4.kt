fun main(){
    print("Digite o valor do saque: ")
    val valorSaque = readLine()!!.toInt()

    var notas100 = 0
    var notas50 = 0
    var notas10 = 0
    var notas5 = 0
    var notas1 = 0
    var valorRestante = 0

    if(valorSaque >= 10 && valorSaque <= 600){
        notas100 = valorSaque / 100
        println("notas de 100: $notas100")
        valorRestante = valorSaque % 100
        if(valorRestante != 0){
            notas50 = valorRestante / 50
            println("notas de 50: $notas50")
            valorRestante = valorRestante % 50
        }
        if(valorRestante != 0){
            notas10 = valorRestante / 10
            println("notas de 10: $notas10")
            valorRestante = valorRestante % 10
        }
        if(valorRestante != 0){
            notas5 = valorRestante / 5
            println("notas de 5: $notas5")
            valorRestante = valorRestante % 5
        }
        if(valorRestante != 0){
            notas1 = valorRestante / 1
            println("notas de 1: $notas1")
        }
    }
}
