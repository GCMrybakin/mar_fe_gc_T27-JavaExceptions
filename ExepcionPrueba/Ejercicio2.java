package ExepcionPrueba;
import ExepcionPrueba.ExepcionPrueba1;
//Ejercicio 2

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            System.out.println("Mensaje mostrado por pantalla");
            throw new ExepcionPrueba1("Esto es un objeto Exception");
        } catch (ExepcionPrueba1 e) {
            System.out.println("Excepcion capturada con mensaje: " + e.getMessage());
        } finally {
            System.out.println("Programa terminado");
        }
    }
}
