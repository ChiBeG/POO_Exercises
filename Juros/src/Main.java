public class Main {
    public static void main(String[] args) {
        JurosSimples js1 = new JurosSimples(2000, 0.03, 3);
        JurosCompostos jc1 = new JurosCompostos(2000, 0.03, 3);

        System.out.println("Juros simples - " + js1.calcularJuros());
        System.out.println("Juros compostos " + jc1.calcularJuros());


    }
}