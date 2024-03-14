import java.util.ArrayList;

public class Turma {
    public ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public boolean temAluno(String nome){
        for (Aluno n: alunos){
            if(n.getNome().toLowerCase().trim().equals(nome.toLowerCase().trim()))
                return true;
        }
        throw new AlunoNaoEncontrado("Aluno não está na lista");
    }

}
