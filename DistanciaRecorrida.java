package trabajosPinto;

import java.util.Scanner;



public class DistanciaRecorrida {

    static Scanner teclado = new Scanner(System.in);
    static int var1, var2;
    static String var;

    public static void operacion() {
        System.out.println("Ingrese la velocidad:");
        var = teclado.nextLine();
        var1 = Integer.parseInt(var);

        System.out.println("Ingrese el tiempo:");
        var = teclado.nextLine();
        var2 = Integer.parseInt(var);

        int distancia = var1 * var2;
        System.out.println("Distancia recorrida: " + distancia + " km");
    }
}





