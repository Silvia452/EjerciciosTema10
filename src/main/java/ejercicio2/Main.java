package ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean valid = false;
        Scanner scanner = new Scanner(System.in);
        while (!valid) {
            System.out.println("Introducir un número entero:");
            try {
                int num1 = Integer.parseInt(scanner.nextLine());
                System.out.println(num1);
                System.out.println("¿operador? (+ - * / % o s para salir)");
                String op = scanner.nextLine();
                if (op.equals("s")) {
                    System.out.println("Saliendo...");
                    break;
                }
                System.out.println("Introducir un número entero:");
                int num2 = Integer.parseInt(scanner.nextLine());
                int result = 0;
                switch (op) {
                    case "+":
                        result = Operacion.sum(num1, num2);
                        break;
                    case "-":
                        result = Operacion.rest(num1, num2);
                        break;
                    case "*":
                        result = Operacion.mult(num1, num2);
                        break;
                    case "/":
                        if (num2 == 0) {
                            throw new ArithmeticException("La división por cero no está definida");
                        }
                        result = num1 / num2;
                        break;
                    case "%":
                        if (num2 == 0) {
                            throw new ArithmeticException("La división por cero no está definida");
                        }
                        result = num1 % num2;
                        break;
                    default:
                        throw new IllegalArgumentException("Operador inválido");
                }
                System.out.printf("%d %s %d = %d%n", num1, op, num2, result);
            } catch (NumberFormatException e) {
                System.out.println("Valor introducido incorrecto. Inténtelo de nuevo...");
            } catch (DesbordaCapacidadExcepcion e) {
                System.out.println(e.getMessage() + " Inténtelo de nuevo...");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}

