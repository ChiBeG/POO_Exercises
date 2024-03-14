package inimigos;

import personagens.Boneco;

import java.util.Random;

public class ManuelGomes extends Inimigo {
    public ManuelGomes() {
        setNome("Agente FBI");
        setVida(170);
        setChanceDefesa(40);
        setChanceAtaque(70);
        setDanoAtaque(40);
    }

    public void poderEspecial(Boneco boneco) {
        System.out.println("Manuel Gomes começa a cantar: Eu vou deixar de ser besta e arrumar uma mulher pra mim!");
        System.out.println("Isso atordoa e causa dano ao " + boneco.getNome() + ", a chance de ataque dele diminuiu " +
                "\nno próximo turno");
        boneco.setVida(boneco.getVida() - 60);
        boneco.setChanceAtaque(boneco.getChanceAtaque() - 20);

    }
}
