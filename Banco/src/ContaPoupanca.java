public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo){
        super(saldo);
    }

    public boolean render(double rendimento){
        if (rendimento > 0){
            this.saldo *= 1 + (rendimento/100);
            return true;
        }
        return false;
    }
}
