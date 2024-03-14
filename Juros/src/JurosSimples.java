public class JurosSimples extends Juros{
    public JurosSimples(double capital, double taxa, int tempo){
        super (capital, taxa, tempo);
    }

    public double calcularJuros(){
        double juros = capital * taxa * tempo;
        return juros;
    }
}
