class Funcionario (var nome:String, var numeroFuncionario:Int){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Funcionario

        if (numeroFuncionario != other.numeroFuncionario) return false

        return true
    }

    override fun hashCode(): Int {
        return numeroFuncionario
    }
}