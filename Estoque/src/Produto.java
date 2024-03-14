public class Produto implements Comparable{
    private String codigo, descricao;
    private double preco;
    private int quantidade;


    public Produto(String codigo, String descricao, double preco, int quantidade){
        setQuantidade(quantidade);
        setPreco(preco);
        setCodigo(codigo);
        setDescricao(descricao);
    }

    public boolean setCodigo(String codigo){
        if(codigo.isEmpty()){
            throw new IllegalArgumentException("Código vazio");
        }
        this.codigo = codigo;
        return true;
    }

    public boolean setDescricao(String descricao){
        if (descricao.isEmpty()){
            throw new IllegalArgumentException("Descrição vazia");
        }
        this.descricao = descricao;
        return true;
    }

    public boolean setPreco(double preco){
        if(preco <= 0){
            throw new IllegalArgumentException("Preço deve ser maior que zero");
        }
        this.preco = preco;
        return true;
    }

    public boolean setQuantidade(int quantidade){
        if (quantidade < 0){
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }
        this.quantidade = quantidade;
        return true;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public int compareTo(Object o) {
        Produto p = (Produto) o;
        if (this.quantidade == p.quantidade) {
            if (this.preco > p.preco)
                return 1;
            else if (this.preco < p.preco)
                return -1;
            else {
                return 0;
            }
        }
        if (this.quantidade > p.quantidade)
            return 1;
        else {
            return -1;
        }
    }
}
