package trabajosPinto;

import java.util.Scanner;

public class NumeroDif {
    static Scanner teclado = new Scanner(System.in);
    static double var7, var8;
    static int var1, var2, var3, var4, var5, var6;
    static String var;

    public static void operacion() {
        System.out.println("ingresa un numero difente a 0");
        var = teclado.nextLine();
        var1 = Integer.parseInt(var);
        int var30 = 1;

        while (var30 <= var1) {

            var3 = var1 / var30;
            var4 = var3 * var30;
            var5 = var1 - var4;
            
            if (var5 == 0) {
                break;
            }

        }

    }
}
