public class Alunos implements Comparable{
    private int matricula;
    private String nome;

    public boolean setMatricula(int matricula){
        if (matricula > 0){
            this.matricula = matricula;
            return true;
        }
        return false;
    }

    public boolean setNome(String nome){
        if (!nome.isEmpty()){
            this.nome = nome;
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public Alunos(int matricula, String nome){
        setMatricula(matricula);
        setNome(nome);
    }

    @Override
    public int compareTo(Object o){
        Alunos a = (Alunos)o;
        if (this.matricula == a.matricula)
            return 0;
        else if (this.matricula < a.matricula)
            return -1;
        else
            return 1;
    }
}
