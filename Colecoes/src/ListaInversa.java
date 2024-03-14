import java.util.ArrayList;
import java.util.Scanner;
public class ListaInversa {
    public static void main(String []args){
        String s;
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int ocorrencias;
        do{
            System.out.println("Insira a string: ");
            s = input.nextLine();

            ocorrencias = 0;

            if (!s.isEmpty()){
                for (int i = 0; i < list.size(); i++){
                    if (s.equals(list.get(i)))
                        ocorrencias++;
                }
                if (ocorrencias == 0){
                    list.add(s);
                }
            }

        }while(!s.isEmpty());

        for (int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i));
        }
    }
}