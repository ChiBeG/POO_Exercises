public class PasseioCavalo extends Atividade implements Seguranca{
    private int idCavalo;

    public boolean setIdCavalo(int idCavalo){
        if (idCavalo <= 0)
            throw new IllegalArgumentException("ID do Cavalo inválida");
        this.idCavalo = idCavalo;
        return true;
    }

    public PasseioCavalo(int horario, int quartoHospede, int duracaoEst, int duracaoTot, String instrutor, int idCavalo){
        super(horario, quartoHospede, duracaoEst, duracaoTot, instrutor);
        setIdCavalo(idCavalo);

    }

    public int calcularTaxa(){
        if (duracaoTot > duracaoEst)
            return 60;
        return 0;
    }

    @Override
    public String equipamentoSeguranca() {
        return "Capacete";
    }


}
