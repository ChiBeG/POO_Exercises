import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Insira a trinca: ");
        String trinca = input.nextLine();

        RNA rna1 = new RNA(trinca);
        rna1.converter();
        System.out.println("Aminoacido: " + rna1.aminoacidos);
    }
}