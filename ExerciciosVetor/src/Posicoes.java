import java.util.Scanner;
public class Posicoes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira n: ");
        int n = input.nextInt();
        int [] v = new int[n];
        int qntd = 0;

        for (int i = 0; i < v.length; i++){
            System.out.println("Insira o elemento da posição " + i + ": ");
            v[i] = input.nextInt();
        }

        System.out.println("Insira k: ");
        int k = input.nextInt();

        System.out.println("k em v: ");

        for(int i = 0; i < v.length; i++){
            if (v[i] == k) {
                System.out.println("Posição " + i);
                qntd++;
            }
        }

        if (qntd == 0)
            System.out.println("Número não encontrado!");

    }
}
