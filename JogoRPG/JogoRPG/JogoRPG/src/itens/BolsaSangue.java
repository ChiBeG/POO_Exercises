package itens;
import personagens.*;

public final class BolsaSangue extends Item {
    private static int valorCura = 70;

    public BolsaSangue() {
        nome = "Bolsa de Sangue O-";
    }

    @Override
    public void ativarItem(Boneco boneco) {
        if (boneco instanceof JettGoblin) {
            if (boneco.getVida() + valorCura <= 150) {
                boneco.setVida(boneco.getVida() + valorCura);
            } else {
                valorCura = 150 - boneco.getVida();
                boneco.setVida(150);
            }
        } else if (boneco instanceof JohnPork) {
            if (boneco.getVida() + valorCura <= 200) {
                boneco.setVida(boneco.getVida() + valorCura);
            } else {
                valorCura = 200 - boneco.getVida();
                boneco.setVida(200);
            }
        }
    }
}
