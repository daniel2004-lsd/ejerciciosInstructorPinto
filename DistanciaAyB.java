package trabajosPinto;

import java.util.Scanner;

public class DistanciaAyB {
    static Scanner teclado = new Scanner(System.in);
    static double var7;
    static int var1, var2, var3, var4, var5, var6;
    static String var;

    public static void operacion() {
        System.out.println("Abcisa de A");
        var = teclado.nextLine();
        var1 = Integer.parseInt(var);
        System.out.println("Abcisa de B");
        var = teclado.nextLine();
        var2 = Integer.parseInt(var);
        System.out.println("Ordenada de A");
        var = teclado.nextLine();
        var3 = Integer.parseInt(var);
        System.out.println("Ordenada de B");
        var = teclado.nextLine();
        var4 = Integer.parseInt(var);
        var7 = Math.sqrt(Math.pow(var2 - var1, 2) + Math.pow(var4 - var3, 2));
        System.out.println("La distancia entre los puntos A y B es: " + var7);

    }
}
