import java.util.ArrayList;
import java.util.List;

public class SistemaHorarios {
    private static SistemaHorarios instancia;// se usa el singleton aca porque quiero que esta sea la unica instancia
                                             // que yo haga
    private List<Aprendiz> aprendices = new ArrayList<>();
    private List<Ambiente> ambientes = new ArrayList<>();
    private List<Instructor> instructores = new ArrayList<>();
    private List<Horario> horarios = new ArrayList<>();

    private SistemaHorarios() {
    }

    public static SistemaHorarios getInstancia() {
        if (instancia == null) {
            instancia = new SistemaHorarios();
        }
        return instancia;
    }

    public void registrarAprendiz(Aprendiz aprendiz) {
        aprendices.add(aprendiz);
    }

    public void mostrarAprendices() {
        System.out.println("Lisya de aprendices");
        for (Aprendiz aprendiz : aprendices) {
            aprendiz.mostrarInfoAprendiz();
        }
    }

    public void registrarAmbiente(Ambiente ambiente) {
        ambientes.add(ambiente);
    }

    public void mostrarAmbientes() {
        System.out.println("Lista de Ambientes:");
        for (Ambiente a : ambientes) {
            a.mostrarInfo();
        }
    }

    public void registrarInstructor(Instructor instructor) {
        instructores.add(instructor);
    }

    public void mostrarInstructores() {
        for (Instructor i : instructores) {
            i.mostrarInfo();
        }
    }

    public void registrarHorario(Horario horario) {
        horarios.add(horario);
    }

    public void mostrarProgramacion() {
        System.out.println(" Programación:");
        for (Horario h : horarios) {
            if (h!=null) {
                h.mostrar();
            }
            else{
                System.out.println("no se a ingresado ninguna programacion");
            }
        }
    }

    public Instructor buscarInstructorNombre(String getNombre) {
        for (Instructor i : instructores) {
            if (i.getNombre().equalsIgnoreCase(getNombre)) {
                return i;
            }
        }
        return null;
    }

    public Ambiente buscarAmbienteNombre(String getAmbiente) {
        for (Ambiente a : ambientes) {
            if (a.getNombre().equalsIgnoreCase(getAmbiente)) {
                return a;
            }
        }
        return null;
    }

    public void mostrarProgramacion(EstrategiaFiltro filtro) {
        for (Horario h : horarios) {
            if (filtro.filtrar(h)) {
                h.mostrar();
            }
        }
    }

    public void mostrarProgramacionFiltrada(EstrategiaFiltro filtro) {
        System.out.println("Programacion filtrada");
        for (Horario h : horarios) {
            if (filtro.filtrar(h)) {
                h.mostrar();
            }
        }
    }
    // aca epiezo a implementar un crud en la parte de aprendices

    public Aprendiz buscarDocumento(String documento) {
        for (Aprendiz a : aprendices) {
            if (a.getDocumento().equalsIgnoreCase(documento)) {
                return a;
            }
        }
        return null;
    }

    // actualizar aprendz
    public Aprendiz actualizarAprendiz(String documento, String nuevoPrograma) {
        Aprendiz a = buscarDocumento(documento);
        if (a != null) {
            a.setPrograma(nuevoPrograma);
            System.out.println("programa actualizado");
            return a;
        } else {
            System.out.println("aprendiz no encontrado");
        }
        return null;
    }

    // eliminar aprendiz
    public Aprendiz eliminarAprendiz(String documento) {
        Aprendiz a = buscarDocumento(documento); // usa tu método de búsqueda
        if (a != null) {
            aprendices.remove(a); // eliminas al aprendiz
            System.out.println("aprendiz eliminado");
            return a; // retornas el aprendiz eliminado
        } else {
            System.out.println("documento no encontrado");
            return null;
        }
    }

    // implemtammos el crud en instructores ,_,

    public Instructor buscarDucumentoInstructor(String documento) {
        for (Instructor i : instructores) {
            if (i.getDocumento().equalsIgnoreCase(documento)) {
                return i;
            }
        }
        return null;
    }

    public Instructor actualizarInstructor(String documento, String nuevoPrograma) {
        Instructor i = buscarDucumentoInstructor(documento);
        if (i != null) {
            i.setArea(nuevoPrograma);
            System.out.println("area actualizada");
            return i;
        } else {
            System.out.println("instructor no encontrado");
        }
        return null;

    }

    public Instructor eliminarInstructor(String documento) {
        Instructor i = buscarDucumentoInstructor(documento);
        if (i != null) {
            System.out.println("instructor eliminado");
            return i;
        } else {
            System.out.println("documento no encontrado");

            return null;
        }
    }

    public Ambiente buscarAmbientePorNombre(String nombre) {
        for (Ambiente a : ambientes) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                return a;
            }
        }
        return null;
    }

    public void actualizarCapacidadAmbiente(String nombre, int nuevaCapacidad) {
        Ambiente a = buscarAmbientePorNombre(nombre);
        if (a != null) {
            a.setCapacidad(nuevaCapacidad);
            System.out.println("Capacidad actualizada.");
        } else {
            System.out.println(" Ambiente no encontrado.");
        }
    }

    public Ambiente eliminarAmbiente(String documento) {
        Ambiente a = buscarAmbienteNombre(documento);
        if (a != null) {
            System.out.println("instructor eliminado");
            return a;
        } else {
            System.out.println("documento no encontrado");

            return null;
        }
    }

}
