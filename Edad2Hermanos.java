package trabajosPinto;

import java.util.Scanner;

public class Edad2Hermanos {

    static Scanner teclado = new Scanner(System.in);
    static double var7, var8;
    static int var1, var2, var3, var4, var5, var6;
    static String var;

    public static void operacion() {
        System.out.println("edad del primer hermano");
        var = teclado.nextLine();
        var1 = Integer.parseInt(var);

        System.out.println("Edad del segundo hermano:");
        var = teclado.nextLine();
        var2 = Integer.parseInt(var);

        if (var1 > var2) {
            System.out.println("El primer hermano es mayor por " + (var1 - var2) + " años.");
        } else if (var2 > var1) {
            System.out.println("El segundo hermano es mayor por " + (var2 - var1) + " años.");
        } else {
            System.out.println("Ambos tienen la misma edad.");
        }

    }
}
