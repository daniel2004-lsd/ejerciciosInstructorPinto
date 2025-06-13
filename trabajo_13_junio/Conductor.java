package trabajosPinto.trabajo_13_junio;


    public class Conductor implements Persona {
    private String nombre;
    private String apellido;
    private String celular;
    private String estado;

    public Conductor(String nombre, String apellido, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.estado = "conductor"; 
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public String getTelefono() {
        return celular;
    }

    @Override
    public String getEstado() {
        return estado;
    }
}
