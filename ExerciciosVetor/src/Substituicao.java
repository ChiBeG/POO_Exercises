import java.util.Scanner;
public class Substituicao {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira n: ");
        int n = input.nextInt();
        int [] v = new int[n];

        for (int i = 0; i < v.length; i++){
            System.out.println("Insira o elemento da posição " + i + ": ");
            v[i] = input.nextInt();
        }

        System.out.println("Insira k: ");
        int k = input.nextInt();

        System.out.println("Insira p: ");
        int p = input.nextInt();

        if (p < 0 || p >= v.length)
            System.out.println("Posição inválida");
        else{
            for (int i = v.length-1; i > p; i--)
                v[i] = v[i-1];
            v[p] = k;
        }

        for (int x : v){
            System.out.print(x + " ");
        }


    }
}
