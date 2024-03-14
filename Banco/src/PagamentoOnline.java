public class PagamentoOnline extends Pagamento{
    private String numCartao;
    private String bandeira;
    public boolean setNumCartao(String numCartao){
        if (!numCartao.isEmpty() && numCartao.length() <= 16){
            this.numCartao = numCartao;
            return true;
        }
        return false;
    }
    public boolean setBandeira(String bandeira){
        if (!bandeira.isEmpty()){
            this.bandeira = bandeira;
            return true;
        }
        return false;
    }
    public PagamentoOnline(double valor, String data, String numCartao, String bandeira){
        super(valor, data);
        setNumCartao(numCartao);
        setBandeira(bandeira);
    }

    public void exibirDetalhes(){
        System.out.println("Cartão - " + this.numCartao + " - " + this.bandeira);
        System.out.println("Valor: " + this.valor + " - data: " + this.data);
    }
    public boolean processarPagamento(Conta contaBancaria, int parcelas, double juros){
        double valorJuros = (1 + ((juros*parcelas)/100)) * this.valor;
        if (contaBancaria.sacar(valorJuros)){
            return true;
        }
        return false;
    }

}
