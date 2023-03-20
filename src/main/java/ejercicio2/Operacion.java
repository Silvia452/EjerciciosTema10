package ejercicio2;

public class Operacion {

    private int num1;
    private int num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public static int sum(int a, int b) throws DesbordaCapacidadExcepcion {
        long result = (long) a + b;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora");
        }
        return a + b;
    }

    public static int rest(int a, int b) throws DesbordaCapacidadExcepcion {
        long result = (long) a - b;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora");
        }
        return a - b;
    }

    public static int mult(int a, int b) throws DesbordaCapacidadExcepcion {
        long result = (long) a * b;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora");
        }
        return a * b;
    }

}
