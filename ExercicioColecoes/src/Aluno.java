public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    public boolean setIdade(int idade){
        if (idade >= 3){
            this.idade = idade;
            return true;
        }
        else
            return false;
    }

    public boolean setNome(String nome){
        if (!nome.isEmpty()){
            this.nome = nome;
            return true;
        }
        else{
            return false;
        }
    }

    public int getIdade(){
        return this.idade;
    }
    public String getNome(){
        return this.nome;
    }

    public void exibir_informacoes(){
        System.out.println("Nome: " + this.nome + " - idade: " + this.idade);
    }
}
