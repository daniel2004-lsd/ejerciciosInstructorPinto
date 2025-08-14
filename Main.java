import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static SistemaHorarios sistemaHorarios = SistemaHorarios.getInstancia();

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("\n MENÚ PRINCIPAL");
            System.out.println("1. Aprendices");
            System.out.println("2. Instructores");
            System.out.println("3. Ambientes");
            System.out.println("4. Asignar horario");
            System.out.println("5. Consultar programación filtrada");
            System.out.println("6. Ver toda la programación");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            String entrada = scanner.nextLine();

            if (entrada.matches("\\d+")) {
                opcion = Integer.parseInt(entrada);
            } else {
                System.out.println("Solo se permiten números.");
                continue;
            }

            switch (opcion) {
                case 1:
                    menuAprendices();
                    break;
                case 2:
                    menuInstructores();
                    break;
                case 3:
                    menuAmbientes();
                    break;
                case 4:
                    asignarHorario();
                    break;
                case 5:
                    filtrarProgramacion();
                    break;
                case 6:
                    sistemaHorarios.mostrarProgramacion();
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);
    }

    private static void menuAprendices() {
        int opcion = 0; 

        do {
            System.out.println("\nMENÚ DE APRENDICES");
            System.out.println("1. Registrar");
            System.out.println("2. Consultar por documento");
            System.out.println("3. Actualizar programa");
            System.out.println("4. Eliminar por documento");
            System.out.print("Opción: ");

            String entrada = scanner.nextLine();
            if (entrada.matches("\\d+")) {
                opcion = Integer.parseInt(entrada);
            } else {
                System.out.println("Solo se permiten números.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    if (!Validador.nombreValido(nombre)) {
                        System.out.println("nombre invalido solo letras y espacios");
                    }
                    System.out.print("Documento: ");
                    String documento = scanner.nextLine();
                    if (!Validador.documentoUnico(documento, null)) {
                        System.out.println("el documento ya esta registrado");
                    }
                    System.out.print("Programa: ");
                    String programa = scanner.nextLine();
                    System.out.println("Ficha: ");
                    String ficha = scanner.nextLine();
                    if (!Validador.fichaValida(ficha)) {
                        System.out.println("la ficha debe tener 6 digitos");
                    }
                    Aprendiz a = AprendizFactory.crearAprendiz(nombre, documento, programa, ficha);
                    sistemaHorarios.registrarAprendiz(a);
                    if (Validador.nombreValido(nombre))
                        System.out.println("Registrado.");
                    a.mostrarInfoAprendiz();
                    break;

                case 2:
                    System.out.print("Documento: ");
                    Aprendiz buscado = sistemaHorarios.buscarDocumento(scanner.nextLine());
                    if (buscado != null)
                        buscado.mostrarInfoAprendiz();
                    else
                        System.out.println(" No encontrado.");
                    break;

                case 3:
                    System.out.print("Documento: ");
                    String document = scanner.nextLine();
                    if (!Validador.soloNumeros(document)) {
                        System.out.println("solo se permite ingresar numeros. intentelo de nuevo!");
                    }
                    System.out.print("Nuevo programa: ");
                    String nuevoProg = scanner.nextLine();
                    if (!Validador.nombreValido(nuevoProg)) {
                        System.out.println("el nombre solo debe contener letras");
                    }
                    sistemaHorarios.actualizarAprendiz(document, nuevoProg);
                    break;

                case 4:
                    System.out.print("Documento: ");
                    sistemaHorarios.eliminarAprendiz(scanner.nextLine());
                    break;

                default:
                    System.out.println("Inválido.");
            }

        } while (opcion != 4);
    } 

    private static void menuInstructores() {
        System.out.println("\n MENÚ DE INSTRUCTORES");
        System.out.println("1. Registrar");
        System.out.println("2. Consultar por documento");
        System.out.println("3. Actualizar área");
        System.out.println("4. Eliminar por documento");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                String nombre;
                do {
                    System.out.print("Nombre: ");
                    nombre = scanner.nextLine();
                    if (!Validador.nombreValido(nombre)) {
                        System.out.println("erroor el nombre solo tebe contener letras");
                    }
                } while (!Validador.nombreValido(nombre));

                System.out.print("Documento: ");
                String doc = scanner.nextLine();
                System.out.print("Área de formación: ");
                String area = scanner.nextLine();
                Instructor i = IstructorFactory.crear(nombre, doc, area);
                sistemaHorarios.registrarInstructor(i);
                System.out.println("Registrado.");
                i.mostrarInfo();
                break;
            case 2:
                System.out.print("Documento: ");
                Instructor buscado = sistemaHorarios.buscarDucumentoInstructor(scanner.nextLine());
                if (buscado != null)
                    buscado.mostrarInfo();
                else
                    System.out.println("No encontrado.");
                break;
            case 3:
                System.out.print("Documento: ");
                String docAct = scanner.nextLine();
                System.out.print("Nueva área: ");
                String nuevaArea = scanner.nextLine();
                sistemaHorarios.actualizarInstructor(docAct, nuevaArea);
                break;
            case 4:
                System.out.print("Documento: ");
                sistemaHorarios.eliminarInstructor(scanner.nextLine());
                break;
            default:
                System.out.println("Inválido.");
        }
    }

    private static void menuAmbientes() {
        System.out.println("\n MENÚ DE AMBIENTES");
        System.out.println("1. Crear");
        System.out.println("2. Consultar por nombre");
        System.out.println("3. Actualizar capacidad");
        System.out.println("4. Eliminar por nombre");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Sede: ");
                String sede = scanner.nextLine();
                System.out.print("Línea: ");
                String linea = scanner.nextLine();
                System.out.print("Capacidad: ");
                int capacidad = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tipo: ");
                String tipo = scanner.nextLine();

                // aca estamos implemntando el patron builder
                // nos permite crear objetos que tengan muchas propiedades
                // con esto nos ebitamos el constructor .-.
                Ambiente ambiente = new AmbienteBuilder()
                        .conNombre(nombre)
                        .conSede(sede)
                        .conLinea(linea)
                        .conCapacidad(capacidad)
                        .conTipo(tipo)
                        .build();

                sistemaHorarios.registrarAmbiente(ambiente);
                System.out.println("Ambiente creado.");
                ambiente.mostrarInfo();
                break;
            case 2:
                System.out.print("Nombre: ");
                Ambiente buscado = sistemaHorarios.buscarAmbientePorNombre(scanner.nextLine());
                if (buscado != null)
                    buscado.mostrarInfo();
                else
                    System.out.println("No encontrado.");
                break;
            case 3:
                System.out.print("Nombre: ");
                String nombreAct = scanner.nextLine();
                System.out.print("Nueva capacidad: ");
                int nuevaCapacidad = scanner.nextInt();
                scanner.nextLine();
                sistemaHorarios.actualizarCapacidadAmbiente(nombreAct, nuevaCapacidad);
                break;
            case 4:
                System.out.print("Nombre: ");

                break;
            default:
                System.out.println(" Inválido.");
        }
    }

    private static void asignarHorario() {
        System.out.print("Día y hora: ");
        String diaHora = scanner.nextLine();

        System.out.print("Nombre del instructor: ");
        Instructor instructor = sistemaHorarios.buscarInstructorNombre(diaHora);

        System.out.print("Nombre del ambiente: ");
        Ambiente ambiente = sistemaHorarios.buscarAmbientePorNombre(scanner.nextLine());

        System.out.print("Jornada (Mañana / Tarde / Noche): ");
        String jornada = scanner.nextLine();

        if (instructor != null && ambiente != null) {
            Command comando = new AsignarHorarioCommand(diaHora, instructor, ambiente, jornada);
            comando.ejecutar();
        } else {
            System.out.println("Instructor o ambiente no encontrados.");
        }
    }

    // Filtrar programación
    private static void filtrarProgramacion() {
        System.out.println("Filtrar por:");
        System.out.println("1. Instructor");
        System.out.println("2. Sede");
        System.out.println("3. Jornada");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        EstrategiaFiltro filtro = null;

        switch (opcion) {
            case 1:
                System.out.print("Nombre del instructor: ");
                filtro = new FiltroInstructor(scanner.nextLine());
                break;
            case 2:
                System.out.print("Sede: ");
                filtro = new FiltroSede(scanner.nextLine());
                break;
            case 3:
                System.out.print("Jornada: ");
                filtro = new FiltroJornada(scanner.nextLine());
                break;
            default:
                System.out.println("Opción inválida.");
        }

        if (filtro != null) {
            sistemaHorarios.mostrarProgramacionFiltrada(filtro);
        }
    }
}
