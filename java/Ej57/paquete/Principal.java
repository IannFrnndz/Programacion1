package paquete;

public class Principal {
public static void main(String[] args) {
	
	Persona persona = new Persona("Nombre de Persona ", "Persona");
	
	persona.mostrarDatos();
	
	Profesor profesor = new Profesor("Miguel Angel", "Profesor");
	
	profesor.mostrarDatos();
	
	Estudiante estudiante = new Estudiante("Ian ", "Estudiante");
	
	estudiante.mostrarDatos();
}
	public static void verificarTipo(Persona persona) {
        if (persona instanceof Estudiante) {
            System.out.println(persona.nombre + " es un Estudiante");
        } else if (persona instanceof Profesor) {
            System.out.println(persona.nombre + " es un Profesor");
        } else {
            System.out.println(persona.nombre + " es una Persona");
        }
        
        verificarTipo(persona);
        verificarTipo(Profesor);
        

}
}
