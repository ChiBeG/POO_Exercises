public class Juros {
    protected double capital, taxa;
    protected int tempo;

    public Juros (double capital, double taxa, int tempo){
        setCapital(capital);
        setTaxa(taxa);
        setTempo(tempo);
    }

    public boolean setCapital(double capital){
        if (capital > 0){
            this.capital = capital;
            return true;
        }
        else return false;
    }

    public boolean setTaxa(double taxa){
        if (taxa > 0 && taxa <= 1){
            this.taxa = taxa;
            return true;
        }
        else return false;
    }

    public boolean setTempo(int tempo){
        if (tempo > 0){
            this.tempo = tempo;
            return true;
        }
        else return false;
    }
}
