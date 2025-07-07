package trabajosPinto;

import java.util.Scanner;

public class SinPares {
    static Scanner teclado = new Scanner(System.in);
    static int var1, var2, var3, var4, var5;
    static String var;

    public static void operacion() {
        for (var1 = 1; var1 < 10; var1++) {
            var2 = var1 / 2;
            var3 = var1 - (var2 * 2);

            if (var3 == 0) {
                System.out.println("el numero es par");
            } else {
                System.out.println("el numero es impar");
            }

        }

    }
}
