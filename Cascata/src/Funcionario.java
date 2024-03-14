public class Funcionario extends Empregado{
    protected String setor;

    public boolean setSetor(String setor){
        if(!setor.isEmpty()){
            this.setor = setor;
            return true;
        }
        else return false;
    }

    public Funcionario (long cpf, int idade, String nome, String funcao, String setor){
        super(cpf, idade, nome, funcao);
        setSetor(setor);
    }

    public String getSetor() {
        return setor;
    }
}
