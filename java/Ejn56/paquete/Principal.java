package paquete;

public class Principal {
public static void main(String[] args) {
	Persona persona = new Persona("Ian");
	
	persona.mostrarDatos();
	
	Profesor profesor = new Profesor("Miguel Angel", "Programacion");
	
	profesor.mostrarDatos();
}
	
}
