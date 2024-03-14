public class Livro implements ItemVendavel{
    private String titulo;
    private double preco;
    private int quantidade;
    private String autor;
    private int paginas;

    public Livro(String titulo, double preco, int quantidade, String autor, int paginas){
        setTitulo(titulo);
        setPreco(preco);
        setQuantidade(quantidade);
        setAutor(autor);
        setPaginas(paginas);
    }

    public boolean setTitulo(String titulo){
        if(!titulo.isEmpty()){
             this.titulo = titulo;
            return true;
        }
        return false;
    }
    public boolean setPreco(double preco){
        if (preco > 0){
            this.preco = preco;
            return true;
        }
        return false;
    }
    public boolean setQuantidade(int quantidade){
        if (quantidade >= 0){
            this.quantidade = quantidade;
            return true;
        }
        return false;
    }
    public boolean setAutor(String autor){
        if (!autor.isEmpty()){
            this.autor = autor;
            return true;
        }
        return false;
    }

    public boolean setPaginas(int paginas){
        if (paginas > 0){
            this.paginas = paginas;
            return true;
        }
        return false;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }
}
