import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Turma t1 = new Turma(123, "Turma de TP2");

        t1.listaAlunos.add(new Alunos(4, "Pedro"));
        t1.listaAlunos.add(new Alunos(10, "Erick"));
        t1.listaAlunos.add(new Alunos(3, "João Pedro"));
        t1.listaAlunos.add(new Alunos(7, "Gabriel"));
        t1.listaAlunos.add(new Alunos(9, "Pedro Samuel"));
        t1.listaAlunos.add(new Alunos(2, "Ronaldo"));
        t1.listaAlunos.add(new Alunos(11, "Lohan"));
        t1.listaAlunos.add(new Alunos(54, "Yan"));

        Collections.sort(t1.listaAlunos);

        for (Alunos a : t1.listaAlunos){
            System.out.println(a.getMatricula() + " - " + a.getNome());
        }
    }
}