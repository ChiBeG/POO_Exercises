public class Administrador extends CorpoDocente{
    private String area;
    public boolean setArea(String area){
        if (!area.isEmpty()){
            this.area = area;
            return true;
        }
        else return false;
    }

    public Administrador(long cpf, int idade, String nome, String funcao, long cod_docente, String area){
        super(cpf, idade, nome, funcao, cod_docente);
        setArea(area);
    }

    public String getArea() {
        return area;
    }
}
