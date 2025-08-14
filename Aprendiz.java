public class Aprendiz {

    private String nombre;
    private String documento;
    private String programa;
    private String ficha;

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getPrograma() {
        return programa;
    }

    public Aprendiz(String nombre, String documento, String programa, String ficha){
        this.nombre = nombre;
        this.documento = documento;
        this.programa = programa;
        this.ficha = ficha;
    }

    public void mostrarInfoAprendiz(){
        System.out.println("Aprendiz : " + nombre + "Documento : " +  documento + "Programa : " + programa);
    }
}