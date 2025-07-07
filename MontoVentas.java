package trabajosPinto;

import java.util.Scanner;

public class MontoVentas {
    static Scanner teclado = new Scanner(System.in);
    static double var7;
    static int var1, var2, var3, var4, var5, var6;
    static String var;

    public static void operacion() {
        System.out.println("Monto de venta (solo para visualizar ejemplo):");
        var1 = Integer.parseInt(teclado.nextLine());
        System.out.println("El monto ingresado fue: " + var1);
    }
}
