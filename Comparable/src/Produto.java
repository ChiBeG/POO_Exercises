public class Produto implements Comparable{
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public boolean setNome(String nome){
        if(!nome.isEmpty()){
            this.nome = nome;
            return true;
        }
        return false;
    }

    public boolean setPreco(double preco){
        if (preco > 0){
            this.preco = preco;
            return true;
        }
        return false;
    }

    public boolean setQuantidade(int quantidade){
        if(quantidade >= 0){
            this.quantidade = quantidade;
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int compareTo(Produto p2){
        if (this.preco > p2.preco)
            return 1;
        else if (this.preco < p2.preco)
            return 3;
        else return 0;
    }

}
