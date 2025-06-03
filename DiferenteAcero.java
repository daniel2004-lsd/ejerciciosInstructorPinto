package trabajosPinto;

import java.util.Scanner;

public class DiferenteAcero {
    static Scanner teclado = new Scanner(System.in);
    static double var7;
    static int var1, var2, var3, var4, var5, var6;
    static String var;

    public static void operacion() {

        System.out.println("Ingrese número entero diferente de cero:");
        var1 = Integer.parseInt(teclado.nextLine());
        if (var1 != 0) {
            if (var1 > 0) {
                System.out.println("Número positivo.");
            } else {
                System.out.println("Número negativo.");
            }
        } else {
            System.out.println("El número es cero.");
        }
    }
}
