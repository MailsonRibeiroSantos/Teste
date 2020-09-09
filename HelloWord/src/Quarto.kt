fun main() {
    println("Digite uma temperatura em Fahrenheit:")
    var temperaturaFahrenheit = readLine()!!.toDouble()

    var temperaturaCelsius = 5*((temperaturaFahrenheit -32)/9)
    println("Temperatura em Celsius: "+ temperaturaCelsius)

}