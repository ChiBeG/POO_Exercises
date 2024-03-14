import java.util.HashMap;

public class RNA {
    private String trinca;
    public String aminoacidos = "";
    public  HashMap<String, String> tabela = new HashMap<String, String>();

    public RNA(String trinca){
        setTrinca(trinca);
        tabela.put("UUU", "Phe");
        tabela.put("CUU", "Leu");
        tabela.put("UUA", "Loa");
        tabela.put("AAG", "Lisina");
        tabela.put("UCU", "Ser");
        tabela.put("UAU", "Tyr");
        tabela.put("CAA", "Gin");
    }

    public boolean setTrinca(String trinca){
        trinca = trinca.toUpperCase();
        if (trinca.length() % 3 == 0){
            for (int i = 0; i < trinca.length(); i++){
                if(trinca.charAt(i) != 'U' && trinca.charAt(i) != 'C' && trinca.charAt(i) != 'A' && trinca.charAt(i) != 'G'){
                    return false;
                }
            }
            this.trinca = trinca;
            return true;
        }
        return false;

    }

    public String getTrinca() {
        return trinca;
    }
    public void converter(){
        String split;
        for (int i = 0; i < trinca.length(); i+=3){
            split = trinca.substring(i, i+3);
            aminoacidos += tabela.get(split) + " ";
        }
    }
}
