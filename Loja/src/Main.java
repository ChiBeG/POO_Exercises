public class Main {
    public static void main(String [] args){
        Livro l1 = new Livro(1, "Crime e Castigo", 60, 2, "Dostoievski");
        CD cd1 = new CD(2, "Room on Fire", 50, 0.4, "The Strokes");
        Software sw1 = new Software(3, "Office", 100, 0.2, "Utilitário");

        System.out.println(l1.getCod() + " - " + l1.getDescricao() + " - preço: " + l1.getPreco() + " - peso: " + l1.getPeso() + " - autor: " + l1.getNomeAutor());
        System.out.println(cd1.getCod() + " - " + cd1.getDescricao() + " - preço: " + cd1.getPreco() + " - peso: " + cd1.getPeso() + " - banda: " + cd1.getNomeBanda());
        System.out.println(sw1.getCod() + " - " + sw1.getDescricao() + " - preço: " + sw1.getPreco() + " - peso: " + sw1.getPeso() + " - categoria: " + sw1.getCategoria());


    }
}
