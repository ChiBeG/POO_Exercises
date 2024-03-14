import java.lang.Math;
public class JurosCompostos extends Juros {
    public JurosCompostos(double capital, double taxa, int tempo){
        super(capital, taxa, tempo);
    }

    public double calcularJuros(){
        double juros = capital * Math.pow((1 + taxa), tempo) - capital;
        return juros;
    }

}
