package paquete;

public class Publicacion extends Contenido {

	protected String nombreMarca;
	protected String producto;
	
	public Publicacion(String titulo, String fechaPublicacion, String plataforma, String nombreMarca, String producto) {
		super(titulo, fechaPublicacion, plataforma);
		this.nombreMarca = nombreMarca;
		this.producto = producto;
	}
	
	
	@Override
	public void mostrar() {
		
		System.out.println("El contenido de " + titulo + "\nSe publicó el  " + fechaPublicacion+ "\nEn la plataforma de "+ plataforma + "\nNombre de la marca: "+ nombreMarca + "\nProducto: "+ producto);


	}

}
