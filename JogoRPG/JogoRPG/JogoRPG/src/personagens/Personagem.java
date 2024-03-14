package personagens;
import itens.*;
import inimigos.*;

public interface Personagem {
    void contarHistoria();
    void poderEspecial(Inimigo inimigo);
    void adicionarItem(Item item);
    void atacar(Inimigo inimigo);
    void defender();
    void curar(BolsaSangue bolsaSangue);
}
