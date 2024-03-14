public class Main {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario("Pedro", 4000);
        Funcionario e1 = new Estagiario("João", 1200);
        Funcionario v1 = new Vendedor("Gabriel", 3500, 20);

        System.out.println(f1.getNome() + " - " + f1.salarioLiquido());
        System.out.println(e1.getNome() + " - " + e1.salarioLiquido());
        System.out.println(v1.getNome() + " - " + v1.salarioLiquido());


    }
}