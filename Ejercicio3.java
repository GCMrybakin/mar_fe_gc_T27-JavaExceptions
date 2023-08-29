import java.util.Random;
//Ejercicio 3

class ParImparException extends Exception {
    public ParImparException(String message) {
        super(message);
    }
}

class NumeroAleatorio {
    private int numero;

    public NumeroAleatorio() {
        Random random = new Random();
        this.numero = random.nextInt(1000);
    }

    public void verificarParImpar() throws ParImparException {
        if (numero % 2 == 0) {
            throw new ParImparException("El numero generado es: " + numero + " Es par");
        } else {
            throw new ParImparException("El numero generado es: " + numero + " Es impar");
        }
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Generando numero aleatorio...");
        try {
            NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
            numeroAleatorio.verificarParImpar();
        } catch (ParImparException e) {
            System.out.println(e.getMessage());
        }
    }
}
