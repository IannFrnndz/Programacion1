package paquete;

public class Principal {
public static void main(String[] args) {
	
	Vehiculo vehiculo = new Vehiculo("Audi", "A8");
	
	vehiculo.mostrarDatos();
	
	Coche coche = new Coche("Porsche", "911", 2);
	
	coche.mostrarDatos();
	
	coche.describir();
}
}
