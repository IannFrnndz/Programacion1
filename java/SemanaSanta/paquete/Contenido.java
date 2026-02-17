package paquete;

public abstract class Contenido {

	
	protected String titulo;
	protected String fechaPublicacion;
	protected String plataforma;
	
	public Contenido(String titulo, String fechaPublicacion, String plataforma) {
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
		this.plataforma = plataforma;
	}
	public abstract void mostrar();
}
