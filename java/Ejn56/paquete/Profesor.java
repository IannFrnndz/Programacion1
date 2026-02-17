package paquete;

public class Profesor extends Persona{
	protected String asignatura;
	public Profesor(String nombre, String asignatura) {
		super(nombre);
		this.asignatura = asignatura;
	}
	
	@Override
	
	public void mostrarDatos() {
		System.out.println("Nombre profesor: "+ nombre);
		System.out.println("Asignatura : "+ asignatura);
	}
}
