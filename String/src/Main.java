import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2;
        String s1SemVogal = "";
        String s1Letras = "";
        String s2Letras = "";
        String letrasComuns = "";
        String todasVogais = "";
        String s1Vogais = "";
        int j = 0, vogais = 0;

        System.out.println("String 1: ");
        s1 = input.nextLine();

        System.out.println("String 2: ");
        s2 = input.nextLine();

        String s1Upper = s1.toUpperCase();

        for (int i = 0; i < s1.length(); i++){
            if (s1Upper.charAt(i) == 'A' ||s1Upper.charAt(i) == 'E' || s1Upper.charAt(i) == 'I' ||s1Upper.charAt(i) == 'O' ||s1Upper.charAt(i) == 'U'){
                vogais++;
                todasVogais += s1.charAt(i);
            }
            else{
                s1SemVogal += s1.charAt(i);
            }
        }

        System.out.println("A primeira string tem " + vogais + " vogais.");
        System.out.println("Primeira string sem as vogais: " + s1SemVogal);

        for(int i = 0; i < s1.length(); i++){
            if (i == s1.indexOf(s1.charAt(i)))
                s1Letras += s1.charAt(i);
        }

        for(int i = 0; i < s2.length(); i++){
            if (i == s2.indexOf(s2.charAt(i)))
                s2Letras += s2.charAt(i);
        }

        System.out.println("Letras da primeira string: " + s1Letras);

        String somaLetras = s1Letras + s2Letras;

        for(int i = 0; i < somaLetras.length(); i++){
            if (i == somaLetras.indexOf(somaLetras.charAt(i)))
                letrasComuns += somaLetras.charAt(i);
        }



        System.out.println("Letras comuns: " + letrasComuns);

        for(int i = 0; i < todasVogais.length(); i++){
            if (i == todasVogais.indexOf(todasVogais.charAt(i)))
                s1Vogais += todasVogais.charAt(i);
        }

        System.out.println("Vogais da primeira string: " + s1Vogais);










    }
}