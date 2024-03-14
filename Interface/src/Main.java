import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        Lista l1 = new Lista();

        do {
            System.out.println("Insira um nome: ");
            nome = input.nextLine();
        }while (l1.adicionarNome(nome));


        l1.print();

    }
}