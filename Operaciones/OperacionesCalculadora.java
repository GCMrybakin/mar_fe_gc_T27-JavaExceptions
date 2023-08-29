package Operaciones;

public class OperacionesCalculadora {
    private double num1;
    private double num2;

    public OperacionesCalculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double suma() {
        return num1 + num2;
    }

    public double resta() {
        return num1 - num2;
    }

    public double multiplicacion() {
        return num1 * num2;
    }

    public double division() {
        if (num2 == 0) {
            throw new ArithmeticException("Division por cero no permitida");
        }
        return num1 / num2;
    }

    public double potencia(int exponente) {
        return Math.pow(num1, exponente);
    }

    public double raizCuadrada() {
        if (num1 < 0) {
            throw new ArithmeticException("No se puede calcular la raiz cuadrada de un numero negativo");
        }
        return Math.sqrt(num1);
    }

    public double raizCuadradaNum2() {
        if (num2 < 0) {
            throw new ArithmeticException("No se puede calcular la raiz cuadrada de un numero negativo");
        }
        return Math.sqrt(num2);
    }

    public double raizCubica() {
        return Math.cbrt(num1);
    }

    public double raizCubicaNum2() {
        return Math.cbrt(num2);
    }
}
