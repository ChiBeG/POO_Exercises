public class Software extends Produto{
    private String categoria;

    public Software(int cod, String descricao, double preco, double peso, String categoria){
        super (cod, descricao, preco, peso);
        setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean setCategoria(String categoria){
        if (!categoria.isEmpty()){
            this.categoria = categoria;
            return true;
        }
        else return false;
    }
}
