public class Caminhada extends Atividade{
    private String dificuldade;

    public boolean setDificuldade(String dificuldade) throws NivelDificuldadeException {
        dificuldade = dificuldade.toLowerCase();
        if (!(dificuldade.equals("fácil") || dificuldade.equals("moderado") || dificuldade.equals("exigente")))
            throw new NivelDificuldadeException("Dificuldade inválida");
        this.dificuldade = dificuldade;
        return true;
    }

    public Caminhada(int horario, int quartoHospede, int duracaoEst, int duracaoTot, String instrutor, String dificuldade) throws NivelDificuldadeException {
        super(horario, quartoHospede, duracaoEst, duracaoTot, instrutor);
        setDificuldade(dificuldade);
    }

    @Override
    public int calcularTaxa() {
        if (duracaoTot > duracaoEst)
            return 10;
        return 0;
    }
}
