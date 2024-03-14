import java.util.Random;
public class Tweet {
    private String paragrafo;


    public boolean setParagrafo(String paragrafo){
        paragrafo.trim();
        if (paragrafo.length() > 0 && paragrafo.length() <= 144){
            this.paragrafo = paragrafo;
            return true;
        }
        else
            return false;
    }

    public String getParagrafo(){
        return this.paragrafo;
    }

    public int quantidadeCaracteres(){
        return this.paragrafo.length();
    }

    public int quantidadeFrases(){
        int frases = 1;
        for (int i = 1; i < this.paragrafo.length(); i++){
            if (paragrafo.charAt(i) == ' ') {
                if(paragrafo.charAt(i-1) == '.' || paragrafo.charAt(i-1) == ',' || paragrafo.charAt(i-1) == ';' || paragrafo.charAt(i-1) == '!' || paragrafo.charAt(i-1) == '?')
                frases++;
            }
        }

        return frases;
    }

    public int quantidadePalavras(){
        String [] paragrafoSplit = paragrafo.split(" ");
        return paragrafoSplit.length;
    }

    public int ocorrenciasPalavra(String palavra){
        int ocorrencias = 0;
        String [] paragrafoSplit = paragrafo.split(" ");
        for (int i = 0; i < paragrafoSplit.length; i++){
            if (paragrafoSplit[i].toLowerCase().contains(palavra.toLowerCase()))
                ocorrencias++;
        }
        return ocorrencias;
    }

    public static String gerarParagrafo(int tamanho){
        char paragrafoGerado[] = new char[tamanho];
        Random rng = new Random();
        for (int i = 0; i < tamanho; i++){
            char caracter = (char)('a' + rng.nextInt(26));
            paragrafoGerado[i] = caracter;
        }
        String resultado = new String(paragrafoGerado);
        return resultado;
    }
}
