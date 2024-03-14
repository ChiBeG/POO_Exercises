public class Empregado extends MembroComunidade{
    protected String funcao;

    public boolean setFuncao(String funcao){
        if (!funcao.isEmpty()){
            this.funcao = funcao;
            return true;
        }
        else return false;
    }
    public Empregado (long cpf, int idade, String nome, String funcao){
        super(cpf, idade, nome);
        setFuncao(funcao);
    }

    public String getFuncao() {
        return funcao;
    }
}
