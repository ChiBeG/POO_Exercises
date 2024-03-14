import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Turma turma = new Turma("Turma 10");

        Aluno a1 = new Aluno("João", 15);
        Aluno a2 = new Aluno("Maria", 16);

        turma.adicionar_aluno(a1);
        turma.adicionar_aluno(a2);
        turma.exibir_alunos();

    }
}