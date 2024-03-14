import java.sql.Array;
import java.util.ArrayList;

public class Turma {
    private int codigo;
    private String descricao;

    public ArrayList<Alunos> listaAlunos = new ArrayList<Alunos>();

    public Turma (int codigo, String descricao){
        setCodigo(codigo);
        setDescricao(descricao);
    }

    public boolean setCodigo(int codigo){
        if (codigo > 0){
            this.codigo = codigo;
            return true;
        }
        return false;
    }

    public boolean setDescricao(String descricao){
        if (!descricao.isEmpty()){
            this.descricao = descricao;
            return true;
        }
        return false;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }
}
