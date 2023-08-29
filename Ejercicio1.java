import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
//Ejercicio 1

public class Ejercicio1 {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego = new JuegoAdivinaNumero();
        juego.iniciarJuego();
    }
}

class JuegoAdivinaNumero {
    private int numeroAdivinar;
    private int intentos;
    private boolean adivinado;
    
    public JuegoAdivinaNumero() {
        Random random = new Random();
        numeroAdivinar = random.nextInt(500) + 1;
        intentos = 0;
        adivinado = false;
    }
    
    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a Adivina el Numero!");
        System.out.println("Estoy pensando en un numero entre 1 y 500. ¡Adivina cual es!");
        
        while (!adivinado) {
            try {
                System.out.print("Introduce tu intento: ");
                int intento = scanner.nextInt();
                intentos++;
                
                if (intento < numeroAdivinar) {
                    System.out.println("El numero que debes adivinar es mayor.");
                } else if (intento > numeroAdivinar) {
                    System.out.println("El numero que debes adivinar es menor.");
                } else {
                    adivinado = true;
                    System.out.println("Felicidades! Has adivinado el numero " + numeroAdivinar +
                                       " en " + intentos + " intentos.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Debes introducir un numero.");
                scanner.next();
            }
        }
        
        scanner.close();
    }
}
