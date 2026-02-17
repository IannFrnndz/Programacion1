package paquete;

public class Libro {
protected Autor autor;

public Libro (Autor autor) {
	this.autor = autor;
	
}
public void mostrarDatos() {
	autor.mostrarDatos();
}
}
