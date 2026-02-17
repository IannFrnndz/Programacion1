package paquete;

import java.util.HashMap;
import java.util.Scanner;

public class Gestionador {

	HashMap<Integer , Vehiculo> vehiculos = new HashMap<>();
	
	
	public Gestionador() {
		vehiculos.put(1, new Autobus(1, 2015, 50, true));
	    vehiculos.put(2, new Furgoneta(2, 2018, 3, "Paquetería"));
	    vehiculos.put(3, new Autobus(3, 2020, 45, false));
	    vehiculos.put(4, new Furgoneta(4, 2017, 2, "Alimentos refrigerados"));
	}
	
	// dar de alta un autobus
	public void darDeAltaAutobus(Scanner scanner) {
		
		System.out.println("Ingresa el codigo de autobus: ");
		int codigo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingresa el año de creacion del autobus: ");
		int ano = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingresa el numero de plazas del autobus: ");
		int plazas = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Esta el autobus adaptado? (true/false): ");
		Boolean adaptado = scanner.nextBoolean();
		scanner.nextLine();
		
		// en el caso de que exista el codigo del vehiculo lanza un error
		if(vehiculos.containsKey(codigo)) {
			System.out.println("El autobus ya está registrado");
			}else {
			Vehiculo nuevoAutobus= new Autobus(codigo, ano, plazas, adaptado);

			vehiculos.put(codigo, nuevoAutobus);
			System.out.println("vehiculo registrado");
			}
	}
	
	// dar de alta una furgoneta
	public void darDeAltaFurgoneta(Scanner scanner) {
		
		System.out.println("Ingresa el codigo de la furgoneta: ");
		int codigo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingresa el año de creacion de la fugoneta: ");
		int ano = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingresa el numero de plazas de la furgoneta: ");
		int plazas = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingresa la carga que lleva esta furgoneta: ");
		String carga = scanner.nextLine();
		scanner.nextLine();
		
		// en el caso de que exista el codigo del vehiculo lanza un error
		if(vehiculos.containsKey(codigo)) {
			System.out.println("La furgoneta ya está registrada");
			}else {
			Vehiculo nuevaFurgo= new Furgoneta(codigo, ano, plazas, carga);

			vehiculos.put(codigo, nuevaFurgo);
			System.out.println("vehiculo registrado");
			}
	}
	
	public Vehiculo buscarVehiculo(int codigo) {
		Vehiculo vehiculo = vehiculos.get(codigo);
		if(vehiculo!= null) {
		System.out.println("vehiculo encontrado");
		vehiculo.mostrar();
		}else {
		System.out.println("El vehiculo no existe");
		}
		// Retornamos el vehiculo encontrado
		return vehiculo;
		}
	
	// Para mostrar todos los vehiculos que tenemos registrados 
	public void mostrarVehiculos() {
		if (vehiculos.isEmpty()){
			System.out.println("no hay ningun vehiculo registrado");
			
		}else {
			for (Vehiculo vehiculo : vehiculos.values()) {
				vehiculo.mostrar();
				System.out.println("___________________");
			}
		}
	}
	
	
	public void eliminarVehiculo(int codigo) {
		if(vehiculos.containsKey(codigo)) {
			vehiculos.remove(codigo);
			System.out.println("Vehiculo eliminado");
		}else {
			System.out.println("El vehiculo con codigo (" + codigo + ") no existe");
		}
		
	}
	
}
