package paquete;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Gestionador gestionador = new Gestionador();
		
		Scanner scanner = new Scanner(System.in);
		
		Boolean salir = false;
		
		while(salir == false) {
			System.out.println("\n==== MENÚ VEHÍCULOS ====");
			System.out.println("1.	Dar de alta un vehiculo");
			System.out.println("2.  Mostrar todos los vehiculos");
			System.out.println("3. 	Buscar un vehiculo");
			System.out.println("4.  Eliminar un vehiculo");
			System.out.println("5.  Salir");
			System.out.print("Elige una opción: ");
			
			
			int opcion = scanner.nextInt();
			
			
			switch(opcion) {
			case 1 : // Añadir vehiculo
				
				System.out.println("¿Qué tipo de vehículo quieres añadir?");
                System.out.println("1. Autobús");
                System.out.println("2. Furgoneta");
                int tipo = scanner.nextInt();
                
                if( tipo == 1) {
                	gestionador.darDeAltaAutobus(scanner);
                }else if(tipo == 2){
                	gestionador.darDeAltaFurgoneta(scanner);
                }else {
                	System.out.println("ERROR, ingrese un valor valido");
                	
                }
                break;
			
			case 2:// Mostrar todos los vehiculos
				System.out.println("LISTA DE VEHICULOS: \n");
				gestionador.mostrarVehiculos();
				break;
				
			case 3:// Buscar un vehiculo concreto
				System.out.println("Introcuce el codigo a buscar: ");
				int codigo = scanner.nextInt();
				gestionador.buscarVehiculo(codigo);
				break;
			
				
			case 4: // Eliminar un vehiculo
				System.out.println("Introcuce el codigo de vehiculo a eliminar: ");
				codigo = scanner.nextInt();
				gestionador.eliminarVehiculo(codigo);
				break;
				
			case 5: // Salir
				salir = true;
				System.out.println("Salir");
				break;
			}
		}
		scanner.close();

	}

}
