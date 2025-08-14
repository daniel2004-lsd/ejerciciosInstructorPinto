public class FiltroInstructor implements EstrategiaFiltro {
    private String nombreIstructor;

    public String getNombreIstructor() {
        return nombreIstructor;
    }

    public FiltroInstructor(String nombreIstructor) {
        this.nombreIstructor = nombreIstructor;
    }
    @Override
    public boolean filtrar(Horario horario){
        return horario.getInstructor().getNombre().equalsIgnoreCase(nombreIstructor);
    }
}
