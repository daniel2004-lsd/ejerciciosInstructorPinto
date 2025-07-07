package trabajosPinto;

import java.util.Scanner;

public class MostrarUnidades {
    static Scanner teclado = new Scanner(System.in);
    static double var7;
    static int var1, var2, var3, var4, var5, var6;
    static String var;

    public static void operacion() {
         System.out.println("Ingrese número entero:");
                var1 = Integer.parseInt(teclado.nextLine());
                var2 = var1 / 10;
                var3 = var1 % 10;
                System.out.println("Decenas: " + var2);
                System.out.println("Unidades: " + var3);
    }
}
