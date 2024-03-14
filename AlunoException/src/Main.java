public class Main {
    public static void main(String[] args) {
        Turma t1 = new Turma();

        t1.alunos.add(new Aluno(1, "Joao"));
        t1.alunos.add(new Aluno(2, "Joao"));

        t1.alunos.add(new Aluno(3, "Pedro"));
        t1.alunos.add(new Aluno(4, "Maria"));
        t1.alunos.add(new Aluno(5, "Gabriel"));

        Aluno a = new Aluno(1, "Joao");

        if(t1.alunos.contains(a))
            System.out.println("Contém");
        else
            System.out.println("Não contém");

        try {
            if(t1.temAluno("Jorge"))
                System.out.println("Aluno Jorge encontrado!");
        }catch (AlunoNaoEncontrado e){
            System.out.println("Erro - " + e.getMessage());
        }

        try {
            if(t1.temAluno("Maria"))
                System.out.println("Aluna Maria encontrada!");
        }catch (AlunoNaoEncontrado e){
            System.out.println("Erro - " + e.getMessage());
        }


    }
}