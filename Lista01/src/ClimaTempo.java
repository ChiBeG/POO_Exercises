//a) Atributos: Pluviosidade e Pressao; Métodos: SetPluviosidade(), setPressao(), CalcularMediaPluvial(), CalcularMaximaPluvial(), CalcularPressaoMinima();
//b) Não possui construtor, portando, os atributos não recebem valores.
//c) Não, pois os valores de pluviosidade e pressão precisam ser filtrados.
//d) Porque as temperaturas individuais não precisam ser fornecidas para o programa principal nesse contexto.

public class ClimaTempo {
    public double[] Pluviosidade;
    public double[] Pressao;
    public boolean SetPluviosidade(double[] pl)
    {
        if (pl.length <= 7){
            this.Pluviosidade = pl;
            return true;
        }
        else
            return false;
    }
    public boolean SetPressao(double[] pr)
    {
        if (pr.length <= 7){
            this.Pressao = pr;
            return true;
        }
        else
            return false;
    }
    public double CalcularMediaPluvial()
    {
        double media = 0;
        for(int i = 0; i < this.Pluviosidade.length; i++)
            media += this.Pluviosidade[i];
        media = media / this.Pluviosidade.length;
        return media;
    }
    public double CalcularMaximaPluvial()
    {
        double maximaPluvial;
        maximaPluvial = Pluviosidade[0];
        for(int i = 1; i < this.Pluviosidade.length; i++){
            if (this.Pluviosidade[i] > maximaPluvial)
                maximaPluvial = this.Pressao[i];
        }
        return maximaPluvial;
    }
    public double CalcularPressaoMinima()
    {
        double pressaoMinima;
        pressaoMinima = Pressao[0];
        for(int i = 1; i < this.Pressao.length; i++){
            if (this.Pressao[i] < pressaoMinima)
                pressaoMinima = this.Pressao[i];
        }
        return pressaoMinima;
    }
}
