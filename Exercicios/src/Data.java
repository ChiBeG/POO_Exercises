public class Data {
    private int dia, mes, ano;
    public Data (int dia, int mes, int ano){
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }
    public boolean ehValida(){
        if (this.mes == 2){
            if (!ehBissexto()){
                if (this.dia >= 1 && this.dia <= 28)
                    return true;
                else
                    return false;
            }
            else if (this.dia >= 1 && this.dia <= 29)
                return true;
            else
                return false;
        }
        else if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12){
            if (this.dia >= 1 && this.dia <= 31)
                return true;
            else
                return false;
        }
        else if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11){
            if (this.dia >= 1 && this.dia <= 30)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public boolean ehBissexto(){
        if ((this.ano % 4 == 0 && this.ano % 100 != 0) || this.ano % 400 == 0)
            return true;
        else
            return false;
    }
    public void imprime(char separador){
        if (separador == 0)
            separador = '/';
        if (ehValida())
            System.out.printf("%d%c%d%c%d\n", dia, separador, mes, separador, ano);
        else
            System.out.println("A data é inválida");
    }

    public boolean setDia(int dia) {
        if (this.mes == 2){
            if (!ehBissexto()){
                if (dia >= 1 && dia <= 28){
                    this.dia = dia;
                    return true;
                }
                else
                    return false;
            }
            else if (dia >= 1 && dia <= 29){
                this.dia = dia;
                return true;
            }
            else
                return false;
        }
        else if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12){
            if (dia >= 1 && dia <= 31){
                this.dia = dia;
                return true;
            }
            else
                return false;
        }
        else{
            if (dia >= 1 && dia <= 30){
                this.dia = dia;
                return true;
            }
            else
                return false;
        }
    }
    public boolean setMes(int mes){
        if (mes >= 1 && mes <= 12){
            this.mes = mes;
            return true;
        }
        else
            return false;
    }
    public boolean setAno(int ano){
        if (ano > 0){
            this.ano = ano;
            return true;
        }
        else
            return false;
    }
}
