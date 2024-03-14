import java.util.Scanner;
public class Recursao {
    public static int fatorial(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return n * fatorial(n-1);
    }

    public static int soma(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return n + soma(n-1);
    }

    public static int fib(int n){
        if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        else return fib(n-1) + fib(n-2);
    }

    public static boolean palindromo(String s){
        s = s.trim().toLowerCase();
        if (s.isEmpty() || s.length() == 1)
            return true;
        else{
            if (s.charAt(0) == s.charAt(s.length()-1)){
                String substring = s.substring(1, s.length()-1);
                System.out.println(substring);
                return palindromo(substring);
            }
        }
        return false;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira n: ");
        int n = input .nextInt();
        System.out.println("Fatorial de " + n + " = " + fatorial(n));

        System.out.println("Soma dos números até " + n + " = " + soma(n));

        System.out.println("Fator " + n + " de fibonacci = " + fib(n));

        input.nextLine();
        System.out.println("Insira a string: ");
        String s = input.nextLine();
        if (palindromo(s))
            System.out.println("É palíndromo!");
        else
            System.out.println("Não é palíndromo!");

    }
}
