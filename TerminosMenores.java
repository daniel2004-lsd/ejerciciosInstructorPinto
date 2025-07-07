package trabajosPinto;

import java.util.Scanner;

public class TerminosMenores {

    static Scanner teclado = new Scanner(System.in);
    static int var1, var2, var3, var4, var5;
    static String var;

    public static void operacion() {
        System.out.println("ingrese un numero");
        var = teclado.nextLine();
        var1 = Integer.parseInt(var);
        while (var1 < 1000) {
            var1 = (var1 ^ 2) + 1;
        }
    }
}
