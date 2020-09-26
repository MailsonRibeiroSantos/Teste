fun main(){
    var loteriaSonhos = mutableMapOf<Int,String>(0 to "Ovos",1 to "Água", 2 to "Escopeta",3 to "Cavalo",4 to "Dentista",5 to "Fogo")
    println(loteriaSonhos)
    var pessoas = mutableMapOf<String,MutableList<String>>(
            "João" to mutableListOf<String>("Juan", "Fissura", "Maromba"),
            "Miguel" to mutableListOf<String>("Night Watch", "Bruce Wayne", "Tampinha"),
            "Maria" to mutableListOf<String>("Wonder Woman", "Mary", "Marilene"),
            "Lucas" to mutableListOf<String>("Lukinha", "Jorge", "George")
    )
    for(key in pessoas.keys){
        println(pessoas[key])
    }
}