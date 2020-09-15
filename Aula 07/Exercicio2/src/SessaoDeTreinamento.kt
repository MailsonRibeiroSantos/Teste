class SessaoDeTreinamento(var experiencia: Int) {

    fun treinarA(jogador: JogadorDeFutebol){
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("Experiencia Inicial ${jogador.experiencia}")
        jogador.experiencia  += experiencia
        println("Experiencia Final ${jogador.experiencia}")
    }
}