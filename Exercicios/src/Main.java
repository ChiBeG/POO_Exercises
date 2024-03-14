import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria(0);

        int opt;
        double valor;

        do{
            System.out.println("Escolha a operação a ser realizada: ");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            System.out.println("Opção: ");

            opt = input.nextInt();

            switch (opt) {
                case 1 -> {
                    System.out.println("Insira o valor a ser sacado: ");
                    valor = input.nextDouble();
                    if (conta1.sacarValor(valor)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else
                        System.out.println("Erro ao efetuar o saque!");
                }
                case 2 -> {
                    System.out.println("Insira o valor a ser depositado: ");
                    valor = input.nextDouble();
                    if (conta1.depositarValor(valor)) {
                        System.out.println("Deposito realizado com sucesso!");
                    } else
                        System.out.println("Erro ao efetuar o depósito!");
                }
                case 3 -> System.out.println("Seu saldo é: " + conta1.getSaldo());
                default -> {
                }
            }



        }while (opt != 4);

        Data data1 = new Data (29, 2, 2023);
        Data data2 = new Data (1,1,1002);
        Data data3 = new Data (13, 15, 9);
        Data data4 = new Data (32, 1, 2020);
        Data data5 = new Data (31, 11, 9);

        data1.imprime('.');
        data2.imprime('.');
        data3.imprime('.');
        data4.imprime('.');
        data5.imprime('.');

    }
}