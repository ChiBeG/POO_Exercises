import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static ArrayList<Livro> livros = new ArrayList<>();
    public static Livro buscarLivro (String busca){
        Livro resultado = null;
        for (Livro n : livros){
            if (n.getTitulo().toLowerCase().matches(busca.toLowerCase())) {
                resultado = n;
            }
        }
        return resultado;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String titulo, autor;
        int ano;
        double preco;
        do{
            System.out.println("Insira o título do livro: ");
            titulo = input.nextLine();
            if (!titulo.isEmpty()){
                System.out.println("Insira o autor, ano e preço: ");
                autor = input.nextLine();
                ano = input.nextInt();
                preco = input.nextDouble();
                input.nextLine();
                livros.add(new Livro(titulo, autor, ano, preco));
            }
        }while(!titulo.isEmpty());


        System.out.println("Buscar livro: ");
        String busca = input.nextLine();

        if (null != buscarLivro(busca)){
            buscarLivro(busca).exibirDados();
        }
        else
            System.out.println("Livro não encontrado!");
    }
}
