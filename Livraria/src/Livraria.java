public abstract class Livraria{
    public static boolean compra(ItemVendavel item){
        if (item.setQuantidade(item.getQuantidade()+1)){
            System.out.println("Compra realizada com sucesso!");
            return true;
        }
        System.out.println("Falha na realização da compra!!");
        return false;
    }
    public static boolean venda(ItemVendavel item){
        if (item.setQuantidade(item.getQuantidade()-1)){
            System.out.println("Venda realizada com sucesso!");
            return true;
        }
        System.out.println("Não há " + item.getTitulo() + " no estoque!");
        return false;
    }
}
