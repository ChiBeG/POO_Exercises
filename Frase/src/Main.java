import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a frase: ");
        String frase = input.nextLine();

        StringTokenizer palavras = new StringTokenizer(frase, " , : . ; ! ?");
        HashMap mapa = new HashMap();

        String palavra;
        while(palavras.hasMoreTokens()){
            palavra = palavras.nextToken().toLowerCase();
            if (mapa.containsKey(palavra))
                mapa.put(palavra, (int)mapa.get(palavra) + 1);
            else
                mapa.put(palavra, 1);
        }

        System.out.println(mapa.size() + " palavras");

        for(Object n : mapa.keySet()){
            System.out.println(n.toString() + " - ocorrencias: "+ mapa.get(n.toString()));
        }


    }
}