import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap mapa = new HashMap();
        mapa.put("localhost", "???");
        mapa.put("localhost", "127.0.0.1");
        mapa.put("www.uva.br", "187.12.201.162");
        mapa.put("www.google.com", "74.125.228.81");
        mapa.put("globo.com", "186.192.90.5");

        Scanner input = new Scanner(System.in);
        System.out.println("Insira a URL a ser buscada: ");
        String url = input.nextLine();

        System.out.println(mapa.get(url));

        for(Object n : mapa.keySet())
            System.out.println(n.toString());

        for (Object m : mapa.values())
            System.out.println(m.toString());
    }
}