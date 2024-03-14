public class Aluno {
    private int matricula;
    private String nome;

    public Aluno(int matricula, String nome){
        setNome(nome);
        setMatricula(matricula);
    }

    public boolean setNome(String nome){
        if(!nome.isEmpty()){
            this.nome = nome;
            return true;
        }
        return false;
    }

    public boolean setMatricula(int matricula){
        if (matricula > 0){
            this.matricula = matricula;
            return true;
        }
        return false;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}
