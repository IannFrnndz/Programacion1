package paquete;

public class Principal {
public static void main(String[] args) {
	Autor autor = new Autor("Jeff Kenny", "Americano");
	
	Libro libro = new Libro(autor);
	
	libro.mostrarDatos();
}
}
