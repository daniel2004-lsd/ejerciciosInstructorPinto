package trabajosPinto;

import java.util.Scanner;

public class PomedioEstudiante {
    static Scanner teclado = new Scanner(System.in);
    static int var1, var2,var3, var4,var5;
    static String var;

    public static void operacion() {
        System.out.println("Ingrese la prmera nota:");
        var = teclado.nextLine();
        var1 = Integer.parseInt(var);

        System.out.println("Ingrese la segunda nota:");
        var = teclado.nextLine();
        var2 = Integer.parseInt(var);

        System.out.println("Ingrese la tercera nota:");
        var = teclado.nextLine();
        var3 = Integer.parseInt(var);

        System.out.println("El promedio de los estudiantes es: " + var4);
        var4 = (var1 + var2 + var3)/3;

    }
}
