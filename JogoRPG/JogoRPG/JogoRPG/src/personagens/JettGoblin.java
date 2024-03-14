package personagens;
import itens.*;
import inimigos.*;
import java.util.Random;

public final class JettGoblin extends Boneco {
    private static final Random rand = new Random();
    private static int contadorPoderEspecial = 0;

    public JettGoblin() {
        setNome("Jett Goblin");
        setIdade(23);
        setVida(150);
        setChanceDefesa(70);
        setChanceAtaque(60);
        setDanoAtaque(35);
    }

    @Override
    public void contarHistoria() {
        System.out.println("""
                É um goblin nascido e criado em Buriti Bravo. Sua infância foi marcada por preconceito
                e exclusão devido a sua voz irritante, anormal e danosa. Devido a isso, Jett Goblin
                buscou se refugiar em jogos online em busca de aceitação social, porém por trás das
                telas seu tratamento foi pior ainda, sendo excluída até pelos reclusos, que gerou o
                estopim de sua revolta.""");
    }

    @Override
    public void poderEspecial(Inimigo inimigo) {
        if (contadorPoderEspecial < 2) {
            System.out.println("""
                               Jett utiliza o seu poder especial. O inimigo recebe 30 de dano e se encontra
                               em um estado de confusão, cujo seu potencial de ataque foi reduzido""");
            inimigo.setVida(inimigo.getVida() - 30);
            inimigo.setChanceAtaque(inimigo.getChanceAtaque() - 20);
            System.out.println("HP: " + inimigo.getVida());
            contadorPoderEspecial++;
        } else {
            System.out.println("Jett está muito cansada e não pode mais utilizar o poder especial!");
        }
    }

    @Override
    public void adicionarItem(Item item) {
        inventario.add(item);
    }

    @Override
    public void atacar(Inimigo inimigo) {
        int numRand = rand.nextInt(100);
        if (numRand < getChanceAtaque()) {
            numRand = rand.nextInt(100);
            if (numRand < inimigo.getChanceDefesa()) {
                numRand = rand.nextInt(100);
                if (numRand < 10) {
                    System.out.println("Jett acerta o " + inimigo.getNome() + ", mas ele consegue se defender parcialmente. Inimigo sofre pouco dano");
                    inimigo.setVida(inimigo.getVida() - getDanoAtaque() / 3);
                    System.out.println("HP do inimigo: " + inimigo.getVida());
                } else {
                    System.out.println("Jett acerta o " + inimigo.getNome() + ", mas ele consegue se defender totalmente. Inimigo não sofre dano e \n" +
                            "recupera um pouco de vida.");
                    inimigo.setVida(inimigo.getVida() + 10);
                    System.out.println("HP do inimigo: " + inimigo.getVida());
                }
            } else {
                System.out.println("A defesa do " + inimigo.getNome() + " não foi suficiente para deter Jett. Inimigo sofre " + getDanoAtaque() + " dano");
                inimigo.setVida(inimigo.getVida() - getDanoAtaque());
                System.out.println("HP do Inimigo: " + inimigo.getVida());
            }
        } else {
            System.out.println("Jett foi muito lenta no ataque. O inimigo consegue desviar e não sofre nenhum dano!");
            System.out.println("HP do inimigo: " + inimigo.getVida());
        }
    }

    @Override
    public void defender() {
        System.out.println("Jett Goblin escolhe se defender para o turno do inimigo. Sua chance de defesa foi aumentada!");
        setChanceDefesa(getChanceDefesa() + 20);
    }

    @Override
    public void curar(BolsaSangue bolsaSangue) {
        if (inventario.contains(bolsaSangue)) {
            System.out.println("Jett se curou!");
            bolsaSangue.ativarItem(this);
            inventario.remove(bolsaSangue);
            System.out.println("HP atual: " + getVida());
        } else {
            System.out.println("Jett Goblin não possui bolsas de sangue!");
        }
    }
}