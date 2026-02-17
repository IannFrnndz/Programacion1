import java.util.Scanner;

public class Multiplicar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        	// va a leer el numero que se inyecta
            int numero = sc.nextInt(); 

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

        } catch (Exception e) {
            System.err.println("Error: entrada no válida. Debes ingresar un número entero.");
        } finally {
            sc.close();
        }
    }
}
