package itens;
import personagens.*;

public final class HuaweiP50 extends Item {
    private static final int danoItem = 5;
    private static final int chanceAtaqueItem = 10;

    public HuaweiP50() {
       nome = "Huawei P50";
    }

    @Override
    public void ativarItem(Boneco boneco) {
        if(boneco instanceof JohnPork) {
            System.out.println("\nVocê escolheu o Huawei P50. John ao segurar o dispositivo, sente que parece que ele foi feito por \n" +
                               "encomenda. A afinidade entre o celular e ele é tamanha, que John recebe um buff de ataque usando-o");
            boneco.setDanoAtaque(boneco.getDanoAtaque() + danoItem + 5);
            boneco.setChanceAtaque(boneco.getChanceAtaque() + chanceAtaqueItem + 5);
        } else if (boneco instanceof JettGoblin) {
            System.out.println("\nVocê escolheu o Huawei P50. Jett segura o celular sem entender muito como utiliza-lo, mas\n" +
                               "consegue extrair um pouco das funcionalidades mortíferas do aparelho");
            boneco.setDanoAtaque(boneco.getDanoAtaque() + danoItem);
            boneco.setChanceAtaque(boneco.getChanceAtaque() + chanceAtaqueItem);
        }
    }
}
