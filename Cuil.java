package trabajosPinto;

import java.util.Scanner;

public class Cuil {
        static Scanner teclado = new Scanner(System.in);
        static double var7, var8;
        static int var1, var2, var3, var4, var5, var6;
        static String var;

        public static void operacion() {
        System.out.println("Dijite el año de nacimiento de sumerce");
        var = teclado.nextLine();
        var1= Integer.parseInt(var);

        System.out.println("Dijite el año actual");
        var = teclado.nextLine();
        var2= Integer.parseInt(var);

        var3 = var2 - var1;
        if (var3 > 18) {
            System.out.println("Debe solicitar su CUIL");
        }
        else{
            System.out.println("no debe solicitar su CUIL por el momento");
        }
    }
}

