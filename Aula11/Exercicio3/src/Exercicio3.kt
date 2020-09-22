fun main(){
    var alunos = ArrayList<Aluno>()
    var aluno1 = Aluno("Mailson", 12)
    var aluno2 = Aluno("Mailson", 13)
    var aluno3 = Aluno("Mailson", 14)
    var aluno4 = Aluno("Mailson", 15)
    alunos.add(aluno1)
    alunos.add(aluno2)
    alunos.add(aluno3)
    alunos.add(aluno4)
    var novoAluno =  Aluno("Mailson", 15)
    println(alunos.contains(novoAluno))

}