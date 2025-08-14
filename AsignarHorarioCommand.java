public class AsignarHorarioCommand implements Command {
    private String diaHora;
    private Instructor instructor;
    private Ambiente ambiente;
    private String jornada;

    public AsignarHorarioCommand(String diaHora, Instructor instructor, Ambiente ambiente, String jornada) {
        this.diaHora = diaHora;
        this.instructor = instructor;
        this.ambiente = ambiente;
        this.jornada = jornada;
    }

    @Override
    public void ejecutar() {
        Horario nuevo = new Horario(diaHora, instructor, ambiente,jornada);
        HorarioObservable observable = new HorarioObservable();
        observable.agregarObservador(instructor);
        observable.agregarObservador(ambiente);
        observable.notificar(diaHora);
        SistemaHorarios.getInstancia().registrarHorario(    nuevo);
        System.out.println("Horario asignado correctamente.");
        nuevo.mostrar();

    }
}
