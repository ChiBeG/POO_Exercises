import java.util.ArrayList;
public class Turma {

    private int cod;
    private String descricao;
    public ArrayList alunos = new ArrayList();

    public Turma (int cod, String descricao){
        this.cod = cod;
        this.descricao = descricao;
    }

    public boolean setCod(int cod){
        if (cod > 0){
            this.cod = cod;
            return true;
        }
        else
            return false;
    }

    public boolean setDescricao(String descricao){
        if (!descricao.isEmpty()){
            this.descricao = descricao;
            return true;
        }
        else
            return false;
    }

    public int getCod(){
        return this.cod;
    }

    public String getDescricao(){
        return this.descricao;
    }

}

