import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteExceção {
    public static void main(String[] args){
        int a, b, c;
        Scanner input = new Scanner(System.in);

        boolean sucesso = false;

        do{
            try{
                System.out.println("Insira a: ");
                a = input.nextInt();
                input.nextLine();
                System.out.println("Insira b: ");
                b = input.nextInt();
                input.nextLine();
                c = a/b;
                sucesso = true;
                System.out.printf("%d / %d = %d\n", a, b, c);
            }catch (InputMismatchException e){
                System.out.println("Erro de entrada - " + e.getMessage());
                input.nextLine();
            }catch(ArithmeticException e) {
                System.out.printf("Erro: %s\n", e.getMessage());
            }
        }while(!sucesso);
    }
}
