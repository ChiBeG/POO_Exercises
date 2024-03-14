import java.util.Date;

public class PagamentoBoleto extends Pagamento{
    private String numBoleto, dataVencimento;
    public boolean vencido = false;
    public boolean setNumBoleto(String numBoleto){
        if (!numBoleto.isEmpty()){
            this.numBoleto = numBoleto;
            return true;
        }
        return false;
    }
    public boolean setDataVencimento(String dataVencimento){
        if(!dataVencimento.isEmpty()){
            this.dataVencimento = dataVencimento;
            return true;
        }
        return false;
    }
    public PagamentoBoleto(double valor, String data, String numBoleto, String dataVencimento){
        super(valor, data);
        setNumBoleto(numBoleto);
        setDataVencimento(dataVencimento);
        if (data.compareTo(dataVencimento) > 0){
            vencido = true;
        }
    }
    public void exibirDetalhes(){
        System.out.println("Boleto  - " + this.numBoleto + " - " + this.dataVencimento);
        System.out.println("Valor: " + this.valor + " - data: " + this.data);
        if (vencido)
            System.out.println("VENCIDO");
    }
    public boolean processarPagamento(Conta contaBancaria, double multa){
        if (contaBancaria.sacar(valor + multa)){
            return true;
        }
        return false;
    }


}
