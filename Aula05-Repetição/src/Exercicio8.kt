fun main() {
    var totalUsuarios = 0
    var totalPeso = 0.0
    var totalAltura = 0.0
    var maiorPeso = 0.0
    var maiorAltura = 0.0
    var codigoMaiorPeso = 0
    var codigoMaiorAltura = 0
    var menorPeso = 0.0
    var menorAltura = 0.0
    var codigoMenorPeso = 0
    var codigoMenorAltura = 0
    var mediaAltura = 0.0
    var mediaPeso =  0.0

    do {
        println("Digite o seu código: ")
        var codigo = readLine()!!.toInt()
        if (codigo == 0) {
            break
        }
        println("Digite o seu peso:")
        var peso = readLine()!!.toDouble()
        println("Digite sua altura")
        var altura = readLine()!!.toDouble()

        if(totalUsuarios  == 0){
            menorAltura = altura
            menorPeso = peso
        }

        totalAltura += altura
        totalPeso += peso
        if(peso > maiorPeso){
            maiorPeso = peso
            codigoMaiorPeso = codigo
        }
        if(altura > maiorAltura){
            maiorAltura = altura
            codigoMaiorAltura = codigo
        }
        if(peso <= menorPeso){
            menorPeso = peso
            codigoMenorPeso = codigo
        }
        if(altura <= menorAltura){
            menorAltura = altura
            codigoMenorAltura = codigo
        }

        totalUsuarios +=1

    } while (true)
    mediaAltura = totalAltura/totalUsuarios
    mediaPeso = totalPeso/totalUsuarios
    println("O usuario $codigoMaiorPeso é o mais gordo com peso $maiorPeso")
    println("O usuario $codigoMaiorAltura é o mais alto com altura $maiorAltura")
    println("O usuario $codigoMenorPeso é o mais magro com peso $menorPeso")
    println("O usuario $codigoMenorAltura é o menor com altura $menorAltura")
    println("O valor médio das alturas  é $mediaAltura")
    println("O valor médio  dos pesos é $mediaPeso")
}