import java.lang.Math;
public final class RaizQuadrada extends OperacaoUnaria{
    public float calcular(){
        return (float) Math.sqrt(this.operando);

    }

    public RaizQuadrada(float operando){
        setOperando(operando);
    }
    public boolean setOperando(float operando){
        if (operando < 0){
            throw new ValorNegativoException("Operando deve ser maior ou igual a 0");
        }
        this.operando = operando;
        return true;
    }
}
