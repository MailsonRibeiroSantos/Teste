fun main(){
    println("Digite o número:")
    var numA = readLine()!!.toInt()
    println("Digite o número:")
    var numB = readLine()!!.toInt()
    println("Digite o número:")
    var numC = readLine()!!.toInt()
    println("Digite o número:")
    var numD = readLine()!!.toInt()
    println(verrificaNumero(numA,numB,numC,numD))

}
fun verrificaNumero(numA: Int,numB :Int,numC: Int,numD: Int):Boolean{
    if((numA> numC  && numA > numD) || (numB> numC  && numB > numD)){
        return true
    }
    return false
}