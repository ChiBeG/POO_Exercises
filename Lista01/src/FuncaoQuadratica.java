import java.lang.Math;
public class FuncaoQuadratica {
    private double a;
    public double b, c;

    public FuncaoQuadratica(double a, double b, double c){
        setA(a);
        this.b = b;
        this.c = c;
    }

    public boolean setA(double a){ // o valor de a precisa ser diferente de 0 numa função quadrática, portanto, precisa ser encapsulado e controlado.
        if (a != 0){
            this.a = a;
            return true;
        }
        else{
            this.a = 1;
            return false;
        }
    }

    public double getA(){
        return this.a;
    }

    public double Raiz1(){
        double delta = b*b - 4*a*c;
        return ((-1 * b) + Math.sqrt(delta)) / (2 * a);
    }
    public double Raiz2(){
        double delta = b*b - 4*a*c;
        return ((-1 * b) - Math.sqrt(delta)) / (2 * a);
    }

    public double XVertice(){
        return (-1 * b) / (2 * a);
    }
    public double YVertice(){
        double delta = b*b - 4*a*c;
        return (-1 * delta) / (4*a);
    }
    public String Concavidade(){
        if (a > 0){
            return "para cima";
        }
        else{
            return "para baixo";
        }
    }
    public String Descricao(){
        return "y = " + this.a + "x² + " + this.b + "x + " + this.c;
    }

}
