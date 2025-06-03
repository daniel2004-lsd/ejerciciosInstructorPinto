package trabajosPinto;

import java.util.Scanner;

public class PlantillaEnpleado {
    static Scanner teclado = new Scanner(System.in);
    static int var1, var2,var3, var4,var5,var6;
    static String var;

    public static void operacion() {
    System.out.println("Numero de horas laboradas en el mes");
    var = teclado.nextLine();
    var1 = Integer.parseInt(var);
    System.out.println("Valor hora laborada");
    var = teclado.nextLine();
    var2 = Integer.parseInt(var);
    var3 = var1 * var3;
    System.out.println("el valor total de los dias trabajados es de " + var3);
    }
}