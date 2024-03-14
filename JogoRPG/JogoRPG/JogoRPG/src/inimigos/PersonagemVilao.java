package inimigos;

import personagens.Boneco;
import personagens.JettGoblin;
import personagens.JohnPork;

public class PersonagemVilao extends Inimigo {
    public PersonagemVilao() {}

    public void converterPersonagem(Boneco boneco) {
        if(boneco instanceof JohnPork) {
            JettGoblin jett = new JettGoblin();
            setNome(jett.getNome());
            setVida(jett.getVida());
            setChanceAtaque(jett.getChanceAtaque());
            setChanceDefesa(jett.getChanceDefesa());
            setDanoAtaque(jett.getDanoAtaque());
        } else if (boneco instanceof JettGoblin) {
            JohnPork john = new JohnPork();
            setNome(john.getNome());
            setVida(john.getVida());
            setChanceAtaque(john.getChanceAtaque());
            setChanceDefesa(john.getChanceDefesa());
            setDanoAtaque(john.getDanoAtaque());
        }
    }
}
