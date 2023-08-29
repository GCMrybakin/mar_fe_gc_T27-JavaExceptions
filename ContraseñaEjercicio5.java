import java.util.Random;
import java.util.Scanner;
// Ejercicio 5
class Contraseña {
    private int longitud;
    private String contraseña;

    public Contraseña() {
        longitud = 8;
        generarContraseña();
    }

    public Contraseña(int longitud) {
        this.longitud = longitud;
        generarContraseña();
    }

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    public void generarContraseña() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int type = random.nextInt(3);

            if (type == 0) {
                sb.append((char) (random.nextInt(26) + 'A'));
            } else if (type == 1) {
                sb.append((char) (random.nextInt(26) + 'a'));
            } else {
                sb.append(random.nextInt(10));
            }
        }

        contraseña = sb.toString();
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarContraseña();
    }
}

public class ContraseñaEjercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = scanner.nextInt();

        System.out.print("Ingrese el tamaño del array de Contraseñas: ");
        int tamañoArray = scanner.nextInt();

        Contraseña[] passwords = new Contraseña[tamañoArray];
        boolean[] esFuerteArray = new boolean[tamañoArray];

        for (int i = 0; i < tamañoArray; i++) {
            passwords[i] = new Contraseña(longitud);
            esFuerteArray[i] = passwords[i].esFuerte();
        }

        System.out.println("Contraseñas generadas:");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println(passwords[i].getContraseña() + " " + esFuerteArray[i]);
        }
    }
}
