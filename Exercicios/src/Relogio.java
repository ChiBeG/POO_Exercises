public class Relogio {
    public int segundos, minutos, horas;

    public void mostrarHora(){
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
    public int totalizarSegundos(){
        segundos += horas*3600 + minutos*60;
        return segundos;
    }
}
