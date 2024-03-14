package itens;
import personagens.*;

public abstract class Item {
    protected String nome;

    public abstract void ativarItem(Boneco boneco);
}
