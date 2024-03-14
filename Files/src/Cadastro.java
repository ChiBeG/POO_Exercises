import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class Cadastro {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String nome;
        int telefone;
        try (PrintWriter arquivo = new PrintWriter(new FileWriter("telefones.txt", true))){
            do{
                System.out.println("Insira o nome: ");
                nome = input.nextLine();
                if(!nome.isEmpty()){
                    arquivo.println(nome + " ");
                    System.out.println("Insira o telefone: ");
                    arquivo.println(input.nextInt() + " ");
                    input.nextLine();
                }
            }while (!nome.isEmpty());
        }catch (Exception e){
            System.out.println("Erro - " + e.getMessage());
        }
    }
}
