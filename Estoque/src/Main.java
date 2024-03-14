import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList <Produto> produtos = new ArrayList<Produto>();
        try{
            Scanner file = new Scanner(new FileReader("items.csv"));
            file.nextLine();
            while (file.hasNext()){
                String linha = file.nextLine();
                String [] dados = linha.split(";");
                String codigo = dados[0];
                String descricao = dados[1];
                double preco = Double.parseDouble(dados[2]);
                int quantidade = Integer.parseInt(dados[3]);

                produtos.add(new Produto(codigo, descricao, preco, quantidade));

            }

            Collections.sort(produtos);

            System.out.println("Vendedor, os seguintes itens estão em falta:");
            for (int i = 0; i < 10; i++){
                Produto p = produtos.get(i);
                System.out.println(p.getDescricao());
            }
        }catch (Exception e){
            System.out.println("Erro - " + e.getMessage());
        }
    }
}