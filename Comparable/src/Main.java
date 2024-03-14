import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome, preço e quantidade do produto 1: ");
        String nome = input.nextLine();
        double preco = input.nextDouble();
        int quantidade = input.nextInt();
        input.nextLine();
        Produto p1 = new Produto(nome, preco, quantidade);

        System.out.println("Insira o nome, preço e quantidade do produto 2: ");
        nome = input.nextLine();
        preco = input.nextDouble();
        quantidade = input.nextInt();
        Produto p2 = new Produto(nome, preco, quantidade);


        if (p1.compareTo(p2) == 1)
            System.out.println(p1.getNome() + " é mais caro");
        else if (p1.compareTo(p2) == 2)
            System.out.println( p2.getNome() + " é mais caro");
        else System.out.println("Eles têm o mesmo preço!!!");
    }
}