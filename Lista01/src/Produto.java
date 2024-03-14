public class Produto {
    private int id, quantidade;
    private String nome;
    private double preco;
    public Produto(){
        setId(1);
        setNome("");
        setQuantidade(0);
        setPreco(0);
    }

    public Produto(int id, String nome, int quantidade, double preco){
        setId(id);
        setNome(nome);
        setQuantidade(quantidade);
        setPreco(preco);
    }


    public boolean setId(int id){
        if (id >= 1 && id <= 9999){
            this.id = id;
            return true;
        }
        else{
            this.id = 1;
            return false;
        }
    }
    public boolean setQuantidade(int quantidade){
        if (quantidade > 0){
            this.quantidade = quantidade;
            return true;
        }
        else
            return false;
    }

    public boolean setPreco(double preco){
        if (preco > 0){
            this.preco = preco;
            return true;
        }
        else
            return false;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
