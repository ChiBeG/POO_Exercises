package inimigos;

import personagens.Boneco;

import java.util.Random;

public abstract class Inimigo implements Obstaculo {
    protected String nome;
    protected int vida;
    protected int chanceDefesa;
    protected int chanceAtaque;
    protected int danoAtaque;
    private final Random rand = new Random();
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().equals("")) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        } else {
            this.nome = nome;
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if(vida > 0) {
            this.vida = vida;
        } else {
            this.vida = 0;
        }
    }

    public int getChanceDefesa() {
        return chanceDefesa;
    }

    public void setChanceDefesa(int chanceDefesa) {
        if(chanceDefesa >= 0 && chanceDefesa <= 100) {
            this.chanceDefesa = chanceDefesa;
        } else {
            throw new IllegalArgumentException("Chance defesa não pode ser abaixo de 0 ou maior que 100!");
        }
    }

    public int getChanceAtaque() {
        return chanceAtaque;
    }

    public void setChanceAtaque(int chanceAtaque) {
        if(chanceAtaque >= 0 && chanceAtaque <= 100) {
            this.chanceAtaque = chanceAtaque;
        }
    }

    public int getDanoAtaque() {
        return danoAtaque;
    }

    public void setDanoAtaque(int danoAtaque) {
        this.danoAtaque = danoAtaque;
    }

    @Override
    public void atacar(Boneco boneco) {
        int numRand = rand.nextInt(100);
        if (numRand < getChanceAtaque()) {
            numRand = rand.nextInt(100);
            if (numRand < boneco.getChanceDefesa()) {
                numRand = rand.nextInt(100);
                if (numRand < 10) {
                    System.out.println(boneco.getNome() + " conseguiu se defender parcialmente. " + boneco.getNome() + " recebe um pouco de dano!");
                    boneco.setVida(boneco.getVida() - getDanoAtaque() / 3);
                    System.out.println("HP do " + boneco.getNome() + ": " + boneco.getVida());
                } else {
                    System.out.println(boneco.getNome() + " conseguiu se defender totalmente. " + boneco.getNome() + " recupera um pouco de vida e o agente do \n" +
                            "FBI fica um pouco atordoado, seu potencial de ataque é levemente reduzido");
                    boneco.setVida(boneco.getVida() + 10);
                    setChanceAtaque(getChanceAtaque() - 3);
                    System.out.println("HP do " + boneco.getNome() + ": " + boneco.getVida());
                }
            } else {
                System.out.println(boneco.getNome() + " não conseguiu se defender.");
                boneco.setVida(boneco.getVida() - getDanoAtaque());
                System.out.println("HP do " + boneco.getNome() + ": " + boneco.getVida());
            }
        } else {
            System.out.println("Ataque do inimigo foi muito lento. " + boneco.getNome() + " conseguiu desviar.");
        }
    }

    @Override
    public void defender() {
        System.out.println("Chance de defesa do inimigo foi aumentada para o próximo turno.");
        setChanceDefesa(getChanceDefesa() + 15);
    }
}