fun main() {
    println("Digite o sexo:")
    var sexo = readLine()!!.toUpperCase()
    if(sexo.equals("M")){
        print("M - Masculino")
    }else if(sexo.equals("F"))
    {
        print("F - Feminino")
    } else {
        println("Sexo inválido")
    }
}