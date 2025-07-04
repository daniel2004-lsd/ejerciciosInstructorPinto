import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServicioBanFactory banco = new BancoFactory();
        List<Cliente> clientes = new ArrayList<>();

        System.out.print("Ingrese el nombre de la ciudad donde está ubicado el banco: ");
        String nombreCiudad = sc.nextLine();
        Ciudad ciudad = new Ciudad(nombreCiudad);
        Banco miBanco = new Banco(ciudad);

        String continuar;

        do {
            System.out.println("\nIngrese el nombre del cliente:");
            String nombre = sc.nextLine();
            Cliente cliente = new Cliente(nombre);

            System.out.println("Bienvenido, " + cliente.getNombre() + ". ¿Qué deseas hacer?");
            System.out.println("1. Abrir un producto bancario");
            System.out.println("2. Solicitar un préstamo");
            System.out.println("3. Salir");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: {
                    System.out.println("Seleccione el tipo de producto:");
                    System.out.println("1. Cuenta de Ahorros");
                    System.out.println("2. Cuenta Corriente");
                    System.out.println("3. Tarjeta de Crédito");
                    System.out.println("4. CDT");
                    System.out.print("Opción: ");
                    int tipoProducto = sc.nextInt();
                    sc.nextLine(); 

                    ProductoBancario producto = banco.crearProductoBancario(tipoProducto);
                    if (producto != null) {
                        producto.mostrarDetalles();
                        String nombreProducto = switch (tipoProducto) {
                            case 1 -> "Cuenta de Ahorros";
                            case 2 -> "Cuenta Corriente";
                            case 3 -> "Tarjeta de Crédito";
                            case 4 -> "CDT";
                            default -> "Producto desconocido";
                        };
                        cliente.setServicioAdquirido(nombreProducto);
                    } else {
                        System.out.println("Opción de producto no válida");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Seleccione el tipo de préstamo:");
                    System.out.println("1. Libranza");
                    System.out.println("2. Inversión");
                    System.out.println("3. Hipoteca");
                    System.out.print("Opción: ");
                    int tipoPrestamo = sc.nextInt();
                    sc.nextLine(); 

                    Prestamos prestamo = banco.crearPrestamo(tipoPrestamo);
                    if (prestamo != null) {
                        prestamo.mostrarTipo();
                        String nombrePrestamo = switch (tipoPrestamo) {
                            case 1 -> "Préstamo por Libranza";
                            case 2 -> "Préstamo de Inversión";
                            case 3 -> "Préstamo Hipotecario";
                            default -> "Préstamo desconocido";
                        };
                        cliente.setServicioAdquirido(nombrePrestamo);
                    } else {
                        System.out.println("Tipo de préstamo no identificado");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Saliendo del sistema.");
                    break;
                }
                default:
                    System.out.println("Opción inválida");
            }

            miBanco.registrarCliente(cliente);

                System.out.print("\n¿Desea registrar otro cliente? (s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        miBanco.mostrarClientes();

        sc.close();
    }
}
