import java.lang.reflect.Array;
import java.util.ArrayList;
public class Turma {
    private String nome;
    public ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma (String nome){
        setNome(nome);
    }

    public boolean setNome(String nome){
        if(!nome.isEmpty()){
            this.nome = nome;
            return true;
        }
        else
            return false;
    }

    public boolean adicionar_aluno(Aluno aluno){
        return alunos.add(aluno);
    }

    public void exibir_alunos(){
        for (Aluno aluno : alunos) aluno.exibir_informacoes();
    }


}
