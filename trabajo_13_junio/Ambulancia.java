package trabajosPinto.trabajo_13_junio;

import java.util.ArrayList;
import java.util.List;

public class Ambulancia implements Vehiculo {
     private Conductor conductor;
    private List<Persona> pacientes;

    public Ambulancia() {
        pacientes = new ArrayList<>();
    }

    @Override
    public void asignarConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public void agregarPersona(Persona persona) {
        if (!"muerto".equals(persona.getEstado())) { // solo pacientes vivos
            pacientes.add(persona);
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Ambulancia:");
        if (conductor != null) {
            System.out.println(" Conductor: " + conductor.getNombre() + " " + conductor.getApellido());
        } else {
            System.out.println(" Conductor: No asignado");
        }
        System.out.println(" Pacientes asignados:");
        for (Persona p : pacientes) {
            System.out.println("  - " + p.getNombre() + " " + p.getApellido() + " (" + p.getEstado() + ")");
        }
    }
}
