package ejercicio1;

import java.util.Scanner;

public class raizCuadrada {

    public static void main(String[] args) {
        calcularRaizCuadrada();
    }


    static final Scanner sn = new Scanner(System.in);

    public static void calcularRaizCuadrada(){
        System.out.println("Introduzca un número para calcular su raíz cuadrada: ");
        int numero = sn.nextInt();
        boolean verdadero = false;
        do{
            try{
                if (numero<0){
                    throw new Exception("La raíz cuadrada no está definida para un número negativo.");
                }
                else{
                    double raiz = Math.sqrt(numero);
                    verdadero = true;
                    System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }while(!verdadero);


    }
}
