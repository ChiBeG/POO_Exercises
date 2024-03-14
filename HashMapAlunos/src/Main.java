import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap mapa = new HashMap();
        Scanner input = new Scanner(System.in);
        int matricula;
        String nome;
        Aluno aluno;
        do{
            System.out.println("Insira a matricula do aluno: ");
            matricula = input.nextInt();
            input.nextLine();
            if (matricula > 0){
                System.out.println("Insira o nome do aluno: ");
                nome = input.nextLine();
                aluno = new Aluno(matricula, nome);
                mapa.put(aluno.getMatricula(), aluno);
            }
        }while (matricula > 0);

        System.out.println("Insira a matricula do aluno a ser buscado: ");
        matricula = input.nextInt();
        if (mapa.containsKey(matricula)){
            aluno = (Aluno) mapa.get(matricula);
            System.out.println("Matricula - " + aluno.getMatricula() + " - Aluno: " + aluno.getNome());
        }
        else{
            System.out.println("Aluno não existe no mapa!"x);
        }

        for (Object m: mapa.keySet()){
            System.out.println((int) m);
        }

        for (Object n: mapa.values()){
            System.out.println(((Aluno) n).getNome());
        }

    }
}