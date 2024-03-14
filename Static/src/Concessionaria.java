public class Concessionaria {
    public static void main(String [] args){
        Carro c1 = new Carro(2003);
        Carro c2 = new Carro(1998);
        Carro c3 = new Carro(1940);
        Carro c4 = new Carro(1917);

        System.out.println("Ano de c1: " + c1.getAnoFabricacao() );
        System.out.println("Ano de c2: " + c2.getAnoFabricacao() );
        System.out.println("Ano de c3: " + c3.getAnoFabricacao() );
        System.out.println("Ano de c4: " + c4.getAnoFabricacao() );

        System.out.println("Qtde de carros: " + Carro.getQtdeCarros());
    }
}
