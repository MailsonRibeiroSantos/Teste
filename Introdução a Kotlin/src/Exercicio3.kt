fun main(){
    println("Digite um número:")
    var num = readLine()!!.toInt()
    println(ehPar(num))
}
fun ehPar(num :Int):Boolean{
    if(num % 2 == 0){
        return true
    }
    return false
}