public class Carrossel extends Atracao{
    private int idade_minima;

    public boolean setIdade_minima(int idade_minima){
        if (idade_minima > 0){
            this.idade_minima = idade_minima;
            return true;
        }
        else return false;
    }
    public Carrossel(String nome, int capacidade, double preco, int idade_minima){
        super(nome, capacidade, preco);
        setIdade_minima(idade_minima);
    }

    public void exibir_informacoes(){
        System.out.println(nome + " - capacidade: " + capacidade + " - preço: " + preco + " - idade mínima: " + idade_minima);
    }
}
