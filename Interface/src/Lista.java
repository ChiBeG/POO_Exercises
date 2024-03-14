import java.util.ArrayList;

public class Lista implements Printable {

    public ArrayList<String> lista = new ArrayList<String>();

    public boolean adicionarNome(String nome) {
        if (!nome.isEmpty()) {
            lista.add(nome);
            return true;
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < lista.size(); i++)
            System.out.println(lista.get(i));
    }
}

