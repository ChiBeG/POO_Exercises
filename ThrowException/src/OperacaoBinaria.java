public abstract class OperacaoBinaria extends OperacaoMatematica{
    protected float operando1, operando2;

    public float getOperando1() {
        return operando1;
    }

    public float getOperando2() {
        return operando2;
    }

    public boolean setOperando1(float operando1){
        this.operando1 = operando1;
        return true;
    }

    public boolean setOperando2(float operando2){
        this.operando2 = operando2;
        return true;
    }
}
