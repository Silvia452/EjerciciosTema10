import ejercicio1.raizCuadrada;
import ejercicio2.MainEjercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Salir");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                raizCuadrada.calcularRaizCuadrada();
                break;
            case 2:
                MainEjercicio2.main(args);
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
}
