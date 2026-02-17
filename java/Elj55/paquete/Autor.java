package paquete;

public class Autor {
protected String nombre;
protected String nacionalidad;

public Autor(String nombre, String nacionalidad) {
	this.nombre = nombre;
	this.nacionalidad = nacionalidad;
	
}

public void mostrarDatos() {
	System.out.println("Nombre: "+ nombre);
	System.out.println("Nacionalidad: "+ nacionalidad);
}
}
