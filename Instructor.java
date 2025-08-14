public class Instructor  implements Observador{
    private String nombre;
    private String documento;
    private String area;

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDocumento() {
        return documento;
    }


    public void setDocumento(String documento) {
        this.documento = documento;
    }


    public String getArea() {
        return area;
    }


    public void setArea(String area) {
        this.area = area;
    }


    public Instructor(String nombre, String documento, String area) {
        this.nombre = nombre;
        this.documento = documento;
        this.area = area;
    }
    

    public void mostrarInfo() {
        System.out.println("👨‍🏫 Instructor: " + nombre +
                " | Documento: " + documento +
                " | Área: " + area);
    }
     @Override
    public void actualizar(String diaHora) {
        System.out.println("🔔 Instructor " + nombre + " fue asignado al horario: " + diaHora);
    }
}
