public enum Conceitos {

    PESSIMO(0, 2.9, "Péssimo"),
    RUIM(3, 4.9, "Ruim"),
    REGULAR(5, 6.9, "Regular"),
    BOM(7, 8.9, "Bom"),
    MUITO_BOM(9, 10, "Muito Bom");

    private double notaMinima, notaMaxima;
    private String nome;

    private Conceitos(double notaMinima, double notaMaxima, String nome){
        this.notaMinima = notaMinima;
        this.notaMaxima = notaMaxima;
        this.nome = nome;
    }

    public double getNotaMinima(){
        return this.notaMinima;
    }
    public double getNotaMaxima(){
        return this.notaMaxima;
    }
    public String getNome(){
        return this.nome;
    }

    @Override

    public String toString(){
        return this.nome;
    }
}
