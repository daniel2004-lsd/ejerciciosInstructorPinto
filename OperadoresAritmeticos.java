package trabajosPinto;

import java.util.Scanner;

public class OperadoresAritmeticos {
    static Scanner teclado = new Scanner(System.in);
    static double var7, var8;
    static int var1, var2, var3, var4, var5, var6;
    static String var;

    public static void operacion() {
        System.out.println("ingresa el primer numero");
        var = teclado.nextLine();
        var1 = Integer.parseInt(var);

        System.out.println("ingresa el segundo numero");
        var = teclado.nextLine();
        var2 = Integer.parseInt(var);

        System.out.println("ingrsa el caracter como suma(+), resta(-), multiplicacion(*), division(/)");
        var = teclado.nextLine();
        var2 = Integer.parseInt(var);

        switch (var) {
            case "+":
                var3 = var1 + var2;
                System.out.println("la suma es: " + var3);
                break;
            case "-":
                var3 = var1 - var2;
                System.out.println("la resta es: " + var3);
                break;
            case "*":
                var3 = var1 * var2;
                System.out.println("la multiplicacion es: " + var3);
                break;
            case "/":
                if (var2 != 0) {
                    var3 = var1 / var2;
                    System.out.println("la division es: " + var3);
                } else {
                    System.out.println("no se puede dividir entre cero");
                }
                break;
            default:
                System.out.println("operador no valido");
        }
    }
}
