
import java.util.HashMap;
public class AlgarismosRomanos {
    private HashMap <Integer, String> unidades = new HashMap <Integer, String>();

    private HashMap<Integer, String> dezenas = new HashMap<Integer, String>();
     private HashMap<Integer, String> centenas = new HashMap<Integer, String>();

     private int numero;

     public boolean setNumero(int numero){
         if (numero > 0 && numero < 1000){
             this.numero = numero;
             return true;
         }
         return false;
     }

    public int getNumero() {
        return numero;
    }

    public AlgarismosRomanos(int numero){
        setNumero(numero);
        unidades.put(0, "");
        unidades.put(1, "I");
        unidades.put(2, "II");
        unidades.put(3, "III");
        unidades.put(4, "IV");
        unidades.put(5, "V");
        unidades.put(6, "VI");
        unidades.put(7, "VII");
        unidades.put(8, "VIII");
        unidades.put(9, "IX");
        dezenas.put(0, "");
        dezenas.put(1, "X");
        dezenas.put(2, "XX");
        dezenas.put(3, "XXX");
        dezenas.put(4, "XL");
        dezenas.put(5, "L");
        dezenas.put(6, "LX");
        dezenas.put(7, "LXX");
        dezenas.put(8, "LXXX");
        dezenas.put(9, "XC");
        centenas.put(0, "");
        centenas.put(1, "C");
        centenas.put(2, "CC");
        centenas.put(3, "CCC");
        centenas.put(4, "CD");
        centenas.put(5, "D");
        centenas.put(6, "DC");
        centenas.put(7, "DCC");
        centenas.put(8, "DCCC");
        centenas.put(9, "CM");

    }

    public String converter(){
        int unidade = numero % 10;
        int dezena = (numero % 100)/ 10;
        int centena = (numero /100);

        String romano = centenas.get(centena) + dezenas.get(dezena) + unidades.get(unidade);
        return romano;
    }




}
