public class Exemplo1 {

    public enum Planeta{
        MERCURIO, VENUS, TERRA, MARTE, JUPITER, SATURNO, URANO, NETUNO;
    }

    public static void main(String [] args){
        Planeta p1, p2;
        p1 = Planeta.MARTE;
        p2 = Planeta.valueOf("TERRA");

        if (p1.equals(p2)){
            System.out.println("P1 e P2 são iguais");
        }

        System.out.println("Planeta 1: " + p1.name());
        System.out.println("Planeta 2: "  + p2.name());

        for(Planeta p : Planeta.values()){
            System.out.println(p.ordinal() + " - " + p.toString());
        }
    }
}
