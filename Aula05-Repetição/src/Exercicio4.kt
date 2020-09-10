fun main() {
    do {
        println("Digite seu nome: ")
        var nome = readLine()
        if (nome!!.length > 3) {
            break
        }
        println("Digite o nome com mais de três caracteres")
    } while (true)

    do {
        println("Digite sua idade: ")
        var idade = readLine()!!.toInt()
        if (idade in 0..150) {
            break
        }
        println("Idade invalida")
    } while (true)

    do {
        println("Digite o seu sálario: ")
        var salario = readLine()!!.toDouble()
        if (salario > 0) {
            break
        }
        println("Digite um sálario válido")
    } while (true)

    do {
        println("Digit o sexo: ")
        println("f _ Para sexo feminino ")
        println("m _ Para sexo masculino ")
        var sexo = readLine()
        if (sexo.equals("f") || sexo.equals("m")) {
            break
        }
        println("Digite o sexo no formato válido")
    } while (true)

    do {
        println("Digit o estado cívil: ")
        println("s _ Para sexo solteiro ")
        println("c _ Para sexo casado ")
        println("v _ Para sexo viúvo ")
        println("d _ Para sexo divorciado ")
        var estadoCivil = readLine()
        if (estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v") || estadoCivil.equals("d")) {
            break
        }
        println("Digite um estado cívil no formato válido")
    } while (true)
}