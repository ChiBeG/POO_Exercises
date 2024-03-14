public abstract class Atividade {
    protected int horario, quartoHospede, duracaoEst, duracaoTot;
    protected String instrutor;

    public boolean setDuracaoEst(int duracaoEst) {
        if (duracaoEst <= 0)
            throw new IllegalArgumentException("Duração estimada inválida");
        this.duracaoEst = duracaoEst;
        return true;
    }

    public boolean setDuracaoTot(int duracaoTot){
        if (duracaoTot <= 0)
            throw new IllegalArgumentException("Duração total inválida");
        this.duracaoTot = duracaoTot;
        return true;
    }

    public boolean setQuartoHospede(int quartoHospede){
        if (quartoHospede <= 0)
            throw new IllegalArgumentException("Valor inválido para quarto");
        this.quartoHospede = quartoHospede;
        return true;
    }

    public boolean setHorario(int horario){
        if (horario <= 0)
            throw new IllegalArgumentException("Horário inválido");
        this.horario = horario;
        return true;
    }

    public boolean setInstrutor(String instrutor){
        if (instrutor.isEmpty() || instrutor.isBlank())
            throw new IllegalArgumentException("Valor inválido para o nome do instrutor");
        this.instrutor = instrutor;
        return true;
    }

    public Atividade(){

    }
    public Atividade(int horario, int quartoHospede, int duracaoEst, int duracaoTot, String instrutor){
        setDuracaoEst(duracaoEst);
        setDuracaoTot(duracaoTot);
        setHorario(horario);
        setQuartoHospede(quartoHospede);
        setInstrutor(instrutor);
    }

    public abstract int calcularTaxa();
}
