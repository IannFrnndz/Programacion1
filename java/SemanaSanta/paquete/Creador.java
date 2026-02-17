package paquete;

import java.util.ArrayList;

public class Creador {

	protected int id;
	protected String nombreC;
	protected ArrayList<Contenido> contenido;
	protected ArrayList<Colaboracion> colaboracion;
	
	public Creador(int id, String nombreC ) {
		this.id = id;
		this.nombreC = nombreC;
		
		this.contenido = new ArrayList<>();
		this.colaboracion = new ArrayList<>();
		
	}
	
	public int getId() {
		return id;
	}
	
	public void MostrarCreador() {
		System.out.println("El credor de contenido "+ nombreC + "\n Con ID: " + id);
	}
}
