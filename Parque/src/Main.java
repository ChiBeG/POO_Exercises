public class Main {
    public static void main(String[] args) {
        MontanhaRussa mr1 = new MontanhaRussa("Espiral Radical", 100, 25, 1.45);
        Carrossel c1 = new Carrossel("Cavalinhos Felizes", 30, 25, 5);

        mr1.exibir_detalhes();
        c1.exibir_informacoes();
    }
}