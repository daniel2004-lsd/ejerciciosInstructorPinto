package trabajosPinto;

import java.util.Scanner;

public class PartidosGanados {
    static Scanner teclado = new Scanner(System.in);
    static int var1, var2,var3, var4,var5,var6;
    static String var;

    public static void operacion() {
    System.out.println("Numero de partidos ganados");
    var = teclado.nextLine();
    var1 = Integer.parseInt(var);
    System.out.println("numero de partidos enpatados");
    var = teclado.nextLine();
    var2 = Integer.parseInt(var);
    System.out.println("Numero de partidos perdidos");
    var = teclado.nextLine();
    var3 = Integer.parseInt(var);
    var4 = var1 * 3;
    var5 = var2 * 1;
    var6 = var1 + var2;
    System.out.println("el puntaje total es  " + var6);
    System.out.println("Partidos perdidos: " + var3);

    }
}
