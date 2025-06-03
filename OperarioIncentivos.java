package trabajosPinto;

import java.util.Scanner;

public class OperarioIncentivos {
    static Scanner teclado = new Scanner(System.in);
    static double var7, var8;
    static int var1, var2,var3, var4,var5,var6;
    static String var;

    public static void operacion() {
         System.out.println("Producción del día lunes:");
                var1 = Integer.parseInt(teclado.nextLine());
                System.out.println("Producción del día martes:");
                var2 = Integer.parseInt(teclado.nextLine());
                System.out.println("Producción del día miércoles:");
                var3 = Integer.parseInt(teclado.nextLine());
                System.out.println("Producción del día jueves:");
                var4 = Integer.parseInt(teclado.nextLine());
                System.out.println("Producción del día viernes:");
                var5 = Integer.parseInt(teclado.nextLine());
                System.out.println("Producción del día sábado:");
                var6 = Integer.parseInt(teclado.nextLine());
                var7 = var1 + var2 + var3 + var4 + var5 + var6;
                System.out.println("Producción total: " + var7);
                var8 = var7 / 6.0;
                System.out.println("Promedio de producción: " + var8);
                if (var8 >= 100) {
                    System.out.println("Sí recibirá incentivos.");
                } else {
                    System.out.println("No recibirá incentivos.");
                }
    }
}
