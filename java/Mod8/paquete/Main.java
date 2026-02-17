package paquete;


import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	 private static final String ARCHIVO = "biblioteca.ser";
	 HashMap<Integer , Libro> libros = new HashMap<>();
	 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Gestionador gestionador = new Gestionador();
		
		boolean salir = false;
		// Bucle infinito que se ejecuta hasta que la variable 'salir'
		while(salir == false) {
		System.out.println("\n--- MENÚ BIBLIOTECA ---");
        System.out.println("1. Añadir nuevo libro");
        System.out.println("2. Mostrar todos los libros");
        System.out.println("3. Buscar libro por título o autor");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        
        int opcion = scanner.nextInt();
        switch(opcion) {
        
        case 1:
        	gestionador.añadirLibro(scanner);
        	break;
        case 2:
        	gestionador.mostrarLibros();
        	break;
        case 3:
        	gestionador.buscarLibro(scanner);
        	break;
        case 4:
        	salir = true;
        	System.out.println("Salir");
        	break;
        	
        	
	}
        
}
		scanner.close();
}
	
}