import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        Tweet tw1 = new Tweet();
        System.out.println("Escreva seu tweet: ");
        String paragrafo = input.nextLine();
        if (tw1.setParagrafo(paragrafo) == false){
            System.out.println("Você ultrapassou o limte de caracteres!");
        }
        else {
            System.out.println("Parágrafo: " + tw1.getParagrafo());
            System.out.println("Quantidade de caracteres: " + tw1.quantidadeCaracteres());
            System.out.println("Quantidade de palavras: " + tw1.quantidadePalavras());
            System.out.println("Quantidade de frases: " + tw1.quantidadeFrases());
            System.out.println("Insira a palavra a ser buscada: ");
            String palavra = input.nextLine();
            System.out.println("Ocorrências de " + palavra + ": " + tw1.ocorrenciasPalavra(palavra));
            System.out.println("Insira o tamanho do parágrafo a ser gerado: ");
            int tamanho = input.nextInt();
            System.out.println("Parágrafo gerado aleatoriamente: " + Tweet.gerarParagrafo(tamanho));
        }
    }
}
