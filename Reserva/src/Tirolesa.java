public class Tirolesa extends Atividade implements Seguranca{
    private String tipo;

    public boolean setTipo(String tipo) throws TipoTirolesaException {
        tipo = tipo.toLowerCase();
        if(!(tipo.equals("lago") || tipo.equals("montanha"))) {
            throw new TipoTirolesaException("Tipo inválido");
        }
        this.tipo = tipo;
        return true;
    }

    public Tirolesa(int horario, int quartoHospede, int duracaoEst, int duracaoTot, String instrutor, String tipo) throws TipoTirolesaException {
        super(horario, quartoHospede, duracaoEst, duracaoTot, instrutor);
        setTipo(tipo);
    }

    public int calcularTaxa(){
        if (duracaoTot > duracaoEst)
            return 50;
        return 0;
    }

    @Override
    public String equipamentoSeguranca() {
        if (tipo.equals("montanha"))
            return "Capacete";
        return "Nenhum";
    }
}
