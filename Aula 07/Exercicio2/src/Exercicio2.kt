fun main(){
    var sessaoDeTreinamento1: SessaoDeTreinamento = SessaoDeTreinamento(5)
    var sessaoDeTreinamento2: SessaoDeTreinamento = SessaoDeTreinamento(8)
    var jogadorDeFutebol1: JogadorDeFutebol = JogadorDeFutebol("Mailson",40,20,0,80)
    var jogadorDeFutebol2: JogadorDeFutebol = JogadorDeFutebol("Caio",20,30,0,40)
    sessaoDeTreinamento1.treinarA(jogadorDeFutebol1)
    sessaoDeTreinamento2.treinarA(jogadorDeFutebol2)
    println("${jogadorDeFutebol1.nome} ${jogadorDeFutebol1.energia} ${jogadorDeFutebol1.alegria} ${jogadorDeFutebol1.gols}" +
            " ${jogadorDeFutebol1.experiencia}")
    println("${jogadorDeFutebol2.nome} ${jogadorDeFutebol2.energia} ${jogadorDeFutebol2.alegria} ${jogadorDeFutebol2.gols}" +
            " ${jogadorDeFutebol2.experiencia}")
}