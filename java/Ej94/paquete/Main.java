package paquete;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo a abrir: ");
        String nombreArchivo =scanner.nextLine();

        File archivo = new File(nombreArchivo);

        try (Scanner lectorArchivo = new Scanner(archivo)) {
            System.out.println("Contenido del archivo:");
            while (lectorArchivo.hasNextLine()) {
                System.out.println(lectorArchivo.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo '" + nombreArchivo + "' no existe o no se puede abrir.");
        }

        
        scanner.close();
	}

}
