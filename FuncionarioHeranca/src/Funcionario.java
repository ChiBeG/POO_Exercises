public class Funcionario {
    protected String nome;
    protected double salarioBruto;


    public static double calcularIR(double salario){
        double ir = 0;
        if (salario > 900 && salario <= 1500)
            ir = 0.15 * salario;
        else if (salario > 1500)
            ir = 0.2 * salario;
        return ir;
    }

    public double salarioLiquido(){
        return (this.salarioBruto - Funcionario.calcularIR(salarioBruto));
    }

    public boolean setNome(String nome){
        if (!nome.isEmpty()){
            this.nome = nome;
            return true;
        }
        return false;
    }

    public boolean setSalarioBruto(double salarioBruto) {
        if (salarioBruto > 0){
            this.salarioBruto = salarioBruto;
            return true;
        }
        return false;
    }

    public Funcionario(String nome, double salarioBruto){
        setNome(nome);
        setSalarioBruto(salarioBruto);
    }
    public String getNome() {
        return nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }
}
