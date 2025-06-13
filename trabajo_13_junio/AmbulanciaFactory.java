package trabajosPinto.trabajo_13_junio;

public class AmbulanciaFactory implements TrasporteFactory {
     @Override
    public Persona crearPacienteVivo(String nombre, String apellido, String telefono) {
        return new PacienteVivo(nombre, apellido, telefono);
    }

    @Override
    public Persona crearPacienteMuerto(String nombre, String apellido, String celular) {
        throw new UnsupportedOperationException("Ambulancia no transporta pacientes muertos");
    }

    @Override
    public Persona crearConductor(String nombre, String apellido, String celular) {
        return new Conductor(nombre, apellido, celular);
    }

    @Override
    public Vehiculo crearVehiculo() {
        return new Ambulancia();
    }
}
