public class Main {
    public static void main(String[] args){
        Livro l1 = new Livro("Crime e Castigo", 60, 3, "Dostoievski", 600);

        Livraria.compra(l1);
        System.out.println(l1.getQuantidade());

        Livraria.venda(l1);
        System.out.println(l1.getQuantidade());
        Livraria.venda(l1);
        Livraria.venda(l1);
        Livraria.venda(l1);
        Livraria.venda(l1);
    }
}