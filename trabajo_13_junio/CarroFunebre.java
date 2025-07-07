package trabajosPinto.trabajo_13_junio;

import java.util.ArrayList;
import java.util.List;

public class CarroFunebre implements Vehiculo{
     private Conductor conductor;
    private List<Persona> pacientesMuertos;

    public CarroFunebre() {
        pacientesMuertos = new ArrayList<>();
    }

    @Override
    public void asignarConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public void agregarPersona(Persona persona) {
        if ("muerto".equals(persona.getEstado())) { 
            pacientesMuertos.add(persona);
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Carro Fúnebre:");
        if (conductor != null) {
            System.out.println(" Conductor: " + conductor.getNombre() + " " + conductor.getApellido());
        } else {
            System.out.println(" Conductor: No asignado");
        }
        System.out.println(" Pacientes muertos asignados:");
        for (Persona p : pacientesMuertos) {
            System.out.println("  - " + p.getNombre() + " " + p.getApellido() + " (" + p.getEstado() + ")");
        }
    }
}
