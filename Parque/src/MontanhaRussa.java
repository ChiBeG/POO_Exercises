public class MontanhaRussa extends Atracao{

    private double altura_minima;
    public MontanhaRussa (String nome, int capacidade, double preco, double altura_minima){
        super(nome, capacidade, preco);
        setAltura_minima(altura_minima);
    }

    public boolean setAltura_minima(double altura_minima){
        if (altura_minima > 0.7){
            this.altura_minima = altura_minima;
            return true;
        }
        else return false;
    }

    public void exibir_detalhes(){
        System.out.println(nome + " - capacidade: " + capacidade + " - preço: " + preco + " - altura mínima: " + altura_minima);
    }

}
