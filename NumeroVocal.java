package trabajosPinto;

import java.util.Scanner;

public class NumeroVocal {
    static Scanner teclado = new Scanner(System.in);
    static double var7;
    static int var1, var2, var3, var4, var5, var6;
    static String var;

    public static void operacion() {
        System.out.println("Número entero (1-5 para mostrar vocal):");
                var1 = Integer.parseInt(teclado.nextLine());
                switch (var1) {
                    case 1:
                        System.out.println("A");
                        break;
                    case 2:
                        System.out.println("E");
                        break;
                    case 3:
                        System.out.println("I");
                        break;
                    case 4:
                        System.out.println("O");
                        break;
                    case 5:
                        System.out.println("U");
                        break;
                    default:
                        System.out.println("No corresponde a una vocal.");
                        break;
                }
    }
}
