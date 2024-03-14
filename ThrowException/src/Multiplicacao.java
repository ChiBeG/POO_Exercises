public final class Multiplicacao extends OperacaoBinaria{
    public Multiplicacao(float operando1, float operando2){
        setOperando1(operando1);
        setOperando2(operando2);
    }
    public float calcular(){
        return operando1 * operando2;
    }
}
