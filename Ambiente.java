public class Ambiente implements Observador {
    private String nombre;
    private String sede;
    private String linea;
    private int capacidad;
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Ambiente(String nombre, String sede, String linea, int capacidad, String tipo) {
        this.nombre = nombre;
        this.sede = sede;
        this.linea = linea;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public void mostrarInfo() {
        System.out.println("🏫 Ambiente: " + nombre +
                " | Sede: " + sede +
                " | Línea: " + linea +
                " | Capacidad: " + capacidad +
                " | Tipo: " + tipo);
    }

    @Override
    public void actualizar(String diaHora) {
        System.out.println("🔔 Instructor " + nombre + " fue asignado al horario: " + diaHora);
    }
}
