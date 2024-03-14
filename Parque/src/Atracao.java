public class Atracao {
    protected String nome;
    protected int capacidade;
    protected double preco;

    public Atracao(String nome, int capacidade, double preco){
        setNome(nome);
        setCapacidade(capacidade);
        setPreco(preco);
    }

    public boolean setNome(String nome){
        if (!nome.isEmpty()){
            this.nome = nome;
            return true;
        }
        else return false;
    }

    public boolean setCapacidade(int capacidade){
        if (capacidade > 0){
            this.capacidade = capacidade;
            return true;
        }
        else return false;
    }

    public boolean setPreco(double preco){
        if (preco > 0){
            this.preco = preco;
            return true;
        }
        else return false;
    }

    public double arrecadacao_maxima(){
        return capacidade * preco;
    }


}
