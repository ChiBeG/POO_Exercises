public class Professor extends CorpoDocente{
    private String disciplina;

    public boolean setDisciplina(String disciplina){
        if (!disciplina.isEmpty()){
            this.disciplina = disciplina;
            return true;
        }
        else return false;
    }

    public Professor(long cpf, int idade, String nome, String funcao, long cod_docente, String disciplina){
        super(cpf, idade, nome, funcao, cod_docente);
        setDisciplina(disciplina);
    }

    public String getDisciplina() {
        return disciplina;
    }
}
