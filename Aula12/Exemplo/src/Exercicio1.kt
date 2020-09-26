fun main(){
    val estado1 = Estado("RN","Rio Grande do Norte")
    val estado2 = Estado("SP","São Paulo")
    val estado3 = Estado("PE","Pernanbuco")
    val estado4 = Estado("CE","Ceara")
    val pessoa1 = Pessoa("Mailson",estado1)
    val pessoa2 = Pessoa("Caio",estado1)
    val pessoa3 = Pessoa("Felipe",estado2)
    val pessoa4 = Pessoa("Grabriel",estado2)
    val pessoa5 = Pessoa("Carlos",estado3)
    val pessoa6 = Pessoa("Elias",estado4)
    var pessoaAgrupadas = mutableMapOf<String,MutableList<Pessoa>>()
    var pessoas = listOf<Pessoa>(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6)
    pessoas.forEach {
        if(! pessoaAgrupadas.containsKey(it.estado.sigla)) {
            pessoaAgrupadas[it.estado.sigla] = mutableListOf<Pessoa>()
        }
        pessoaAgrupadas[it.estado.sigla]?.add(it)
    }
    println(pessoaAgrupadas)
}