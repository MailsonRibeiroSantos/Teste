fun main(){
    var animais = ArrayList<String>()
    try {
        animais.add("Pato")
        animais.add("Cachorro")
        animais.add("Gato")
        println(animais[3])
    }catch (ex: Exception ){
        ex.printStackTrace()

    }
}