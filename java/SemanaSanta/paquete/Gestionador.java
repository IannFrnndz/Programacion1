package paquete;


import java.util.ArrayList;
import java.util.Scanner;

public class Gestionador {

	ArrayList<Creador> creador = new ArrayList<>();
	
	public void agregarCreador(Scanner scanner) {
		
		System.out.println("Ingresa el ID del creador: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		
	    for (Creador c : creador) {
	        if (c.getId() == id) {
	            System.out.println("Este creador ya existe");
	            return;
	        }
	    }
	    System.out.print("Ingresa el nombre del creador: ");
	    String nombreC = scanner.nextLine();
		scanner.nextLine();
		

	}
}
