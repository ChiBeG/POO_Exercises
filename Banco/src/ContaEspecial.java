public class ContaEspecial extends Conta{
    private double limite;

    public boolean setLimite(double limite){
        if (limite > 0){
            this.limite = limite;
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public ContaEspecial(double saldo, double limite){
        super(saldo);
        setLimite(limite);
    }

    public boolean sacar(double saque){
        if (saque <= this.limite + this.saldo){
            if (saque > this.saldo){
                saque -= this.saldo;
                this.saldo = 0;
                this.limite -= saque;
            }
            else
                this.saldo -= saque;
            return true;
        }
        return false;
    }

}
