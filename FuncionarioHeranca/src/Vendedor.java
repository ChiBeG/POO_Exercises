public class Vendedor extends Funcionario{

    private double bonus;

    public Vendedor(String nome, double salarioBruto, double bonus){
        super(nome, salarioBruto);
        setBonus(bonus);
    }

    public boolean setBonus(double bonus){
        if (bonus >= 0){
            this.bonus = bonus;
            return true;
        }
        return false;
    }

    public double getBonus() {
        return bonus;
    }

    public double salarioLiquido(){
        double salarioBonus = salarioBruto * (1 + (bonus/100));
        return (salarioBonus - Funcionario.calcularIR(salarioBonus));
    }
}
