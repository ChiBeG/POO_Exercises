public final class Divisao extends OperacaoBinaria{
    public float calcular(){
        return operando1/operando2;
    }


    public Divisao(float operando1, float operando2){
        setOperando1(operando1);
        setOperando2(operando2);
    }

    @Override
    public boolean setOperando2(float operando2) {
        if (operando2 == 0){
            throw new DivisaoPorZeroException("O divisor dever ser diferente de 0");
        }
        this.operando2 = operando2;
        return true;
    }
}
