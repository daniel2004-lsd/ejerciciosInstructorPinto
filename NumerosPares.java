package trabajosPinto;

import java.util.Scanner;

public class NumerosPares {
    static Scanner teclado = new Scanner(System.in);
    static int var1, var2;
    static String var;

    public static void operacion() {
        var = teclado.nextLine();
        var1 = Integer.parseInt(var);

        for (int c = 1; c <= 4; c++) {
            var1 = var1 + 2;
            System.out.println(var1);
        }
    }
}
