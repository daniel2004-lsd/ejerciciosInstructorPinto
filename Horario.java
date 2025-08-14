public class Horario {
    private String diaHora;
    private Instructor instructor;
    private Ambiente ambiente;
    private String jornada;


    public String getJornada() {
        return jornada;
    }

    public String getDiaHora() {
        return diaHora;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public Horario(String diaHora, Instructor instructor, Ambiente ambiente, String jornada) {
        this.diaHora = diaHora;
        this.instructor = instructor;
        this.ambiente = ambiente;
        this.jornada = jornada;
    }

    public void mostrar() {
        System.out.println("📅 " + diaHora +
                " | Instructor: " + instructor.getNombre() +
                " | Ambiente: " + ambiente.getNombre()+
                " | Jornada :" + jornada
        );
    }
}
