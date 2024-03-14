public abstract class Pagamento {
    protected double valor;
    protected String data; // data - AAAA/MM/DD
    public boolean setValor(double valor){
        if(valor >= 0){
            this.valor = valor;
            return true;
        }
        return false;
    }
    public boolean setData(String data){
        if (!data.isEmpty()){
            this.data = data;
            return true;
        }
        return false;
    }
    public Pagamento(double valor, String data){
        setValor(valor);
        setData(data);
    }

    public double getValor(){
        return this.valor;
    }
    public String getData(){
        return this.data;
    }
    public abstract void exibirDetalhes();
    public boolean processarPagamento(Conta contaBancaria){
        if (contaBancaria.sacar(valor)){
            return true;
        }
        return false;
    }

}
