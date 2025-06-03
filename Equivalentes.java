package trabajosPinto;

import java.util.Scanner;

public class Equivalentes {
    static Scanner teclado = new Scanner(System.in);
    static double var7;
    static int var1, var2, var3, var4, var5, var6;
    static String var;

    public static void operacion() {
        System.out.println("Escoja un número del 1 al 10:");
        var1 = Integer.parseInt(teclado.nextLine());
        switch (var1) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Número fuera de rango.");
                break;
        }
    }
}
