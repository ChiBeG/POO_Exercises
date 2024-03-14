public class Aluno {
    public int matricula;
    public String nome;

    public Aluno (int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
    public boolean setMatricula(int matricula){
        if (matricula > 0){
            this.matricula = matricula;
            return true;
        }
        else
            return false;
    }

    public boolean setNome(String nome){
        if (!nome.isEmpty()){
            this.nome = nome;
            return true;
        }
        else
            return false;
    }

    public int getMatricula(){
        return this.matricula;
    }
    public String getNome(){
        return this.nome;
    }
}
