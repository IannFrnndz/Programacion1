package paquete;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Movible> vehiculos = new ArrayList<>();
		
		vehiculos.add(new Coche("AAAAA"));
		vehiculos.add(new Bicicleta("BBBB"));
		
		for (Movible vehi : vehiculos) {
			vehi.mover();
		}
	}

}
