public class Graduado extends MembroComunidade{


    private String graduacao;
    private int anoFormacao;
    private int semestresIntegracao;

    public Graduado(long cpf, int idade, String nome, String graduacao, int anoFormacao, int semestresIntegracao){
        super(cpf, idade, nome);
        setGraduacao(graduacao);
        setAnoFormacao(anoFormacao);
        setSemestresIntegracao(semestresIntegracao);
    }

    public boolean setGraduacao(String graduacao){
        if (!graduacao.isEmpty()){
            this.graduacao = graduacao;
            return true;
        }
        else return false;
    }

    public boolean setAnoFormacao(int anoFormacao){
        if (anoFormacao > 1000){
            this.anoFormacao = anoFormacao;
            return true;
        }
        else return false;
    }

    public boolean setSemestresIntegracao(int semestresIntegracao){
        if (semestresIntegracao > 4){
            this.semestresIntegracao = semestresIntegracao;
            return true;
        }
        else return false;
    }

    public int getAnoFormacao() {
        return anoFormacao;
    }

    public int getSemestresIntegracao() {
        return semestresIntegracao;
    }

    public String getGraduacao() {
        return graduacao;
    }
}
