package itens;
import personagens.*;

public final class TampaLixo extends Item {
    private static final int defesaItem = 7;

    public TampaLixo() {
        nome = "Tampa de lixo";
    }

    @Override
    public void ativarItem(Boneco boneco) {
        boneco.setChanceDefesa(boneco.getChanceDefesa() + defesaItem);
        System.out.println("Você escolheu a tampa de lixo. " + boneco.getNome() + " se sente mais protegido e irá usar o lixo como escudo.");
    }
}
