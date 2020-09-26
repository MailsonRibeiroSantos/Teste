class GuardaVolume() {
    var id:Int = 1
    var volumes: MutableMap<Int,MutableList<Pertence>> = mutableMapOf<Int,MutableList<Pertence>>()

    fun guardarPecas(listaDePeca: MutableList<Pertence>):Int{
        volumes[id] = listaDePeca
        id +=1
        return id
    }

    fun devolverPecas(numero:Int){
        volumes.remove(numero)
    }

    fun  mostrarPecas(){
        volumes.forEach{
            println(it.key)
            for (peca  in  it.value)
            {
                println("${peca.marca} ${peca.modelo}")
            }
        }

    }
    
    fun mostrarPecas(numero:Int){
        volumes.get(numero)!!.forEach {
            println("Marca: ${it.marca} Modelo: ${it.modelo}")
        }

    }
}