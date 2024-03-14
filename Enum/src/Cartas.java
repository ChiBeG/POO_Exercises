import java.util.Random;
public enum Cartas {
    DOIS(2, "Dois"),
    TRES(3, "Três"),
    QUATRO(4, "Quatro"),
    CINCO(5, "Cinco"),
    SEIS(6, "Seis"),
    SETE(7, "Sete"),
    OITO(8, "Oito"),
    NOVE(9, "Nove"),
    DEZ(10, "Dez"),
    J(10, "Valete"),
    Q(10, "Dama"),
    K(10, "Rei"),
    A(11, "Ás");
    private int valor;
    private String nome;
    private Cartas(int valor, String nome){
        this.nome = nome;
        this.valor = valor;
    }
    public static Cartas sorteio(){
        Cartas [] valores = Cartas.values();
        Random rng = new Random();
        int i = rng.nextInt(13);
        return valores[i];
    }
    public int getValor(){
        return this.valor;
    }
    @Override
    public String toString(){
        return this.nome;
    }
}
