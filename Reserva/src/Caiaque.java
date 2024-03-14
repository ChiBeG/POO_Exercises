public class Caiaque extends Atividade implements Seguranca{
    private int idCaiaque;

    public boolean setIdCaiaque(int idCaiaque){
        if (idCaiaque <= 0)
            throw new IllegalArgumentException("ID do caiaque inválido");
        this.idCaiaque = idCaiaque;
        return true;
    }

    public Caiaque(int horario, int quartoHospede, int duracaoEst, int duracaoTot, String instrutor, int idCaiaque){
        super(horario, quartoHospede, duracaoEst, duracaoTot, instrutor);
        setIdCaiaque(idCaiaque);
    }

    public int calcularTaxa() {
        if (duracaoTot > duracaoEst)
            return 20;
        return 0;
    }

    @Override
    public String equipamentoSeguranca() {
        return "Colete salva-vidas";
    }
}
