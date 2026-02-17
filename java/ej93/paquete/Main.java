package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		int sumaTotal = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("numeros.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    int numero = Integer.parseInt(linea.trim());
                    sumaTotal += numero;
                } catch (NumberFormatException e) {
                    System.err.println("Línea inválida (no es un número entero): " + linea);
                }
            }
            System.out.println("La suma total es: " + sumaTotal);
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
    }
	

}
