import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0, soma = 0;
        boolean failure = true;
        do{
            try{
                System.out.println("Insira x: ");
                x = input.nextInt();
                failure = false;
                soma+=x;
            }catch (InputMismatchException e){
                System.out.println("Erro de input - " + e.getMessage());
                input.nextLine();
            }catch (Exception e){
                System.out.println("Erro - " + e.getMessage());
            }
        }while(x!=0 || failure);

        System.out.println("Soma = " + soma);
    }
}