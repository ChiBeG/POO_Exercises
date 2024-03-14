public abstract class OperacaoUnaria extends OperacaoMatematica{
    protected float operando;

    public float getOperando() {
        return operando;
    }

    abstract boolean setOperando(float operando);
}
