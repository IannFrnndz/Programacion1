package paquete;

public class Persona {
protected String nombre;
protected String cargo;

public Persona(String nombre, String cargo) {
	this.nombre = nombre;
	this.cargo = cargo;
	
}
public void mostrarDatos() {
	System.out.println("Nombre: " +nombre);
	System.out.println("Cargo: " +cargo);
}
}
