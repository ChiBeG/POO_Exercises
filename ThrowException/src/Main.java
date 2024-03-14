import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int op = 1;
        float operando1, operando2;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Operações: ");
            System.out.println("1 - Soma: ");
            System.out.println("2 - Subtração: ");
            System.out.println("3 - Multiplicação: ");
            System.out.println("4 - Divisão: ");
            System.out.println("5 - Raiz quadrada: ");
            System.out.println("0 - Sair");
            System.out.println("Opção: ");
            try {
                op = input.nextInt();
                if (op < 0 || op > 5) {
                    throw new InputMismatchException("Operação inválida!");
                }
                if (op != 0) {
                    System.out.println("Insira os operandos: ");
                    operando1 = input.nextInt();
                    operando2 = input.nextInt();
                    switch (op) {
                        case 1:
                            Soma sum = new Soma(operando1, operando2);
                            System.out.println(sum.getOperando1() + " + " + sum.getOperando2() + " = " + sum.calcular());
                            break;
                        case 2:
                            Subtracao sub = new Subtracao(operando1, operando2);
                            System.out.println(sub.getOperando1() + " + " + sub.getOperando2() + " = " + sub.calcular());
                            break;
                        case 3:
                            Multiplicacao mult = new Multiplicacao(operando1, operando2);
                            System.out.println(mult.getOperando1() + " + " + mult.getOperando2() + " = " + mult.calcular());
                            break;
                        case 4:
                            Divisao div = new Divisao(operando1, operando2);
                            System.out.println(div.getOperando1() + " + " + div.getOperando2() + " = " + div.calcular());
                            break;
                        case 5:
                            RaizQuadrada raiz = new RaizQuadrada(operando1);
                            System.out.println("Raiz quadrada de " + raiz.getOperando());
                            break;
                        default:
                            System.out.println("Operação inválida!");
                            break;
                    }
                }


            }catch(DivisaoPorZeroException e) {
                System.out.println("Erro de divisão - " + e.getMessage());
            }catch (ValorNegativoException e){
                System.out.println("Erro na raíz - " + e.getMessage());
            }catch(InputMismatchException e) {
                System.out.println("Erro de input - " + e.getMessage());
                input.nextLine();
            }catch (IllegalArgumentException e){
                System.out.println("Erro de argumento - " + e.getMessage());

            }catch (Exception e){
                System.out.println("Erro - " + e.getMessage());
            }


        }while (op != 0);







//        try{
//            Soma sum = new Soma(-1, 456);
//            System.out.println(sum.getOperando1()  + " + " + sum.getOperando2() + " = " + sum.calcular());
//        }catch (IllegalArgumentException e){
//            System.out.println("Erro de argumento- " + e.getMessage());
//        }catch (Exception e){
//            System.out.println("Erro - "  + e.getMessage());
//        }
//
//        try{
//            Subtracao sub = new Subtracao(-1, 456);
//            System.out.println(sub.getOperando1()  + " - " + sub.getOperando2() + " = " + sub.calcular());
//        }catch (IllegalArgumentException e){
//            System.out.println("Erro de argumento- " + e.getMessage());
//        }catch (Exception e){
//            System.out.println("Erro - " + e.getMessage());
//        }
//
//        try{
//            Multiplicacao mult = new Multiplicacao(-1, 456);
//            System.out.println(mult.getOperando1()  + " * " + mult.getOperando2() + " = " + mult.calcular());
//        }catch (IllegalArgumentException e){
//            System.out.println("Erro de argumento- " + e.getMessage());
//        }catch (Exception e){
//            System.out.println("Erro - " + e.getMessage());
//        }
//
//        try {
//            Divisao div = new Divisao(3, 0);
//            System.out.println(div.getOperando1()  + " / " + div.getOperando2() + " = " + div.calcular());
//        }catch (IllegalArgumentException e){
//            System.out.println("Erro de argumento - " + e.getMessage());
//        }catch (Exception e){
//            System.out.println("Erro - " + e.getMessage());
//        }
//
//        try {
//            Divisao div = new Divisao(10, 2);
//            System.out.println(div.getOperando1()  + " / " + div.getOperando2() + " = " + div.calcular());
//        }catch (IllegalArgumentException e){
//            System.out.println("Erro de argumento - " + e.getMessage());
//        }catch (Exception e){
//            System.out.println("Erro - " + e.getMessage());
//        }
//
//        try {
//            RaizQuadrada raiz = new RaizQuadrada(-4);
//            System.out.println("Raiz quadrada de " + raiz.getOperando());
//        } catch (IllegalArgumentException e){
//            System.out.println("Erro de argumento - " + e.getMessage());
//        } catch (Exception e){
//            System.out.println("Erro - " + e.getMessage());
//        }
    }
}