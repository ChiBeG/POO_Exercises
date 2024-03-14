package Conta;

public class ContaEspecial extends Conta{
    private double limite;
    public boolean setLimite(double valor){
        if (valor > 0){
            this.limite = limite;
            return true;
        }
        return false;
    }

    public ContaEspecial(double saldo, double limite){
        super(saldo);
        setLimite(limite);
    }
}
