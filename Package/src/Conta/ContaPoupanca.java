package Conta;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo){
        super(saldo);
    }

    public void render(double porcentagem){
        if (porcentagem > 0)
            this.saldo *= 1 + (porcentagem/100);
    }

}
