public class Cifra {
    public String Criptografar(String texto){
        String resultado = "";
        char letra;
        for (int i=0; i < texto.length(); i++){
            letra = texto.charAt(i);

            if (letra >= 'a' && letra <= 'z'){
                letra = (char) (letra + 3);
                if (letra > 'z'){
                    letra = (char) (letra + 'a' - 'z'-1);
                }
                resultado += letra;
            }
            else if (letra >= 'A' && letra <= 'Z'){
                letra = (char) (letra + 3);
                if (letra > 'Z'){
                    letra = (char) (letra + 'A' - 'Z'-1);
                }
                resultado += letra;
            }
            else{
                resultado += letra;
            }
        }
        return resultado;

    }
    public String Descriptografar(String texto){
        String resultado = "";
        char letra;
        for (int i=0; i < texto.length(); i++){
            letra = texto.charAt(i);

            if (letra >= 'a' && letra <= 'z'){
                letra = (char) (letra - 3);
                if (letra < 'a'){
                    letra = (char) (letra + 'z' - 'a'+1);
                }
                resultado += letra;
            }
            else if (letra >= 'A' && letra <= 'Z'){
                letra = (char) (letra - 3);
                if (letra < 'A'){
                    letra = (char) (letra + 'Z' - 'A'+1);
                }
                resultado += letra;
            }
            else{
                resultado += letra;
            }
        }
        return resultado;
    }
}
