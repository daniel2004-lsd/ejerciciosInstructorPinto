package trabajosPinto;

import java.util.Scanner;

public class TerminosFIbonnaci {
    static Scanner teclado = new Scanner(System.in);
    static int var1, var2, var3, var4, var5, var6;
    static String var;

    public static void operacion() {
        System.out.println("ingresa el primer numero");
        var = teclado.nextLine();
        var1 = Integer.parseInt(var);

        System.out.println("ingresa el segundo numero");
        var = teclado.nextLine();
        var2 = Integer.parseInt(var);

        System.out.println("ingresa el tercer numero");
        var = teclado.nextLine();
        var3 = Integer.parseInt(var);

        var1 = 0;
        var2 = 1;
        var3 = var1 + var2;

        while (var3 < 100000) {
            var1 = var2;
            var2 = var3;
            var3 = var1 + var2;
        }
    }
}
