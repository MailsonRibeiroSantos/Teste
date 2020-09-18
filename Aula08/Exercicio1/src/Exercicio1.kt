fun main(){
    var banco = Banco()
    var numeroContas = 1
    var limiteCredito = 300.0
    var taxaOperacao = 1.0
    do {
        println("--------------------------------------------------------------")
        println("Digite uma opção abaixo:")
        println("1. Cadastrar conta")
        println("2. Buscar conta")
        println("3. Remover conta")
        println("4. Gerar relatório")
        println("5. Sair ")
        println("--------------------------------------------------------------")
        var opcao = readLine()!!.toInt()
        if(opcao == 1){
            println("Digite a opção de conta:")
            println("1 - Para conta poupança")
            println("2 - Para conta corrente")
            var escolha = readLine()!!.toInt()
            if(escolha == 1){

                var conta = ContaPoupanca(limiteCredito,numeroContas,0.0 )
                banco.inserir(conta)
                numeroContas += 1
                println("Conta cadastrada com sucesso!!")
            }else if(escolha == 2){
                var conta = ContaCorrente(taxaOperacao,numeroContas,0.0 )
                banco.inserir(conta)
                numeroContas += 1
                println("Conta cadastrada com sucesso!!")

            }
        } else if(opcao == 2){
            println("Digite número da conta:")
            var numero = readLine()!!.toInt()
            var conta = banco.procurarConta(numero)
            if(conta == null){
                println("Conta Inexistente")
            }else{
                println("--------------------------------------------------------------")
                println("Digite uma opção abaixo:")
                println("1. Depositar  um valor ")
                println("2. Sacar  um valor ")
                println("3. Realizar uma transferencia")
                println("4. Gerar relatório")
                println("5. Retornar ao menur anterior ")
                println("--------------------------------------------------------------")
                var escolha = readLine()!!.toInt()
                if(escolha == 1 ){
                    println("Digite valor que deseja depositar:")
                    var valor = readLine()!!.toDouble()
                    conta.depositar(valor)

                }else if(escolha ==2){
                    println("Digite valor que deseja sacar:")
                    var valor = readLine()!!.toDouble()
                    conta.sacar(valor)

                }else if(escolha ==3){
                    println("Digite número da conta que deseja realizar transferencia:")
                    var numeroConta = readLine()!!.toInt()
                    var conta2 = banco.procurarConta(numero)
                    if(conta2 == null){
                        println("Conta Inexistente!!")
                    }else{
                        println("Digite valor que deseja realizar transferência:")
                        var valor = readLine()!!.toDouble()
                        conta.transferir(valor,conta2)
                    }
                }else if(escolha ==4){
                    conta.mostrarDados()

                }else if(escolha ==5){
                    continue
                }

            }
        }else if(opcao == 3){
            println("Digite número da conta:")
            var numero = readLine()!!.toInt()
            var conta = banco.procurarConta(numero)
            if(conta == null){
                println("Conta Inexistente")
            }else {
                banco.remover(conta)
                numeroContas-=1
                println("Conta removida com sucesso!!")
            }
        }else if(opcao == 4){
            banco.mostrarDados()
        }else if(opcao == 5){
            break
        }

    }while(true)
}
