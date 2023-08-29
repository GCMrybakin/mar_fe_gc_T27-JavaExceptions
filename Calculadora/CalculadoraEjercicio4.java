package Calculadora;

import javax.swing.JOptionPane;
import Operaciones.OperacionesCalculadora;
//Ejercicio 4

public class CalculadoraEjercicio4 {

    public static void main(String[] args) {
        try {
            String input1 = JOptionPane.showInputDialog("Ingrese el primer numero:");
            double num1 = Double.parseDouble(input1);

            String input2 = JOptionPane.showInputDialog("Ingrese el segundo numero:");
            double num2 = Double.parseDouble(input2);

            OperacionesCalculadora operaciones = new OperacionesCalculadora(num1, num2);

            String menu = "Seleccione una operación:\n" +
                          "1. Suma\n" +
                          "2. Resta\n" +
                          "3. Multiplicacion\n" +
                          "4. Division\n" +
                          "5. Potencia\n" +
                          "6. Raiz Cuadrada\n" +
                          "7. Raiz Cubica";

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Suma: " + operaciones.suma());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Resta: " + operaciones.resta());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Multiplicacion: " + operaciones.multiplicacion());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Division: " + operaciones.division());
                    break;
                case 5:
                    int exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente para la potencia:"));
                    JOptionPane.showMessageDialog(null, "Potencia: " + operaciones.potencia(exponente));
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Raiz Cuadrada de num1: " + operaciones.raizCuadrada());
                    JOptionPane.showMessageDialog(null, "Raiz Cuadrada de num2: " + operaciones.raizCuadradaNum2());
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Raiz Cubica de num1: " + operaciones.raizCubica());
                    JOptionPane.showMessageDialog(null, "Raiz Cubica de num2: " + operaciones.raizCubicaNum2());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese numeros validos");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
