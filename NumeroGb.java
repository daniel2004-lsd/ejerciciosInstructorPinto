package trabajosPinto;

import java.util.Scanner;

public class NumeroGb {
    static Scanner teclado = new Scanner(System.in);
    static double var7 , var8;
    static int var1, var2,var3, var4,var5,var6;
    static String var;

    public static void operacion() {
    System.out.println("Numero de Gigabyte");
    var8 = var1 * 1024;
    var8 = (int) (var8 / 700 + 1);
    System.out.println("Cantidad de CDs necesarios: " + var8);

    }
}
