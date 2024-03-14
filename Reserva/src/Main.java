public class Main {
    public static void main(String[] args) {
        try{
            Tirolesa t1 = new Tirolesa(10, 2, 2, 3, "Junior", "Montanha");
            Tirolesa t2 = new Tirolesa(10, 21, 3, 3, "Marcia", "lago");

            PasseioCavalo pc1 = new PasseioCavalo(10, 1002, 10, 11, "Carlos", 1111);
            Caiaque caiaque = new Caiaque(10, 10032, 4, 4, "Cleiton", 123);
            Caminhada cmd1 = new Caminhada(10, 234, 5, 6, "Mario", "exigente");

            System.out.println("Taxa tirolesa - " + t1.calcularTaxa() + " Equipamento tirolesa - " + t1.equipamentoSeguranca());
            System.out.println("Taxa tirolesa 2 - " + t2.calcularTaxa() + " Equipamento tirolesa - " + t2.equipamentoSeguranca());
            System.out.println("Taxa passeio a cavalo - " + pc1.calcularTaxa() + " Equipamento - " + pc1.equipamentoSeguranca());
            System.out.println("Taxa caiaque - " + caiaque.calcularTaxa() + " Equipamento - " + caiaque.equipamentoSeguranca());
            System.out.println("Taxa caminhada - " + cmd1.calcularTaxa());

        }catch (NivelDificuldadeException e){
            System.out.println("Erro ao inserir a dificuldade - " + e.getMessage());
        }catch (TipoTirolesaException e){
            System.out.println("Erro no tipo de tirolesa - " + e.getMessage());
        }


    }
}