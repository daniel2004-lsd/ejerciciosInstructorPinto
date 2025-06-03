package trabajosPinto;

import java.util.Scanner;

public class EjerciciosCompletos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String var;
        int var1;

        System.out.println("Ingrese un número para hacer el ejercicio:");
        System.out.println("1. Distancia recorrida");
        System.out.println("2. Promedio de un estudiante");
        System.out.println("3. Puntaje Final");
        System.out.println("4. Partidos ganados");
        System.out.println("5. Plantillas de un empleado");
        System.out.println("6. Lados de un triángulo");
        System.out.println("7. Copia de seguridad de un disco duro");
        System.out.println("8. Distancia de A y B");
        System.out.println("9. ¿Se debe sacar el CUIL?");
        System.out.println("10. Edad de 2 hermanos");
        System.out.println("11. Operario de incentivos");
        System.out.println("12. Número mayor");
        System.out.println("13. Identificar tipo de triángulo");
        System.out.println("14. Equivalente a un número romano del 1 al 10");
        System.out.println("15. Monto de ventas");
        System.out.println("16. Número que corresponde a una vocal");
        System.out.println("17. Mostrar el número de unidades de un número");
        System.out.println("18. Número entero diferente a cero");
        System.out.println("19. numeros pares");
        System.out.println("20. sueldo promedio");
        System.out.println("21. edad de 200 personas");
        System.out.println("22. solicitar dos numeros enteros");
        System.out.println("23. mostrar 10 numeros enteros exepto los pares");
        System.out.println("24. terminos de la serie  que sean menores a 1000");
        System.out.println("25. ingresar una litra hasta que ingrese una vocal");
        System.out.println("26. terminos de la serie fibonnaci");
        System.out.println("27. dos numeros enteros para operadores aritmeticos");
        System.out.println("28. ingresar 10 letras cualquiera");
        System.out.println("29. resultado de 160 letras");
        System.out.println("30. promedio de dos numeros");
        System.out.println("31. nombre del mes correspondiente");
        System.out.println("32. numero entero difente a o");

        var = teclado.nextLine();
        var1 = Integer.parseInt(var);

        switch (var1) {
            case 1:
                DistanciaRecorrida.operacion();
                break;

            case 2:
                PomedioEstudiante.operacion();
                break;

            case 3:
                PuntajeFinal.operacion();
                break;

            case 4:
                PartidosGanados.operacion();
                break;

            case 5:
                PlantillaEnpleado.operacion();
                break;

            case 6:

                LadosTriangulo.operacion();
                break;

            case 7:
                NumeroGb.operacion();
                break;

            case 8:
                DistanciaAyB.operacion();
                break;

            case 9:
                Cuil.operacion();
                break;

            case 10:
                Edad2Hermanos.operacion();
                break;

            case 11:
                OperarioIncentivos.operacion();
                break;

            case 12:
                NumeroMayor.operacion();
                break;

            case 13:
                TipoTriangulo.operacion();
                break;

            case 14:
                Equivalentes.operacion();
                break;

            case 15:
                MontoVentas.operacion();
                break;

            case 16:
                NumeroVocal.operacion();
                break;

            case 17:
                MostrarUnidades.operacion();
                break;

            case 18:
                DiferenteAcero.operacion();
                break;

            case 19:
                NumerosPares.operacion();
                break;

            case 20:
                SuedoPro.operacion();
                break;

            case 21:
                Edad200.operacion();
                break;

            case 22:
                DosEnteros.operacion();
                break;

            case 23:
                SinPares.operacion();

                break;
            case 24:
                TerminosMenores.operacion();
                break;
            case 25:
                IngresarLetra.operacion();
                break;
            case 26:
                TerminosFIbonnaci.operacion();
                break;
            case 27:
                OperadoresAritmeticos.operacion();
                break;
            case 28:
                LetracCualquiera.operacion();
                break;
            case 29:
                ResultadoLetra.operacion();
                break;
            case 30:
                Promedio2Num.operacion();
                break;

            case 31:
               NombreMes.operacion();   
                break;
            case 32:
                NumeroDif.operacion();

            default:
                System.out.println("Opción no válida.");
                break;
        }

        teclado.close();
    }
}
