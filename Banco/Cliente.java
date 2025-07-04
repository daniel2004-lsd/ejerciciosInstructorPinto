public class Cliente {
    private String nombre;
    private String servicioAdquirido;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.servicioAdquirido = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getServicioAdquirido() {
        return servicioAdquirido;
    }

    public void setServicioAdquirido(String servicioAdquirido) {
        this.servicioAdquirido = servicioAdquirido;
    }
}
