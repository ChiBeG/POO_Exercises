import java.util.Scanner;

public class Notas {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas notas deseja ler? ");
        int quantNotas = input.nextInt();

        double [] notas = new double[quantNotas];

        for (int i = 0; i < notas.length; i++){
            System.out.println("Insira a nota " + (i+1) + ": ");
            notas[i] = input.nextDouble();
        }

        for (double n : notas){
            for(Conceitos c : Conceitos.values()){
                if (n >= c.getNotaMinima() && n <= c.getNotaMaxima()){
                    System.out.println(n + " - " + c.toString());
                }
            }
        }
    }
}
