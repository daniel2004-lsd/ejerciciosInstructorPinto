public class FiltroJornada implements EstrategiaFiltro {
    private String jornada;

    public String getJornada() {
        return jornada;
    }

    public FiltroJornada(String jornada) {
        this.jornada = jornada;
    }

    public boolean filtrar(Horario horario){
        return horario.getJornada().equalsIgnoreCase(jornada);
    }
}
