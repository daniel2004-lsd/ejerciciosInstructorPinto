// ESTAMOS IMPLEMNTANDO EL PATRON DE DISEÑO DE BUILDER
// A LA CUAL NOS REMPLAZA DIGAMOS QUE EL CONSTRUCTOR
// ES UNA MANERA MAS EFICAZ Y ORGANIZADA AL MOMENTO DE LLAMARLA


public class AmbienteBuilder {
    private String nombre;
    private String sede;
    private String linea;
    private int capacidad;
    private String tipo;

    public AmbienteBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public AmbienteBuilder conSede(String sede) {
        this.sede = sede;
        return this;
    }

    public AmbienteBuilder conLinea(String linea) {
        this.linea = linea;
        return this;
    }

    public AmbienteBuilder conCapacidad(int capacidad) {
        this.capacidad = capacidad;
        return this;
    }

    public AmbienteBuilder conTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public Ambiente build() {
        return new Ambiente(nombre, sede, linea, capacidad, tipo);
    }
    
}
