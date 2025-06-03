package trabajosPinto;

import java.util.Scanner;

public class Edad200 {
    static Scanner teclado = new Scanner(System.in);
    static int var1, var2, var3;
    static String var;

    public static void operacion() {
           System.out.println("edad de persona");
                var = teclado.nextLine();
                var1 = Integer.parseInt(var);

                var = teclado.nextLine();
                var2 = Integer.parseInt(var);

                for (var3 = 1; var3 < 18; var3++) {
                    System.out.println(var1);
                    if (var1 < 18) {
                        var1 = var1 + 1;
                    } else {
                        var2 = var2 + 1;
                    }
                }
                System.out.println("las persona mayores de edad son: " + var1);
                System.out.println("las personas menores de edad son: " + var2);
    }
}
