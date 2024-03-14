import java.util.ArrayList;
import java.util.Scanner;

public class Alfabeto {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a string: ");
        String s = input.nextLine();
        String sUper = s.toUpperCase();
        ArrayList letras = new ArrayList();
        ArrayList ocorrencias = new ArrayList();

        int quantidade;
        char c;

        for (int cInt = 65; cInt <= 90; cInt++){
            c = (char)cInt;
            letras.add(c);
        }


        for (int i = 0; i < letras.size(); i++){
            quantidade = 0;
            for (int j = 0; j < s.length(); j++){
                if (sUper.charAt(j) == (char)letras.get(i))
                    quantidade++;
            }
            ocorrencias.add(quantidade);
        }

        for (int i = 0; i < letras.size(); i++){
            System.out.println(letras.get(i) + " aparece "+ ocorrencias.get(i) + " vezes");
        }



    }
}
