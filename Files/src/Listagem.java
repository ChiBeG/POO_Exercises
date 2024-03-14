import java.io.FileReader;
import java.util.Scanner;
import java.util.HashMap;
public class Listagem {
    public static void main(String [] args) {
        HashMap<String, Integer> lista = new HashMap<String, Integer>();
        try (Scanner arquivo = new Scanner(new FileReader("telefones.txt"))) {
            while (arquivo.hasNext()) {
                String nome = arquivo.nextLine();
                int telefone = arquivo.nextInt();
                arquivo.nextLine();
                lista.put(nome, telefone);
                System.out.println(nome + " - " + telefone);
            }
        for(Object n : lista.keySet()){
            String key = n.toString();
            System.out.println(key + " - " + lista.get(key));
        }
        } catch (Exception e) {
            System.out.println("Erro - " + e.getMessage());
        }
    }
}
