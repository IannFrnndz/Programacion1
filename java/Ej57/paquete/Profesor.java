package paquete;

public class Profesor extends Persona{
	public Profesor(String nombre, String cargo) {
		super(nombre, cargo);
		
	}

	@Override

	public void mostrarDatos() {
		System.out.println("Nombre profesor: " +nombre);
		System.out.println("Cargo: " +cargo);
	}
}
