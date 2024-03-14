public class Conta {
    protected double saldo;

    public boolean setSaldo(double saldo){
        if (saldo > 0){
            this.saldo = saldo;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public Conta (double saldo){
        setSaldo(saldo);
    }

    public boolean depositar(double deposito){
        if (deposito > 0){
            this.saldo += deposito;
            return true;
        }
        return false;
    }

    public boolean sacar(double saque){
        if (saque <= this.saldo){
            this.saldo -= saque;
            return true;
        }
        return false;
    }


}
