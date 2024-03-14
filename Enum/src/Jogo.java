
public class Jogo {
    public static void main(String [] args){

        Cartas carta1, carta2;

        carta1 = Cartas.sorteio();
        carta2 = Cartas.sorteio();


        System.out.println(carta1.toString() + " e " + carta2.toString());
        int valorCarta1 = carta1.getValor();
        int valorCarta2 = carta2.getValor();

        if (valorCarta1 > valorCarta2){
            System.out.println("A carta do primeiro jogador vale mais!");
        }
        else if (valorCarta2 > valorCarta1){
            System.out.println("A carta do segundo jogador vale mais!");
        }
        else{
            System.out.println("As duas cartas têm o mesmo valor!");
        }


    }
}
