public class FiltroSede  implements EstrategiaFiltro{
    private String sede;

    public FiltroSede(String sede) {
        this.sede = sede;
    }

    public String getSede() {
        return sede;
    }
    // filtro por sede desde el ambiente
    public boolean filtrar(Horario horario){
     return horario.getAmbiente().getSede().equalsIgnoreCase(sede);
    }

}
