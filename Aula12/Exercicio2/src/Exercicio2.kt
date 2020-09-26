fun main(){
    var list = mutableListOf<Int>()
    list.add(1)
    list.add(5)
    list.add(5)
    list.add(6)
    list.add(7)
    list.add(8)
    list.add(8)
    list.add(8)
    var set = mutableSetOf<Int>()
    set.add(1)
    set.add(5)
    set.add(5)
    set.add(6)
    set.add(7)
    set.add(8)
    set.add(8)
    set.add(8)
    for (it in list){
        println(it)
    }
    println("---------------------------")
    for (it in set){
        println(it)
    }

}