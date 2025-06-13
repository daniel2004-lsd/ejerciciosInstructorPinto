package trabajosPinto.trabajo_13_junio;

public interface TrasporteFactory {
    Persona crearPacienteVivo(String nombre, String apellido, String telefono);
    Persona crearPacienteMuerto(String nombre, String apellido, String telefono);
    Persona crearConductor(String nombre, String apellido, String celular);
    Vehiculo crearVehiculo();
}
