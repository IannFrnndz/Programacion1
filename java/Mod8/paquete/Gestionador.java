package paquete;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Gestionador {
	static HashMap<Integer , Libro> libros = new HashMap<>();
	
	static Scanner scanner = new Scanner(System.in);
	
	public void añadirLibro(Scanner scanner) {
		System.out.print("Título: ");
        String titulo = scanner.nextLine();
        scanner.nextLine();
        
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        scanner.nextLine();
        
        System.out.print("ISBN: ");
        String ISBN = scanner.nextLine();
        scanner.nextLine();
        
        System.out.print("Año de publicación: ");
        int ano_publicacion = scanner.nextInt();;
        
        Libro libro = new Libro(titulo, autor, ISBN, ano_publicacion);
        libros.put(null, libro);
        System.out.println("Libro añadido correctamente.");
	}
	
	public void mostrarLibros() {
		if (libros.isEmpty()){
		System.out.println("no hay ningun Libro registrado");
		}else {
		for (Libro libro : libros.values()) {
		libro.mostrar();
		System.out.println("___________________");
		}
		}
		}
	
	public static void buscarLibro(Scanner scanner) {
	    System.out.print("Introduce título o autor a buscar: ");
        String busqueda = scanner.nextLine().toLowerCase();

        boolean encontrado = false;
        for (Libro libro : libros.values()) {
            if (libro.getTitulo().toLowerCase().contains(busqueda) ||
                libro.getAutor().toLowerCase().contains(busqueda)) {
                System.out.println(libro);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Libro no encontrado");
        }
    }
	
	// Serialización
    private void guardarLibros() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(libros);
        } catch (IOException e) {
            System.err.println("Error al guardar los libros: " + e.getMessage());
        }
    }
    private static final String ARCHIVO = "biblioteca.ser";
    // Deserialización
    @SuppressWarnings("unchecked")
	private void cargarLibros() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            libros = (HashMap<Integer, Libro>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los libros: " + e.getMessage());
        }
    }
	
}
