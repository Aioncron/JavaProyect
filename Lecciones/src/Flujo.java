import java.util.*;

public class Flujo {

    public static void main(String[] args) {

        final Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad, porfavor");
        int edad = entrada.nextInt();

        if (edad < 40) {
            System.out.println("Ees joven");
        } else if (edad < 65) {
            System.out.println("Eres maduro");
        } else {
            System.out.println("Cuidate");
        }

    }
}
