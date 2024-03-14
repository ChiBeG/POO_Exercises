public class CorpoDocente extends Empregado{
    protected long cod_docente;
    public boolean setCod_docente(long cod_docente){
        if (cod_docente > 0){
            this.cod_docente = cod_docente;
            return true;
        }
        else return false;
    }
    public CorpoDocente(long cpf, int idade, String nome, String funcao, long cod_docente ){
        super(cpf, idade, nome, funcao);
        setCod_docente(cod_docente);
    }

    public long getCod_docente() {
        return cod_docente;
    }
}
