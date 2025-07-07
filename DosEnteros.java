package trabajosPinto;

import java.util.Scanner;

public class DosEnteros {
    static Scanner teclado = new Scanner(System.in);
    static int var1, var2, var3, var4;
    static String var;

    public static void operacion() {
       System.out.println("ingresa el primer numero");
                var = teclado.nextLine();
                var1 = Integer.parseInt(var);

                System.out.println("ingresa el segundo numero");
                var = teclado.nextLine();
                var2 = Integer.parseInt(var);
                var3 = 0;

                for (var4 = 1; var4 <= var2; var4++) {
                    var3 = var3 + var2;
                }
    }
}
