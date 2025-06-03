package trabajosPinto;

import java.util.Scanner;

public class TipoTriangulo {
    static Scanner teclado = new Scanner(System.in);
    static double var7, var8;
    static int var1, var2, var3, var4, var5, var6;
    static String var;

    public static void operacion() {
        System.out.println("Primer lado:");
        var1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Segundo lado:");
        var2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Tercer lado:");
        var3 = Integer.parseInt(teclado.nextLine());
        if (var1 == var2 && var2 == var3) {
            System.out.println("Equilátero");
        } else if (var1 != var2 && var2 != var3 && var1 != var3) {
            System.out.println("Escaleno");
        } else {
            System.out.println("Isósceles");
        }
    }
}
