public class Main {
    public static void main(String[] args){
        Conta c1 = new Conta(4000);
        ContaPoupanca cp1 = new ContaPoupanca(3400);
        ContaEspecial ce1 = new ContaEspecial(2500, 1000);



        PagamentoOnline po1 = new PagamentoOnline(3000, "22012024", "776857387", "Visa");
        PagamentoOnline po2 = new PagamentoOnline(300, "121212", "23232323", "Master");

        po1.exibirDetalhes();
        po2.exibirDetalhes();

        if (po1.processarPagamento(c1))
            System.out.println("PO1 foi");

        if(po2.processarPagamento(ce1, 2, 1))
            System.out.println("PO2 foi");

        System.out.println(c1.getSaldo());

        PagamentoBoleto pb1 = new PagamentoBoleto(100, "20221111", "4234234234", "20221112");

        if (pb1.vencido)
            pb1.processarPagamento(cp1, 35);
        else
            pb1.processarPagamento(cp1);

        System.out.println(cp1.getSaldo());

    }
}