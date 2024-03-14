import java.util.Scanner;
public class FuncaoLinear {
    private double a = 1;
    public double b;

    public FuncaoLinear(double a, double b){
        setA(a);
        this.b = b;
    }

    public boolean setA (double a){
        if (a != 0){
            this.a = a;
            return true;
        }
        else
            return false;
    }

    public double raiz(){
        return (-1 * b)/a;
    }

    public String inclinacao(){
        if (a > 0)
            return "crescente";
        else
            return "descrescente";
    }

    public String descrever(){
        String descricao = "f(x) = " + a + "x";
        if (b > 0)
            descricao += " + " + b;
        else
            descricao += " " + b;

        return descricao;
    }

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Estudando uma função linear!");
        System.out.println("Favor, digite os valores de A e B: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        FuncaoLinear fl = new FuncaoLinear(a, b);

        System.out.println("Sua função: " + fl.descrever());
        System.out.println("Inclinação da reta: " + fl.inclinacao());
        System.out.println("Raiz: " + fl.raiz());
    }

}
