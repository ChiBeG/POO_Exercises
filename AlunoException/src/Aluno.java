
public class Aluno{
        private int matricula;
        private String nome;

        public boolean setMatricula(int matricula){
            if (matricula < 0){
                throw new IllegalArgumentException("Matrícula inválida");
            }
            this.matricula = matricula;
            return true;
        }
        public boolean setNome(String nome){
            if (nome.isEmpty()){
                throw new IllegalArgumentException("Nome invãlido");
            }
            this.nome = nome;
            return true;
        }

        public Aluno(int matricula, String nome){
            setMatricula(matricula);
            setNome(nome);
        }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object o) {
        Aluno a = (Aluno) o;
            if (this.matricula == a.getMatricula()){
                return true;
            }
            return false;
    }

}
