package trabajosPinto;

import java.util.Scanner;

public class PuntajeFinal {

    static Scanner teclado = new Scanner(System.in);
    static int var1, var2,var3, var4,var5,var6;
    static String var;

    public static void operacion() {
    System.out.println("Ingrese el numero de respuestas correctas");
    var = teclado.nextLine();
    var1 = Integer.parseInt(var);
    System.out.println("Ingrese el numero de respuestas incorrectas");
    var = teclado.nextLine();
    var2 = Integer.parseInt(var);
    System.out.println("Ingrese el numero de respuestas en blanco");
    var = teclado.nextLine();
    var3 = Integer.parseInt(var);
    var4 = var1 * 4;
    var5 = var2 * -1;
    var6 = var1 + var2;
    System.out.println("numero de respuestas en blanco " + var3);
    System.out.println("el puntajw final es " + var6);

    }
}
