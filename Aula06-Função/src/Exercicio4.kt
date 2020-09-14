import kotlin.random.Random

fun main(){
    print(jogarDados())
}
fun jogarDados(): Int{
    return Random.nextInt(2, 12)
}
