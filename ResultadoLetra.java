package trabajosPinto;

import java.util.Scanner;

public class ResultadoLetra {
    static Scanner teclado = new Scanner(System.in);
    static int var1, var2, var3, var4, var5;
    static String var;

    public static void operacion() {
        var1 = 0;
        var2 = 0;
        var3 = 0;
        var4 = 0;

        for (var5 = 1; var5 <= 160; var5++) {
            System.out.println("ingrese una letra");
            var = teclado.nextLine();
            var1 = Integer.parseInt(var);
            var2 = var1 + 1;

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
