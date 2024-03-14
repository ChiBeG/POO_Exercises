import java.util.ArrayList;
public class Livro {
    private String titulo, autor;
    private int ano;
    private double preco;

    public Livro (String titulo, String autor, int ano, double preco){
        setTitulo(titulo);
        setAutor(autor);
        setAno(ano);
        setPreco(preco);
    }

    public boolean setTitulo(String titulo){
        if (!titulo.isEmpty()){
            this.titulo = titulo;
            return true;
        }
        else
            return false;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public boolean setAutor(String autor){
        if (!autor.isEmpty()){
            this.autor = autor;
            return true;
        }
        else
            return false;
    }

    public boolean setAno (int ano){
        if (ano >= 0){
            this.ano = ano;
            return true;
        }
        else
            return false;
    }
    public boolean setPreco (double preco){
        if (preco >= 0){
            this.preco = preco;
            return true;
        }
        else
            return false;
    }

    public void exibirDados(){
        System.out.println("Título: " + this.titulo + "\nAutor: " + this.autor + "\nAno: " + this.ano + "\nPreço: " + this.preco);
    }
}
