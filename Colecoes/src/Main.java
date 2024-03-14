import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o código da turma: ");
        int cod = input.nextInt();
        input.nextLine();
        System.out.println("Insira a descrição da turma: ");
        String descricao = input.nextLine();
        Turma turma1 = new Turma (cod, descricao);

        int matricula;
        String nome;

        do{
            System.out.println("Insira a matrícula do aluno: ");
            matricula = input.nextInt();
            input.nextLine();
            if (matricula != 0){
                System.out.println("Insira o nome do aluno: ");
                nome = input.nextLine();
                turma1.alunos.add(new Aluno(matricula, nome));
            }
        }while (matricula != 0);

        System.out.println("Turma " + turma1.getCod() + "\nDescrição: " + turma1.getDescricao());
        System.out.println("Alunos: ");
        for (int i = 0; i < turma1.alunos.size(); i++){
            System.out.println("Matricula " + turma1.alunos.get(i));
        }


    }
}
