fun main() {
    var pontos = arrayOf(0, 0, 0, 0, 0, 0)
    var sistemas = arrayOf("Windows Server", "Unix", "Linux", "Netware", "Mac OS", " Outro")
    var total = 0
    var maisVotado = 0
    var indiceMaisVotado = 0
    do {
        print("Qual o melhor Sistema Operacional para uso em servidores?")
        println("As possíveis respostas são:")
        println("1- Windows Server")
        println("2- Unix  ")
        println("3- Linux")
        println("4- Netware")
        println("5- Mac OS")
        println("6- Outro")
        val voto = readLine()!!.toInt()

        if (voto == 0) {
            break
        } else if (voto > 6 || voto < 0) {
            println("Voto inválido!")
        } else {
            pontos[voto - 1] = pontos[voto - 1] + 1
        }
    } while (true)
    maisVotado = pontos[0]
    for (i in pontos.indices) {
        total = total + pontos[i]
        if (pontos[i] > maisVotado) {
            maisVotado = pontos[i]
            indiceMaisVotado = i
        }
    }

    for (i in pontos.indices) {
        println("O ${sistemas[i]} teve  ${pontos[i]} pontos e percentual igual " + 100 * (pontos[i].toDouble() / total.toDouble()))
    }
    println("O Sistema Operacional mais votado foi o ${sistemas[indiceMaisVotado]}, com  ${pontos[indiceMaisVotado]} votos correspondendo a " + 100 * (pontos[indiceMaisVotado].toDouble() / total.toDouble()) + "% dos votos")
    println("Total de votos: $total")
}