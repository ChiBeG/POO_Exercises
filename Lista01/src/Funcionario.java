public class Funcionario {
    private String primeiroNome, sobreNome;
    private double salarioMensal;

    public Funcionario(){
        setSalarioMensal(0);
        setPrimeiroNome("");
        setSobreNome("");
    }
    public Funcionario(String primeiroNome, String sobreNome, double salarioMensal){
        setPrimeiroNome(primeiroNome);
        setSobreNome(sobreNome);
        setSalarioMensal(salarioMensal);
    }

    public boolean setSalarioMensal(double salarioMensal) {
        if (salarioMensal >= 0 && salarioMensal < 20000){
            this.salarioMensal = salarioMensal;
            return true;
        }
        else{
            return false;
        }
    }
    public void setPrimeiroNome(String primeiroNome){
        this.primeiroNome = primeiroNome;
    }
    public void setSobreNome(String sobreNome){
        this.sobreNome = sobreNome;
    }

    public String getPrimeiroNome(){
        return this.primeiroNome;
    }
    public String getSobreNome(){
        return this.sobreNome;
    }
    public double getSalarioMensal(){
        return this.salarioMensal;
    }
}
