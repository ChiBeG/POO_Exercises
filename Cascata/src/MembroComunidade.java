public class MembroComunidade {
    protected long cpf;
    protected int idade;
    protected String nome;

    public MembroComunidade (long cpf, int idade, String nome){
        setCpf(cpf);
        setIdade(idade);
        setNome(nome);
    }

    public boolean setCpf(long cpf){
        if (cpf > 0){
            this.cpf = cpf;
            return true;
        }
        else return false;
    }
    public boolean setIdade(int idade){
        if (idade > 0){
            this.idade = idade;
            return true;
        }
        else return false;
    }
    public boolean setNome(String nome){
        if (!nome.isEmpty()){
            this.nome = nome;
            return true;
        }
        else return false;
    }

    public long getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
