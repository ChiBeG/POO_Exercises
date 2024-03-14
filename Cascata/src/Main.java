import java.beans.PropertyDescriptor;

public class Main {
    public static void main(String[] args){

        MembroComunidade m1 = new MembroComunidade(1, 19, "João");
        Graduado gd1 = new Graduado(2, 23, "Pedro", "Sistemas de Informação", 2040, 8);
        Aluno al1 = new Aluno(3, 18, "Anderson", "Engenharia de Produção");
        Empregado emp1 = new Empregado(4, 32, "Júlio", "Técnico em Eletrônica");
        CorpoDocente cd1 = new CorpoDocente(4, 28, "Carlos", "Secretário", 234234234);
        Professor pf1 = new Professor(5, 43, "Mario", "Professor", 232342344, "Introdução à Administração");
        Administrador adm1 = new Administrador(6, 43, "Rodrigo", "Adminstrador", 23234234, "Informática");

        System.out.println(m1.getCpf() + " - " + m1.getNome() + " - " + m1.getIdade());
        System.out.println(gd1.getCpf() + " - " + gd1.getNome() + " - " + gd1.getIdade() + " - " + gd1.getGraduacao() + " - " + gd1.getAnoFormacao() + " - " + gd1.getSemestresIntegracao());
        System.out.println(emp1.getCpf() + " - " + emp1.getNome() + " - " + emp1.getIdade() + " - " + emp1.getFuncao());
        System.out.println(cd1.getCpf() + " - " + cd1.getNome() + " - " + cd1.getIdade() + " - " + cd1.getFuncao() + " - " + cd1.getCod_docente());
        System.out.println(pf1.getCpf() + " - " + pf1.getNome() + " - " + pf1.getIdade() + " - " + pf1.getFuncao() + " - " + pf1.getCod_docente() + " - " + pf1.getDisciplina());
        System.out.println(adm1.getCpf() + " - " + adm1.getNome() + " - " + adm1.getIdade() + " - " + adm1.getFuncao() + " - " + adm1.getCod_docente() + " - " + adm1.getArea());



    }
}