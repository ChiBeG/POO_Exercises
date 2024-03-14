public class Main {
    public static void main(String[] args){
        AquaBomber ab1 = new AquaBomber(10, 5, "Azul", 1, 2);
        CycloneBomber cb1 = new CycloneBomber(12, 4, "Cinza", 60, 7);
        EarthBomber eb1 = new EarthBomber(15, 6, "Marrom", 1, 10);
        FireBomber fb1 = new FireBomber(11, 7, "Laranja", 8, 6);

        System.out.println(ab1.nadar());
        System.out.println(ab1.colocarBomba());

        System.out.println(cb1.voar());
        System.out.println(cb1.colocarBomba());

        System.out.println(eb1.rolar());
        System.out.println(eb1.colocarBomba());

        System.out.println(fb1.colocarBomba());
        System.out.println(fb1.explodir());
    }

}