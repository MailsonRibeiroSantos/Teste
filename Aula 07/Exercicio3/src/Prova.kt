class Prova(var dificuldade:Int,var energiaNecessaria: Int){
    fun realizarProva(atleta: Atleta): Boolean {
        if(atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria){
            atleta.energia -= energiaNecessaria
            return  true
        }
        return false
    }
}
