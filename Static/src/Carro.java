public class Carro {
    private int anoFabricacao;;
    private static int qtdeCarros = 0;

    public Carro(int ano){
        this.anoFabricacao = ano;
        qtdeCarros++;
    }

    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public static int getQtdeCarros(){
        return qtdeCarros;
    }

}
