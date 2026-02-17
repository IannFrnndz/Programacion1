package paquete;

public class Estudiante extends Persona{
public Estudiante(String nombre, String cargo) {
	super(nombre, cargo);
	
}

@Override

public void mostrarDatos() {
	System.out.println("Nombre estudiante: " +nombre);
	System.out.println("Cargo: " +cargo);
}
}
