public class Estagiario extends Funcionario{

    public Estagiario(String nome, double salarioBruto){
        super(nome, salarioBruto);
    }
    public double salarioLiquido(){
        return this.salarioBruto;
    }
}
