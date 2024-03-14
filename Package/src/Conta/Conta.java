package Conta;

public abstract class Conta {

    protected double saldo;

    public Conta(double saldo){
        setSaldo(saldo);
    }

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

    public boolean sacar(double valor){
        if (valor >= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor){
        if (valor >= 0){
            this.saldo =+ valor;
            return true;
        }
        return false;
    }
}
