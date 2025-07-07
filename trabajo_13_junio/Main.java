package trabajosPinto.trabajo_13_junio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroTrasporte registro = new RegistroTrasporte();

    
        TrasporteFactory ambulanciaFactory = new AmbulanciaFactory();
        Vehiculo ambulancia = ambulanciaFactory.crearVehiculo();

        System.out.println("Ingrese datos del conductor de la ambulancia:");
        System.out.print("Nombre: ");
        String nomA = sc.nextLine();
        System.out.print("Apellido: ");
        String apeA = sc.nextLine();
        System.out.print("Celular: ");
        String celA = sc.nextLine();
        ambulancia.asignarConductor((Conductor) ambulanciaFactory.crearConductor(nomA, apeA, celA));

        System.out.print("¿Cuántos pacientes vivos desea ingresar?: ");
        int vivos = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < vivos; i++) {
            System.out.println("Paciente vivo #" + (i + 1));
            System.out.print("Nombre: ");
            String nom = sc.nextLine();
            System.out.print("Apellido: ");
            String ape = sc.nextLine();
            System.out.print("Teléfono: ");
            String tel = sc.nextLine();
            ambulancia.agregarPersona(ambulanciaFactory.crearPacienteVivo(nom, ape, tel));
        }

        registro.agregarAmbulancia(ambulancia);

        
        TrasporteFactory funebreFactory = new CarroFunebreFactory();
        Vehiculo carroFunebre = funebreFactory.crearVehiculo();

        System.out.println("\nIngrese datos del conductor del carro fúnebre:");
        System.out.print("Nombre: ");
        String nomF = sc.nextLine();
        System.out.print("Apellido: ");
        String apeF = sc.nextLine();
        System.out.print("Celular: ");
        String celF = sc.nextLine();
        carroFunebre.asignarConductor((Conductor) funebreFactory.crearConductor(nomF, apeF, celF));

        System.out.print("¿Cuántos pacientes muertos desea ingresar?: ");
        int muertos = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < muertos; i++) {
            System.out.println("Paciente muerto #" + (i + 1));
            System.out.print("Nombre: ");
            String nom = sc.nextLine();
            System.out.print("Apellido: ");
            String ape = sc.nextLine();
            System.out.print("Teléfono: ");
            String tel = sc.nextLine();
            carroFunebre.agregarPersona(funebreFactory.crearPacienteMuerto(nom, ape, tel));
        }

        registro.agregarCarroFunebre(carroFunebre);

        
        System.out.println("\nINFORME GENERAL DE TRANSPORTE");
        registro.mostrarReporte();
    }
}
