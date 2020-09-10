fun main(){
    println("Telefonou para a vítima?")
    var resp1 = readLine()
    println("Esteve no local do crime?")
    var resp2 = readLine()
    println("Mora perto da vítima?")
    var resp3 = readLine()
    println("Devia para a vítima?")
    var resp4 = readLine()
    println("Já trabalhou com a vítima? ")
    var resp5 = readLine()
    var respPositiva = 0
    if(resp1.equals("S"))
    {
        respPositiva += 1
    }
    if(resp2.equals("S"))
    {
        respPositiva += 1
    }
    if(resp3.equals("S"))
    {
        respPositiva += 1
    }
    if(resp4.equals("S"))
    {
        respPositiva += 1
    }
    if(resp5.equals("S"))
    {
        respPositiva += 1
    }
    if( respPositiva == 5){
        print("Cúmplice")
    }else if(respPositiva in 3..4){
        print("Cúmplice")
    }else if( respPositiva == 2){
        print("Suspeita")
    }else{
        print("Inocente")
    }
}
