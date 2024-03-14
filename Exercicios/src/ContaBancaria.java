import java.util.Scanner;
public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double valor){
        setSaldo(valor);
    }

    public boolean depositarValor(double valor){
        if (valor > 0){
            setSaldo(this.saldo + valor);
            return true;
        }
        else
            return false;
    }
    public boolean sacarValor(double valor){
        if(valor > 0){
            if (valor + 1.50 <= this.saldo) {
                setSaldo(this.saldo - (valor + 1.50));
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }

    public boolean setSaldo(double valor){
        if (valor >= 0){
            this.saldo = valor;
            return true;
        }
        else
            return false;
    }
    public double getSaldo(){
        return this.saldo;
    }


}
