package inimigos;
import personagens.*;
import java.util.Random;

public final class AgenteFBI extends Inimigo {
    public AgenteFBI() {
        setNome("Agente FBI");
        setVida(100);
        setChanceDefesa(40);
        setChanceAtaque(60);
        setDanoAtaque(20);
    }


}
