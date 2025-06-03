package trabajosPinto;

import java.util.Scanner;

public class LetracCualquiera {

    static Scanner teclado = new Scanner(System.in);
    static int var1, var2, var3;
    static String var;

    public static void operacion() {
        var1 = 0;
        var2 = 0;

        for (var3 = 1; var3 <= 10; var3++) {
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
