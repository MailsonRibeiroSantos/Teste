fun main(){
    println("Digite o primeiro número:")
    var num1 = readLine()!!.toInt()

    var resultado = verrifica(num1)
    println("Resultado $resultado")

}
fun verrifica(num1: Int): String{
    if(num1>0){
        return "P"
    }
    return "N"
}
