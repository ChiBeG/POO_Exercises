public class Aluno extends MembroComunidade{
    private String curso;

    public boolean setCurso(String curso) {
        if (!curso.isEmpty()){
            this.curso = curso;
            return true;
        }
        else return false;
    }

    public Aluno (long cpf, int idade, String nome, String curso){
        super(cpf, idade, nome);
        setCurso(curso);
    }

    public String getCurso() {
        return curso;
    }
}
