import inimigos.Inimigo;
import itens.BolsaSangue;
import itens.Item;
import personagens.Boneco;
import personagens.JettGoblin;
import personagens.JohnPork;
import java.util.InputMismatchException;
import java.util.Scanner;

    public final class ClasseAux {
        private ClasseAux(){}

        private static final Scanner input = new Scanner(System.in);

        public static Boneco menuBoneco() {
            Boneco boneco = null;
            int opc = 0;
            while(opc != 1 && opc != 2) {
                try {
                    opc = input.nextInt();
                    input.nextLine();
                    switch (opc) {
                        case 1:
                            boneco = new JettGoblin();
                            System.out.println("\nVocê escolheu jogar com o Jett Goblin!");
                            break;
                        case 2:
                            boneco = new JohnPork();
                            System.out.println("\nVocê escolheu jogar com o John Pork!");
                            break;
                        default:
                            System.out.println("\nValor inválido. Digite novamente: ");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nTipo de dado digitado não é suportado. Digite novante a ação desejada: ");
                    input.nextLine();
                } catch (Exception e) {
                    System.out.println("\nError: " + e.getMessage() + "Digite novamente o valor ação desejada: ");
                    input.nextLine();
                }
            }
            return boneco;
        }

    public static void menuItem(Boneco jogador, Item item1, Item item2) {
        int opc = 0;
        while(opc != 1 && opc != 2) {
            try {
                opc = input.nextInt();
                input.nextLine();
                switch (opc) {
                    case 1:
                        jogador.adicionarItem(item1);
                        item1.ativarItem(jogador);
                        break;
                    case 2:
                        jogador.adicionarItem(item2);
                        item2.ativarItem(jogador);
                        break;
                    default:
                        System.out.println("\nValor inválido. Digite novamente: ");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nTipo de dado digitado não é suportado. Digite novante a ação desejada: ");
                input.nextLine();
            } catch (Exception e) {
                System.out.println("\nError: " + e.getMessage() + "Digite novamente o valor da ação desejada: ");
                input.nextLine();
            }
        }
    }

    public static void menuBatalha(Boneco jogador, Inimigo inimigo, BolsaSangue bolsa) {
        System.out.println("\nSeu turno: ");
        System.out.println("•O que deseja fazer?");
        System.out.println("1 - Atacar");
        System.out.println("2 - Poder Especial");
        System.out.println("3 - Defender");
        System.out.println("4 - Curar");

        int opc = 0;
        while(opc != 1 && opc != 2 && opc != 3 && opc != 4) {
            try {
                opc = input.nextInt();
                input.nextLine();
                switch (opc) {
                    case 1:
                        jogador.atacar(inimigo);
                        break;
                    case 2:
                        jogador.poderEspecial(inimigo);
                        break;
                    case 3:
                        jogador.defender();
                        break;
                    case 4:
                        jogador.curar(bolsa);
                        break;
                    default:
                        System.out.println("\nValor inválido. Digite novamente: ");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nTipo de dado digitado não é suportado. Digite novante a ação desejada: ");
                input.nextLine();
            } catch (Exception e) {
                System.out.println("\nError: " + e.getMessage() + "Digite novamente o valor da ação desejada: ");
                input.nextLine();
            }
        }
    }
}
