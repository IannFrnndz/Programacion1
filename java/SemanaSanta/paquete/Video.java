package paquete;

public class Video extends Contenido {

	protected String nombre;
	protected int minutos;
	
	public Video(String titulo, String fechaPublicacion, String plataforma, String nombre, int minutos) {
		super(titulo, fechaPublicacion, plataforma);
		this.nombre = nombre;
		this.minutos = minutos;
	}
	
	@Override
	public void mostrar() {
		
		System.out.println("El contenido de " + titulo + "\nSe publicó el  " + fechaPublicacion+ "\nEn la plataforma de "+ plataforma + "\nNombre del video: "+ nombre + "\nTiene una duracion de: "+ minutos);

	}

}
