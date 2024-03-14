package itens;
import personagens.*;

public final class VandalRGX extends Item {
    private static final int danoItem = 10;
    private static final int chanceAtaqueItem = 5;

    public VandalRGX() {
        nome = "Vandal RGX";
    }

    @Override
    public void ativarItem(Boneco boneco) {
        if(boneco instanceof JettGoblin) {
            System.out.println("\nVocê escolheu a Vandal RGX. Jett se sente familiarizado com o armamento, por conta \n" +
                               "disso ele recebe  um buff de ataque usando-o!");
            boneco.setDanoAtaque(boneco.getDanoAtaque() + danoItem + 5);
            boneco.setChanceAtaque(boneco.getChanceAtaque() + chanceAtaqueItem + 5);
        } else  {
            System.out.println("\nVocê escolheu a Vandal RGX. John segura a arma da mesma forma que um macaco seguraria,\n" +
                               "por conta disso o pontencial da Vandal não consegue ser 100% extraído");
            boneco.setDanoAtaque(boneco.getDanoAtaque() + danoItem);
            boneco.setChanceAtaque(boneco.getChanceAtaque() + chanceAtaqueItem);
        }
    }
}
