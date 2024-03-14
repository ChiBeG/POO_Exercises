public class Produto {
    protected int cod;
    protected String descricao;
    protected double preco, peso;

    public Produto(int cod, String descricao, double preco, double peso){
        setCod(cod);
        setPreco(preco);
        setDescricao(descricao);
        setPeso(peso);
    }

    public boolean setCod(int cod){
        if (cod >= 0){
            this.cod = cod;
            return true;
        }
        else return false;
    }

    public boolean setDescricao(String descricao){
        if (!descricao.isEmpty()){
            this.descricao = descricao;
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

    public boolean setPeso(double peso){
        if (peso > 0){
            this.peso = peso;
            return true;
        }
        else return false;
    }

    public double getPeso() {
        return peso;
    }

    public int getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double calcularFrete() {
        return peso * 6.50;
    }
}

