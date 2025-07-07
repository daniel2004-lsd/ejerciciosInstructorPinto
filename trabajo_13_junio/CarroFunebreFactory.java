package trabajosPinto.trabajo_13_junio;

public class CarroFunebreFactory  implements TrasporteFactory{
    @Override
    public Persona crearPacienteVivo(String nombre, String apellido, String telefono) {
        throw new UnsupportedOperationException("El carro fúnebre no transporta pacientes vivos");
    }

    @Override
    public Persona crearPacienteMuerto(String nombre, String apellido, String telefono) {
        return new PacienteMuerto(nombre, apellido, telefono);
    }

    @Override
    public Persona crearConductor(String nombre, String apellido, String telefono) {
        return new Conductor(nombre, apellido, telefono);
    }

    @Override
    public Vehiculo crearVehiculo() {
        return new CarroFunebre();
    }
}
