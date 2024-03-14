package itens;
import personagens.*;

public final class Trembolona extends Item {
    private static final int danoItem = 10;

    public Trembolona() {
        nome = "Trembolona";
    }

    @Override
    public void ativarItem(Boneco boneco) {
        boneco.setDanoAtaque(boneco.getDanoAtaque() + danoItem);
        System.out.println("Você escolheu o trembolona. " + boneco.getNome() + " aplica a substância e se sente mais forte");
    }
}
