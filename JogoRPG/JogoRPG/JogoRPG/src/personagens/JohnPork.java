package personagens;
import itens.*;
import inimigos.*;
import java.util.Random;

public final class JohnPork extends Boneco {
    private static final Random rand = new Random();
    private static int contadorPoderEspecial = 0;

    public JohnPork() {
        setNome("John Pork");
        setIdade(32);
        setVida(200);
        setChanceDefesa(60);
        setChanceAtaque(70);
        setDanoAtaque(30);
    }

    @Override
    public void contarHistoria() {
        System.out.println("""
                John Pork é metade humano e metade porco que foi gerado, através de muito sofrimento
                em um laboratório embriológico em Wuhan, o que faz da humanidade o seu inimigo
                principal. Após a sua fuga, o governo fez de tudo para esconder a sua existência,
                porém muitas pessoas são recorrentemente atormentadas por suas ligações.""");
    }

    @Override
    public void poderEspecial(Inimigo inimigo) {
        if(contadorPoderEspecial < 3) {
            System.out.println("""
                               Você utiliza o poder especial de John Pork. O inimigo recebe 30 de dano e se encontra
                               em um estado de choque gerado pelo medo, cujo seu potencial de defesa foi reduzido.""");
            inimigo.setVida(inimigo.getVida() - 30);
            inimigo.setChanceDefesa(inimigo.getChanceDefesa() - 20);
            System.out.println("HP: " + inimigo.getVida());
            contadorPoderEspecial++;
        } else {
            System.out.println("Você não pode utilizar mais o poder especial!");
        }
    }

    @Override
    public void adicionarItem(Item item) {
        inventario.add(item);
    }

    @Override
    public void atacar(Inimigo inimigo) {
        int numRand = rand.nextInt(100);
        if(numRand < getChanceAtaque()) {
            numRand = rand.nextInt(100);
            if(numRand < inimigo.getChanceDefesa()) {
                numRand = rand.nextInt(100);
                if(numRand < 10) {
                    System.out.println("John acerta o " + inimigo.getNome() + ", mas ele consegue se defender parcialmente. Inimigo sofre pouco dano");
                    inimigo.setVida(inimigo.getVida() - getDanoAtaque() / 3);
                    System.out.println("HP do inimigo: " + inimigo.getVida());
                } else {
                    System.out.println("John acerta o " + inimigo.getNome() + ", mas ele consegue se defender totalmente. Inimigo não sofre dano e recupera \n" +
                            "um pouco de vida.");
                    inimigo.setVida(inimigo.getVida() + 10);
                    System.out.println("HP do inimigo: " + inimigo.getVida());
                }
            } else {
                System.out.println("A defesa do " + inimigo.getNome() + " não foi suficiente para deter John. Inimigo sofre " + getDanoAtaque() + "dano");
                inimigo.setVida(inimigo.getVida() - getDanoAtaque());
                System.out.println("HP do Inimigo: " + inimigo.getVida());
            }
        } else {
            System.out.println("John foi muito lento no ataque. O inimigo consegue desviar e não sofre nenhum dano!");
            System.out.println("HP do inimigo: " + inimigo.getVida());
        }
    }

    @Override
    public void defender() {
        System.out.println("John Pork escolhe se defender para o turno do inimigo. Sua chance de defesa foi aumentada!");
        setChanceDefesa(getChanceDefesa() + 20);
    }

    @Override
    public void curar(BolsaSangue bolsaSangue) {
        if(inventario.contains(bolsaSangue)) {
            System.out.println("Você se curou!");
            bolsaSangue.ativarItem(this);
            inventario.remove(bolsaSangue);
            System.out.println("HP atual: " + getVida());
        } else {
            System.out.println("John não possui bolsas de sangue!");
        }
    }
}
