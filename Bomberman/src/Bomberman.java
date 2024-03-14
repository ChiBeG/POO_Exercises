public class Bomberman {
    private int vida = 10;
    private int velocidade = 5;
    private String cor = "Branco";
    protected Ponto ponto;

    public Bomberman(int vida, int velocidade, String cor, double x, double y){
        setVida(vida);
        setVelocidade(velocidade);
        setCor(cor);
        ponto = new Ponto(x, y);
    }
    public String colocarBomba(){
        return "Colocando bomba na posição " + this.ponto.x + ", " + this.ponto.y;
    }

    public boolean setVida(int vida){
        if (vida > 0){
            this.vida = vida;
            return true;
        }
        else return false;
    }

    public boolean setVelocidade(int velocidade){
        if (velocidade > 0){
            this.velocidade = velocidade;
            return true;
        }
        else return false;
    }

    public boolean setCor(String cor){
        if (!cor.isEmpty()){
            this.cor = cor;
            return true;
        }
        else return false;
    }
}
