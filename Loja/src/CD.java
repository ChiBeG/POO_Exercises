public class CD extends Produto{
    private String nomeBanda;

    public CD(int cod, String descricao, double preco, double peso, String nomeBanda){
        super(cod, descricao, preco, peso);
        setNomeBanda(nomeBanda);
    }

    public String getNomeBanda() {
        return nomeBanda;
    }

    public boolean setNomeBanda(String nomeBanda){
        if (!nomeBanda.isEmpty()){
            this.nomeBanda = nomeBanda;
            return true;
        }
        else return false;
    }
}
