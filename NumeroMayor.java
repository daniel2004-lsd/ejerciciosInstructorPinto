package trabajosPinto;

import java.util.Scanner;

public class NumeroMayor {
    static Scanner teclado = new Scanner(System.in);
    static double var7, var8;
    static int var1, var2, var3, var4, var5, var6;
    static String var;

    public static void operacion() {
        System.out.println("Primer número entero:");
        var1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Segundo número entero:");
        var2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Tercer número entero:");
        var3 = Integer.parseInt(teclado.nextLine());
        if (var1 > var2 && var1 > var3) {
            System.out.println("El primer número es mayor.");
        } else if (var2 > var1 && var2 > var3) {
            System.out.println("El segundo número es mayor.");
        } else if (var3 > var1 && var3 > var2) {
            System.out.println("El tercer número es mayor.");
        } else {
            System.out.println("Hay números iguales o no hay un único mayor.");
        }
    }
}
