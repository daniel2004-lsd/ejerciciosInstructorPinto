package trabajosPinto;

import java.util.Scanner;

public class LadosTriangulo {
    static Scanner teclado = new Scanner(System.in);
    static double var7;
    static int var1, var2,var3, var4,var5,var6;
    static String var;

    public static void operacion() {
    System.out.println("longitud del lado A");
    var = teclado.nextLine();
    var1 = Integer.parseInt(var);
    System.out.println("longitud del lado B");
    var = teclado.nextLine();
    var2 = Integer.parseInt(var);
    System.out.println("longitud del lado C");
    var = teclado.nextLine();
    var3 = Integer.parseInt(var);
    var4 = (var1 + var2 + var3) / 2;
    var7 = Math.sqrt(var4 * (var4 - var1) * (var4 - var2) * (var4 - var3));
    System.out.println("El área del triángulo es: " + var7);



   
    }
}
