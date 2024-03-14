import java.util.Scanner;
public class Media {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o número de alunos: ");
        int alunos = input.nextInt();
        double[] notas = new double[alunos];
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira a nota do aluno " + (int) (i + 1) + ": ");
            notas[i] = input.nextFloat();
            media += notas[i];
        }

        media /= notas.length;

        System.out.println("Média: " + media);
        System.out.println("Notas acima da média: ");

        for (double n : notas){
            if (n > 7)
                System.out.println(n);
        }

    }
}
