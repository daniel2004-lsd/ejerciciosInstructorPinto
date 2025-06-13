package trabajosPinto.trabajo_13_junio;

public class PacienteMuerto implements Persona {
      private String nombre;
    private String apellido;
    private String telefono;
    private String estado;
    
    public PacienteMuerto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.estado = "Muerto"; 
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
        return telefono;
    }

    @Override
    public String getEstado() {
        return estado;
    }
}
