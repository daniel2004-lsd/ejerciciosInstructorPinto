package trabajosPinto;

import java.util.Scanner;

public class IngresarLetra {
    static Scanner teclado = new Scanner(System.in);
    static int var1, var2, var3, var4, var5;
    static String var;

    public static void operacion() {
        var = "v";
        while (var == "v") {
            switch (var) {
                case "A", "a":
                    var = "R";
                case "E", "e":
                    var = "R";
                case "I", "i":
                    var = "R";
                case "U", "u":
                    var = "R";
                case "O", "o":
                    var = "V";
                    break;
                default:
                    break;
            }
        }
    }
}
