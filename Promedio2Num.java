package trabajosPinto;

import java.util.Scanner;

public class Promedio2Num {
    static Scanner teclado = new Scanner(System.in);
    static int var1, var2, var3, var4, var5;
    static String var;

    public static void operacion() {
        System.out.println("ingrese un numero");
        var = teclado.nextLine();
        var1 = Integer.parseInt(var);
        System.out.println("ingrese un numero");
        var = teclado.nextLine();
        var2 = Integer.parseInt(var);

        var3 = var1 + var2;
        var4 = var3 / 2;

        System.out.println("el promedio es: " + var4);
    }
}
