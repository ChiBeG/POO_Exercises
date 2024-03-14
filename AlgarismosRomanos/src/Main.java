import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o número a ser convertido: ");
        int numero = input.nextInt();
        AlgarismosRomanos rom1 = new AlgarismosRomanos(numero);

        String romano = rom1.converter();

        System.out.println(romano);
    }
}