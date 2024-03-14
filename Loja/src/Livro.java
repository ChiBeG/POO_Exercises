public class Livro extends Produto{
    private String nomeAutor;
    public Livro(int cod, String descricao, double preco, double peso, String nomeAutor){
        super(cod, descricao, preco, peso);
        setNomeAutor(nomeAutor);
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public boolean setNomeAutor(String nomeAutor){
        if (!nomeAutor.isEmpty()){
            this.nomeAutor = nomeAutor;
            return true;
        }
        else return false;
    }


}
